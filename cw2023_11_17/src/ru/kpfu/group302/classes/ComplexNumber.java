package ru.kpfu.group302.classes;

public class ComplexNumber {
    private double real;
    private double image;
    public ComplexNumber() {
        this(0, 0);
    }
    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.real, image + number.image);
    }

    public void add2(ComplexNumber number) {
        real += number.real;
        image += number.image;
    }

    public ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(real - number.real, image - number.image);
    }

    public void sub2(ComplexNumber number) {
        real -= number.real;
        image -= number.image;
    }
    
    public ComplexNumber multNumber(double num) {
        return new ComplexNumber(real * num, image * num);
    }

    public void multNumber2(double num) {
        real *= num;
        image *= num;
    }



    public ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(real * number.real - image * number.image, real * number.image + image * number.real);
    }

    public void mult2(ComplexNumber number) {
        real = real * number.real - image * number.image;
        image = real * number.image + image * number.real;
    }

    public ComplexNumber div(ComplexNumber number) {
        if ((number.real * number.real + number.image * number.image) != 0) {
            return new ComplexNumber((real * number.real + image * number.image) / (number.real * number.real + number.image * number.image), (image * number.real - real * number.image) / ((number.real * number.real + number.image * number.image)));
        } else {
            return null;
        }
    }

    public void div2(ComplexNumber number) {
        if (number.real * number.real + number.image * number.image != 0) {
            real = (real * number.real + image * number.image) / (number.real * number.real + number.image * number.image);
            image = (image * number.real - real * number.image) / (number.real * number.real + number.image * number.image);
        }
    }

    public double length() {
        return Math.sqrt(real*real + image*image);
    }

    public String toString() {
        if (image < 0) {
            return real + " " + image + " * i";
        } else {
            return real + " + " + image + " * i";
        }
    }

    public double arg() {
        double arctg = Math.atan(Math.abs(image / real));
        double arg = arctg;
        if (real > 0) {
            if (image >= 0) {
                arg = arctg;
            } else {
                arg = 2 * Math.PI - arctg;
            }
        } else if (real < 0) {
            if (image < 0) {
                arg = Math.PI + arctg;
            } else {
                arg = Math.PI - arctg;
            }
        } else {
            if (image > 0) {
                arg = Math.PI / 2;
            } else if (image < 0) {
                arg = Math.PI / 2 * 3;
            }
        }
        return arg;
    }

    public ComplexNumber pow(double power) {
        double module = Math.pow(this.length(), power);
        double cos = Math.cos(power * this.arg());
        double sin = Math.sin(power * this.arg());
        ComplexNumber number = new ComplexNumber(module * cos, module * sin);
        return number;
    }

    public boolean equals(ComplexNumber number) {
        if (Helper.round(real) == Helper.round(number.real) && Helper.round(image) == Helper.round(number.image)) {
            return true;
        } else {
            return false;
        }
    }
}