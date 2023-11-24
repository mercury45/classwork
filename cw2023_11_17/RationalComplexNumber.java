public class RationalComplexNumber {
    private RationalFraction real;
    private RationalFraction image;

    public RationalFraction getImage() {
        return image;
    }

    public RationalFraction getReal() {
        return real;
    }

    public RationalComplexNumber() {
        this (new RationalFraction(), new RationalFraction());
    }

    public RationalComplexNumber(RationalFraction f1, RationalFraction f2) {
        real = f1;
        image = f2;
    }

    public RationalComplexNumber add(RationalComplexNumber z) {
        return new RationalComplexNumber(real.add(z.real), image.add(z.image));
    }

    public RationalComplexNumber sub(RationalComplexNumber z) {
        return new RationalComplexNumber(real.sub(z.real), image.sub(z.image));
    }

    public RationalComplexNumber mult(RationalComplexNumber z) {
        return new RationalComplexNumber(real.mult(z.real).sub(image.mult(z.image)), real.mult(z.image).add(image.mult(z.real)));
    }

    public String toString() {
        if (image.value() < 0) {
            return real + " " + image;
        } else {
            return real + " + " + image;
        }
    }


}
