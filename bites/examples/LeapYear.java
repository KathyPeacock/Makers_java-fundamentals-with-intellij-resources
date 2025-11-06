package bites.examples;

public class LeapYear {

    public static Boolean isLeapYear(Integer year) {

        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return Boolean.FALSE;
        }
        else if (year % 4 == 0) {
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(1970));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(1988));
        System.out.println(LeapYear.isLeapYear(1500));
    }
}
