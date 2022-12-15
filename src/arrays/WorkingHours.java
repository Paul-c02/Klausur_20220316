package arrays;

public class WorkingHours {
    public static void main(String[] args) {
        int[] workingHours = {8, 5, 7, 6, 9};
        int[] workingHours2 = {8, 10, 8, 8, 9};
        System.out.println("Die durchschnittliche Arbeitszeit pro Tag = " + duration(workingHours));
        System.out.println("Die höchste Stundenanzahl an einem Tag = " + maxWorkingHours(workingHours));
        System.out.println("Die Anzahl der geleisteten  Überstunden = " + overtimeWorkingHours(workingHours2));
    }

    public static double duration(int[] workingHours) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < workingHours.length; i++) {
            sum += workingHours[i];
            count++;
        }
        if (count > 0) {
            return sum / count;
        } else
            return 0;
    }

    public static int maxWorkingHours(int[] workingHours) {
        int max = 0;
        for (int i = 0; i < workingHours.length; i++) {
            if (max < workingHours[i]) {
                max = workingHours[i];
            }
        }
        return max;
    }

    public static int overtimeWorkingHours(int[] workingHours) {
        int sum = 0;
        for (int i = 0; i < workingHours.length; i++) {
            if (workingHours[i] > 8) {
                sum += (workingHours[i] - 8);
            }
        }
        return sum;
    }

}
