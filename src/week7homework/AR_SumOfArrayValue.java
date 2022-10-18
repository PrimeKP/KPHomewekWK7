package week7homework;

import java.util.Arrays;

public class AR_SumOfArrayValue {
    public static void main(String[] args) {
        AR_SumOfArrayValue obj = new AR_SumOfArrayValue();
        obj.arraySum();

    }
    public void arraySum(){

        int numArray[] = {25, 10, 35, 45, 56, 66, 89, 80, 45, 1000};
        int sum = 0;

        System.out.println("Numeric Array " + Arrays.toString(numArray));
        System.out.println("------------------------------------------");

        for (int i : numArray)
            sum += i;
        System.out.println("The sum of numArray is " + sum);
    }
}
