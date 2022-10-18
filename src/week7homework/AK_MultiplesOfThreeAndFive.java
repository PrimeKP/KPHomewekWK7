package week7homework;

public class AK_MultiplesOfThreeAndFive {

    public static void main(String[] args) {
        AK_MultiplesOfThreeAndFive obj = new AK_MultiplesOfThreeAndFive();
        obj.multipleThreeFive();

    }

    public void multipleThreeFive() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + ", ");
        }
        System.out.println("\nDivided by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + ", ");
        }
        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ", ");
        }
        System.out.println("\n");
    }
}