package week7homework;

import java.util.Arrays;

public class AQ_SortingArrays {
    public static void main(String[] args) {
        AQ_SortingArrays obj = new AQ_SortingArrays();
        obj.sortArrays();

    }
    public void sortArrays(){
        int [] numArray =  { 500, 363, 262, 420, 840, 960, 345, 965, 444, 1000, 156, 356, 150, 99, 9, 15};
        String [] stArray = {"Testing", "Software", "Regression", "Retest", "Sanity", "Smoke", "System",
                "Acceptance","Remote", "User", "Agile", "Jira", "Java"};
        System.out.println("Unsorted Numeric Array " + Arrays.toString(numArray));
        System.out.println("------------------------------------------");
        Arrays.sort(numArray);
        System.out.println("Numeric Array sorted in ascending order");
        System.out.println(Arrays.toString(numArray));
        System.out.println("------------------------------------------");

        System.out.println("Unsorted String Array " + Arrays.toString(stArray));
        System.out.println("------------------------------------------");
        Arrays.sort(stArray);
        System.out.println("String Array sorted in ascending order");
        System.out.println(Arrays.toString(stArray));
        System.out.println("------------------------------------------");

    }
}
