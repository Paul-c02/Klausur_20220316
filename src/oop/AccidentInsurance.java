package oop;

public class AccidentInsurance extends Insurance {
    private String hobby;

    public AccidentInsurance(String holderName, double rate, String hobby) {
        super(holderName, rate);
        this.hobby = hobby;
    }

    @Override
    public double getCommision() {
        double com;
        switch (hobby) {
            case "Fallschirmspringen":
                com = getRate() * 0.5;
                break;
            case "Radfahren":
                com = getRate() * 0.3;
                break;
            case "Rennradfahren":
                com = getRate() * 0.35;
                break;
            case "Schifahren":
                com = getRate() * 0.41;
                break;
            default:
                com = getRate() * 0.4;
        }
        return com;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public double getRate() {
        double rate = super.getRate();
        if (hobby.toLowerCase().contains("rad")) {
            return rate * 1.2;
        } else
            return rate;
    }

    @Override
    public String toString() {
        return "AccidentInsurance{" +
                "hobby='" + hobby + '\'' +
                "} " + super.toString();
    }
}
