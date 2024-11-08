public class ConsoleView {
    public void displayProduct(String productName) {
        System.out.println("Displaying product: " + productName);
    }

    public void displayOrderStatus(String orderId, String status) {
        System.out.println("Order " + orderId + " is currently " + status);
    }

    public void displayCustomerNotification(String customerName, String message) {
        System.out.println(customerName + ": " + message);
    }
}
