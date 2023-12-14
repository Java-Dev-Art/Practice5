public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {
    private Product product;
    private int numberOfPurchase;

    public AbstractPurchase() {
    }

    public AbstractPurchase(Product product, int numberOfPurchase) {
        this.product = product;
        this.numberOfPurchase = numberOfPurchase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfPurchase() {
        return numberOfPurchase;
    }

    public void setNumberOfPurchase(int numberOfPurchase) {
        this.numberOfPurchase = numberOfPurchase;
    }

    public abstract Euro getCost();

    @Override
    public int compareTo(AbstractPurchase o) {
        return (int) (this.getProduct().getPrice().getCents() - o.getProduct().getPrice().getCents());
    }

    @Override
    public String toString() {
        return product +
                ";" + numberOfPurchase + ".";
    }
}
