class PlaceOrderCommand implements OrderCommand {
    private OrderFacade orderFacade;
    private String orderId;

    public PlaceOrderCommand(OrderFacade orderFacade, String orderId) {
        this.orderFacade = orderFacade;
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        orderFacade.placeOrder(orderId);
    }
}
