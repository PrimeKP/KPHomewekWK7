package week7homework;

import java.util.Scanner;

public class AJ_CalculationWithOperator {

    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        System.out.print("Enter Number 1  :  ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.print("Enter Number 2  :  ");
        int b = scn.nextInt();
        System.out.print("Eneter Operator :  ");
        char o = scn.next().charAt(0);
        int x;

        if (o == '+') {
            x = a + b;
            System.out.println("Result " + a + " + " + b + " = " + x);
        } else if (o == '-') {
            x = a - b;
            System.out.println("Result " + a + " - " + b + " = " + x);
        } else if (o == '*') {
            x = a * b;
            System.out.println("Result " + a + " x " + b + " = " + x);
        } else if (o == '/') {
            x = a / b;
            System.out.println("Result " + a + " ÷ " + b + " = " + x);
        }else{
            System.out.println("");
        }
        scn.close();

    }
}