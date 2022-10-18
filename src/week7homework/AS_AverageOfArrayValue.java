package week7homework;

import java.util.Arrays;

public class AS_AverageOfArrayValue {
    public static void main(String[] args) {
        AS_AverageOfArrayValue obj = new AS_AverageOfArrayValue();
        obj.arrayAvg();

    }

    public void arrayAvg() {

        double numArray[] = {25, 10, 35, 45, 56, 66, 89, 80, 45, 1000};
        double sum = 0;
        double len = numArray.length;

        System.out.println("Numeric Array " + Arrays.toString(numArray));
        System.out.println("------------------------------------------");

        for (double i : numArray)
            sum += i;
            System.out.println("The average of numArray is " + sum/numArray.length);
    }
}
