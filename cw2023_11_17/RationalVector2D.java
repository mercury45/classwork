public class RationalVector2D {
    private RationalFraction x;
    private RationalFraction y;
    public RationalVector2D() {
        this(new RationalFraction(),new RationalFraction());
    }
    public RationalVector2D(RationalFraction fraction1, RationalFraction fraction2) {
        x = fraction1;
        y = fraction2;
    }

    public RationalFraction getX() {
        return x;
    }

    public RationalFraction getY() {
        return y;
    }

    public RationalVector2D add(RationalVector2D other) {
        RationalFraction fraction1 = this.x.add(other.x);
        RationalFraction fraction2 = this.y.add(other.y);
        return new RationalVector2D(fraction1, fraction2);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double length() {
        RationalFraction fract1Pow = x.mult(x);
        RationalFraction fract2Pow = y.mult(y);
        return Math.sqrt(fract1Pow.value() + fract2Pow.value());
    }

    public RationalFraction scalarProduct(RationalVector2D vector2D) {
        RationalFraction fract1Pow = x.mult(vector2D.x);
        RationalFraction fract2Pow = y.mult(vector2D.y);
        return fract1Pow.add(fract2Pow);
    }

    public boolean equals(RationalVector2D vector2D) {
        return x.equals(vector2D.x) && y.equals(vector2D.y);
    }
}