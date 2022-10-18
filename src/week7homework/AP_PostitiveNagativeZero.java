package week7homework;

import java.util.Scanner;

public class AP_PostitiveNagativeZero {
    public static void main(String[] args) {
        numberPNZ();
    }
    public static void numberPNZ(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Any Number Value: ");
        double x = scn.nextDouble();
        if(x == 0 ){
            System.out.println("Entered Number is Zero");
        } else if (x < 0) {
            System.out.println("Entered Number is Negative");
        }else {
            System.out.println("Entered Number is Positive");
        }
        scn.close();
    }
}
