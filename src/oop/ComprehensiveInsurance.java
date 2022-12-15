package oop;

public class ComprehensiveInsurance extends Insurance{
    private int riskLevel;

    public ComprehensiveInsurance(String holderName, double rate, int riskLevel) {
        super(holderName, rate);
        this.riskLevel = riskLevel;
    }

    @Override
    public double getCommision() {
        return getRate()*0.2;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(int riskLevel) {
        this.riskLevel = riskLevel;
    }
    @Override
    public double getRate() {
        double rate = super.getRate();
        if (riskLevel>5) {
            return rate * 1.25;
        } else if (riskLevel<=1) {
            return rate*0.8;
        } else
            return rate;
    }

    @Override
    public String toString() {
        return "ComprehensiveInsurance{" +
                "riskLevel=" + riskLevel +
                "} " + super.toString();
    }
}
