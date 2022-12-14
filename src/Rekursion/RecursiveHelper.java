package Rekursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecursiveHelper {
    private static int number;

    public static void main(String[] args) {
        System.out.println(multiplicate(5));
        System.out.println(multiplicate(-1));
        System.out.println(findEvenNumbers(8));
        ArrayList<Integer> numbers = (ArrayList<Integer>) findEvenNumbers(8);
        System.out.println(reorderNumbers(numbers));
    }

    public static int multiplicate(int number) {
        if (number > 1)
            return number * multiplicate(number - 1);
        else if (number <= 0) {
            return 0;
        } else
            return 1;

    }
    public static List<Integer> findEvenNumbers(int numbersCount) {
        List<Integer> numbers = new ArrayList<>();
        if (numbersCount%2==0 & numbersCount>0){
            numbers.add(numbersCount);
            numbers.addAll(findEvenNumbers(numbersCount-2));
        }
        return numbers;

    }
    public static List<Integer> reorderNumbers(ArrayList<Integer> numbers) {
        if(!numbers.isEmpty()){
            int value = numbers.remove(0);
            reorderNumbers(numbers);
            numbers.add(value);
            return numbers;
        }else return numbers;
    }
}
