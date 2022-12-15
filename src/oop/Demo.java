package oop;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Insurance i1 = new LiabilityInsurance("Tom Turbo", 5,2);
        Insurance i2 = new AccidentInsurance("Tom Turbo",10,"Radfahren");
        Insurance i3 = new ComprehensiveInsurance("Tom Turbo",10,7);

        Insurance i4 = new LiabilityInsurance("Fritz Fantom", 5,2);
        Insurance i5 = new AccidentInsurance("Fritz Fantom",15,"Fallschirmspringen");
        Insurance i6 = new ComprehensiveInsurance("Fritz Fantom",16,1);

        Insurance i7 = new LiabilityInsurance("Rudi Ratte", 5,2);
        Insurance i8 = new AccidentInsurance("Rudi Ratte",12,"Tauchen");
        Insurance i9 = new ComprehensiveInsurance("Rudi Ratte",7,5);
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(i1);
        insurances.add(i2);
        insurances.add(i3);
        insurances.add(i4);
        insurances.add(i5);
        insurances.add(i6);
        insurances.add(i7);
        insurances.add(i8);
        insurances.add(i9);
        Accounting ac = new Accounting(insurances);
        ac.printAll();
        System.out.println(ac.getSumCommissions());
        System.out.println(ac.getInsuranceWithHighestCommission());
        System.out.println(ac.getInsuranceForHolder());
    }
}
