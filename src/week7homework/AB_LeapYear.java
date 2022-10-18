package week7homework;

import java.util.Scanner;

/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class AB_LeapYear {

    public static void main(String[] args) {

        AB_LeapYear obj = new AB_LeapYear();

        obj.leapYear();

    }
    public void leapYear(){

        System.out.print("Please Enter Year: ");

        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();

        if(num%4==0){

            System.out.println("Year is a Leap Year");

        }else{

            System.out.println("This is not a Leap Year");

            scn.close();
        }

    }



}
