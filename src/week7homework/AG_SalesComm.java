package week7homework;

import java.util.Scanner;

public class AG_SalesComm {

    public static void main(String[] args) {
        salesComm();

    }

    public static void salesComm() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Seller ID: ");
        int sID = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter Seller's Name: ");
        String name = scn.nextLine();
        System.out.println("Enter Sales Amount: ");
        double salamt = scn.nextDouble();
        System.out.println("Enter Basic Salary: ");
        double basicSal = scn.nextDouble();

        double commission;

        if (salamt < 10000 && salamt >= 1) {
            commission = salamt * 0.02;
            System.out.println("Sales Commission 2% = " + commission);
            System.out.println("Total : " + (basicSal + commission));
        } else if (salamt >= 10000 && salamt <= 19999) {
            commission = salamt * 0.05;
            System.out.println("Sales Commission 5% = " + commission);
            System.out.println("Total : " + (basicSal + commission));
        } else if (salamt >= 20000 && salamt <= 29999) {
            commission = salamt * 0.1;
            System.out.println("Sales Commission 10% = " + commission);
            System.out.println("Total : " + (basicSal + commission));
        } else if (salamt >= 30000 && salamt <= 49999) {
            commission = salamt * 0.2;
            System.out.println("Sales Commission 20% = " + commission);
            System.out.println("Total : " + (basicSal + commission));
        } else if (salamt >= 50000) {
            commission = salamt * 0.35;
            System.out.println("Sales Commission 35% = " + commission);
            System.out.println("Total : " + (basicSal + commission));
        } else {
            commission = salamt * 0;
            System.out.println("Sales Commission 0% = " + commission);
            System.out.println("Total : " + (basicSal + commission));
            scn.close();
        }

    }
}