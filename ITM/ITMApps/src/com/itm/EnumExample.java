package com.itm;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Printing enum constant
        System.out.println("Today is: " + today);

        // Using in switch-case
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is coming!");
                break;
            case SUNDAY:
                System.out.println("Holiday!");
                break;
            default:
                System.out.println("Regular day");
        }
    }
}
