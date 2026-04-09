public class Numeric<T extends Number> {

    private T num;

    public Numeric(T num) {
        this.num = num;
    }

    public double reciprocal() {
        return 1.0 / num.doubleValue();
    }

    
    public double fraction() {
        return num.doubleValue() - num.intValue();
    }

    
    public boolean absEqual(Numeric<?> other) {
        return Math.abs(this.num.doubleValue()) == Math.abs(other.num.doubleValue());
    }
}