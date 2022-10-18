package week7homework;

public class AT_ArraySpecificValue {
    public static void main(String[] args) {
        specificArrayNum();

    }

    public static void specificArrayNum() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toFind = 10;
        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }
}
