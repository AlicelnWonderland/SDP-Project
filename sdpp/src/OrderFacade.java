class OrderFacade {
    private OrderProcessor orderProcessor;
    private ShippingService shippingService;

    public OrderFacade() {
        orderProcessor = new OrderProcessor();
        shippingService = new ShippingService();
    }

    public void placeOrder(String orderId) {
        orderProcessor.processOrder(orderId);
        shippingService.shipOrder(orderId);
    }
}