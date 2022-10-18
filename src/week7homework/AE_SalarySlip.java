package week7homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AE_SalarySlip {

    public static void main(String[] args) {

        salarySlip();

    }

    public static void salarySlip(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int empID = scn.nextInt();
        System.out.println("Enter Employee Name: ");
        String empName = scn.next();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scn.nextDouble();
        double hra =  basicSalary * 0.1;
        double ta = basicSalary * 0.08;
        double da = basicSalary * 0.09;
        double pf = basicSalary * 0.2;
        double grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println("===================================");
        System.out.println("|          Salary Slip            |");
        System.out.println("-----------------------------------");
        System.out.println("| Employe           : " + empID + "        |");
        System.out.println("| Employe Name      : " + empName + "         |");
        System.out.println("|                                 |");
        System.out.println("-----------------------------------");
        System.out.println("| Basic Salary      : " + new DecimalFormat("00000.00").format(basicSalary) + "    |");
        System.out.println("| HRA 10%           : " + new DecimalFormat("00000.00").format(hra) + "    |");
        System.out.println("| TA  08%           : " + new DecimalFormat("00000.00").format(ta) + "    |");
        System.out.println("| DA  09%           : " + new DecimalFormat("00000.00").format(da) + "    |");
        System.out.println("| PF  20% (-)       : " + new DecimalFormat("00000.00").format(pf)+  "    |");
        System.out.println("|                                 |");
        System.out.println("-----------------------------------");
        System.out.println("| Gross Salary      : " + new DecimalFormat("00000.00").format(grossSalary) + "    |");
       System.out.println("===================================");
       scn.close();
    }

}
