import java.util.Objects;

public class Euro implements Comparable<Euro> {
    private final double cents;

    public Euro(double cents) {
        this.cents = cents;
    }

    public double getCents() {
        return cents;
    }

    @Override
    public String toString() {
        return String.format("%f.%2f Euro", getCents() / 100, getCents() % 100);
    }

    @Override
    public int compareTo(Euro o) {
        return (int) (this.getCents() - o.getCents());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Euro)) return false;
        Euro euro = (Euro) o;
        return Double.compare(euro.cents, cents) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cents);
    }
}
