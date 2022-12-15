package oop;

public class LiabilityInsurance extends Insurance {
    private int people;

    @Override
    public double getCommision() {
        double com;
        if (people < 3) {
            com = getRate() * 0.5;
        } else if (people >=4 && people <7) {
            com = getRate() * 0.55 +10;
        } else {
            com = getRate() * 0.6 + 15;
        }
        return com;
    }

    public LiabilityInsurance(String holderName, double rate, int people) {
        super(holderName, rate);
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "LiabilityInsurance{" +
                "people=" + people +
                "} " + super.toString();
    }
}
