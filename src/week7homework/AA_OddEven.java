package week7homework;

import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
public class AA_OddEven {

    public static void main(String[] args) {

        oddEven();
    }

    public static void oddEven() {

        System.out.print("Enter Any Number: ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        String result = a%2==0 ? "Even" : "Odd";

        System.out.println("Given Number is: " + result);

        scn.close();
    }


}
