package week7homework;

import java.util.Scanner;

public class AI_CityNameWithSwitchStmt {
    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        System.out.println("Enter Any Character from A to F: ");
        Scanner scn = new Scanner(System.in);
        String c = scn.next();

        switch (c) {
            case "A":
                System.out.println("Amsterdam");
                break;
            case "B":
                System.out.println("Boston");
                ;
                break;
            case "C":
                System.out.println("Cairo");
                ;
                break;
            case "D":
                System.out.println("Delhi");
                ;
                break;
            case "E":
                System.out.println("Ernakulam");
                ;
                break;
            case "F":
                System.out.println("Frankfurt");
                ;
                break;
            case "a":
                System.out.println("Amsterdam");
                break;
            case "b":
                System.out.println("Boston");
                ;
                break;
            case "c":
                System.out.println("Cairo");
                ;
                break;
            case "d":
                System.out.println("Delhi");
                ;
                break;
            case "e":
                System.out.println("Ernakulam");
                ;
                break;
            case "f":
                System.out.println("Frankfurt");
                ;
                break;
            default:
                System.out.println("Invalid Input");
        }

        scn.close();
    }
}