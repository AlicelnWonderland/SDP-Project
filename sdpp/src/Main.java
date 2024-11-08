import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. Singleton: Database connection instance
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();


        Product electronics = ProductFactory.createProduct("Electronics");
        electronics.create();

        Product furniture = ProductFactory.createProduct("Furniture");
        furniture.create();


        ExternalPaymentService externalPaymentService = new ExternalPaymentService();
        PaymentProcessor paymentProcessor = new PaymentAdapter(externalPaymentService);
        paymentProcessor.processPayment(99.99);


        OrderFacade orderFacade = new OrderFacade();
        String orderId = "12345";
        orderFacade.placeOrder(orderId);


        Order order = new Order();
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        order.addObserver(customer1);
        order.addObserver(customer2);


        order.setStatus("Processing");
        order.setStatus("Shipped");


        OrderInvoker orderInvoker = new OrderInvoker();
        OrderCommand placeOrderCommand = new PlaceOrderCommand(orderFacade, orderId);

        orderInvoker.setCommand(placeOrderCommand);
        orderInvoker.executeCommand();

        System.out.println("E-commerce system demonstration complete.");
    }
}
