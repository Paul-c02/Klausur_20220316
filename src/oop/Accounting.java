package oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Accounting {
    private ArrayList<Insurance> insurances = new ArrayList<>();

    public Accounting(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public void add(Insurance f) {
        insurances.add(f);
    }

    public void printAll() {
        for (Insurance i : insurances) {
            System.out.println("Name: " + i.getHolderName() + ", Rate: " + i.getRate() + ", Provision: " + i.getCommision());
        }
    }

    public double getSumCommissions() {
        double sum = 0.0;
        for (Insurance i : insurances) {
            sum += i.getCommision();
        }
        return sum;
    }

    public Insurance getInsuranceWithHighestCommission() {
        double max = 0.0;
        Insurance highCom = null;
        for (Insurance i : insurances) {
            if (i.getCommision() > max) {
                max = i.getCommision();
                highCom = i;
            }
        }

        return highCom;
    }

    public HashMap<String, Double> getInsuranceForHolder() {
        HashMap<String, Double> result = new HashMap<>();
        for (Insurance i : insurances) {
            String holder = i.getHolderName();
            Double rate;
            if (result.containsKey(holder)) rate = result.get(holder);
            else rate = 0.0;
            rate += i.getRate();
            result.put(holder, rate);
        }
        return result;
    }
}
