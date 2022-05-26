package com.example.automationwork;

public class LoopSwitch {

    public static void main(String[] args) {

        System.out.println("If else statement output:");
        fun1();
        System.out.println("\n If else if statement output:");
        fun2();
        System.out.println("\n switch statement output:");
        fun3();

    }

    //if else statement
    public static void fun1() {
        int number = 10;

        // checks if number is less than 0
        if (number < 0) {
            System.out.println("Statement within the if block");
        } else
            System.out.println("Statement outside if block");
    }

    //if else if statement
    public static void fun2()
    {
        int number = 10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // execute this block if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");
    }

    //switch statement
    public static void fun3()
    {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Outputs "Thursday" (day 4)

    }

    }


