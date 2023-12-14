public class DiscountedPurchase extends AbstractPurchase {
    private double discountRate;

    public DiscountedPurchase(Product product, int numberOfPurchase, double discountRate) {
        super(product, numberOfPurchase);
        this.discountRate = discountRate;
    }

    public DiscountedPurchase(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public Euro getCost() {
        return new Euro(super.getProduct().getPrice().getCents() - (super.getProduct().getPrice().getCents() * discountRate));
    }

    @Override
    public String toString() {
        return "DiscountedPurchase{" +
                "discountRate=" + discountRate +
                '}';
    }
}
