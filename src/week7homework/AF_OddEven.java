package week7homework;

import java.util.Scanner;

public class AF_OddEven {
    public static void main(String[] args) {
        oddEven();

    }
    public static void oddEven(){
        int x;
        System.out.print("Enter Any Number: ");
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        if(x % 2 ==0){
            System.out.println("Number " + x + " is even number");

        }else {
            System.out.println("Number " + x + " is odd number");
            scn.close();
        }
    }
}
