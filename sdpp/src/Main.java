import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        EcommerceController controller = new EcommerceController(view);


        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");


        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        controller.addProduct("Electronics");
        controller.addProduct("Furniture");

        ExternalPaymentService externalPaymentService = new ExternalPaymentService();
        PaymentProcessor paymentProcessor = new PaymentAdapter(externalPaymentService);
        paymentProcessor.processPayment(99.99);


        OrderFacade orderFacade = new OrderFacade();
        String orderId = "12345";
        orderFacade.placeOrder(orderId);


        controller.placeOrder(orderId, customer1, customer2);


        controller.updateOrderStatus(orderId, "Shipped");


        OrderInvoker orderInvoker = new OrderInvoker();
        OrderCommand placeOrderCommand = new PlaceOrderCommand(orderFacade, orderId);

        orderInvoker.setCommand(placeOrderCommand);
        orderInvoker.executeCommand();

        System.out.println("E-commerce system demonstration complete.");
    }
}
