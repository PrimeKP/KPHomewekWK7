package week7homework;

import java.util.Scanner;

public class AL_IdentifyInput {
    public static void main(String[] args) {
        identifyInput();

    }
    public static void identifyInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println("is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println("is A DIGIT.");

        } else {

            System.out.println("is A SPECIAL CHARACTER.");
        }
        scanner.close();

    }
}
