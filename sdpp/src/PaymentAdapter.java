class PaymentAdapter implements PaymentProcessor {
    private ExternalPaymentService externalService;

    public PaymentAdapter(ExternalPaymentService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void processPayment(double amount) {
        externalService.makePayment(amount);
    }
}