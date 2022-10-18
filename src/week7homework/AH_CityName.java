package week7homework;

import java.util.Scanner;

public class AH_CityName {
    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        System.out.println("Enter Any Character from A to F: ");
        Scanner scn = new Scanner(System.in);
        char c = scn.next().charAt(0);

        if (c == 'A' || c == 'a') {
            System.out.println("Amsterdam");
        } else if ((c == 'B' || c == 'b')) {
            System.out.println("Boston");
        } else if ((c == 'C' || c == 'c')) {
            System.out.println("Cairo");
        } else if ((c == 'D' || c == 'd')) {
            System.out.println("Delhi");
        } else if ((c == 'E' || c == 'e')) {
            System.out.println("Ernakulam");
        } else if ((c == 'F' || c == 'f')) {
            System.out.println("Frankfurt");
        }else {
            System.out.println("Invalid Input");
        }

        scn.close();
    }
}
