public class DiscountQuantity extends AbstractPurchase{
    private static final int MIN = 10;
    private double discountRate;

    public DiscountQuantity(double discountRate) {
        this.discountRate = discountRate;
    }

    public DiscountQuantity(Product product, int numberOfPurchase, double discountRate) {
        super(product, numberOfPurchase);
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
        if (super.getNumberOfPurchase() > MIN){
            return new Euro(super.getProduct().getPrice().getCents() - (getProduct().getPrice().getCents() * discountRate));
        }else {
            return new Euro(getProduct().getPrice().getCents());
        }
    }
}
