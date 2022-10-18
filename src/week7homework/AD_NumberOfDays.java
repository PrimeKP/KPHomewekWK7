package week7homework;

public class AD_NumberOfDays {
    public static void main(String[] args) {

        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2,2018);
        getDaysInMonth(-1,2020);
        getDaysInMonth(1,-2020);
    }

    public static void isLeapYear(int year) {
        /*System.out.print("Enter Year: ");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        */
        String flag;
        if (year < 1 || year > 9999) {
            flag = "false";
            System.out.println(flag);

        } else if (year % 4 != 0) {
            flag = "false";
            System.out.println(flag);

        } else {
            flag = "true";
            System.out.println(flag);
        }

    }

    public static void getDaysInMonth(int month, int year) {

        int flag;
        int days;
        if (month < 1 || month > 12) {
            flag = -1;
            System.out.println(flag);
            return;
        }
        if (year < 1 || year > 9999) {
            flag = -1;
            System.out.println(flag);
            return;

        }
        if (year % 4 == 0) {
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = 29;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
                default:
                    days = -1;
                    break;

            }
            System.out.println(days);

        } else {
           switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
                default:
                    days = -1;
                    break;



            }

            System.out.println(days);
        }

    }

}

