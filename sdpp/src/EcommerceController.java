public class EcommerceController {
    private ConsoleView view;
    private Order order;

    public EcommerceController(ConsoleView view) {
        this.view = view;
    }

    // Adding a product
    public void addProduct(String productType) {
        Product product = ProductFactory.createProduct(productType);
        product.create();
        view.displayProduct(productType);
    }

    
    public void placeOrder(String orderId, Customer... customers) {
        order = new Order();

        for (Customer customer : customers) {
            order.addObserver(customer);
        }

        order.setStatus("Processing");
        view.displayOrderStatus(orderId, "Processing");
    }

    // Updating order status
    public void updateOrderStatus(String orderId, String status) {
        if (order != null) {
            order.setStatus(status);
            view.displayOrderStatus(orderId, status);
        } else {
            System.out.println("No order found to update.");
        }
    }
}
