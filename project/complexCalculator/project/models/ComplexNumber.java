package project.models;

public class ComplexNumber {
    private double real;
    private double fake;

    public ComplexNumber(double real, double fake) {
        this.real = real;
        this.fake = fake;
    }

    public double getReal() {
        return real;
    }

    public double getFake() {
        return fake;
    }

    @Override
    public String toString() {
        return real + " + " + fake + "i";
    }
}