class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "Electronics":
                return new Electronics();
            case "Furniture":
                return new Furniture();
            default:
                throw new IllegalArgumentException("Unknown product type.");
        }
    }
}