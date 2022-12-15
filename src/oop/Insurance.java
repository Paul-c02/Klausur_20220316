package oop;

public abstract class Insurance {
    private String holderName;
    private double rate;

    public Insurance(String holderName, double rate) {
        this.holderName = holderName;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public abstract double getCommision();

    @Override
    public String toString() {
        return "Insurance{" +
                "holderName='" + holderName + '\'' +
                ", rate=" + rate +
                '}';
    }
}
