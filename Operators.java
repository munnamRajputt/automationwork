package com.example.javasession;

public class Operators {

    public static void main(String[] args) {

        // 1- assignment operator +=, =, */-=
        int age;
        age=5;

        System.out.println("Assignment operator usage, AGE=" + age);

        // 2- arthimetic operator +,-,*,/,%

        int a =1, b=2;

        System.out.println("Arthimetic operator :: a+b =" + (a+b));

        // 3- Comparison/Relational operator

        System.out.println("Comparison/Relational operator :: result comes false \t" + (a>b));
        System.out.println("Comparison/Relational operator :: result comes true \t" + (a<b));

        // 4- Logical Operator && , ||
        System.out.println("Logical Operator");
        System.out.println((5 > 3) && (8 > 5));  // example with && true
        System.out.println((5 < 3) || (8 < 5));  // example with || false

        // 5- Unary Operator
        int value = 2, result1, result2;
        result1 = ++value;
        result2 = --value;
        System.out.println("Unary Operator, After increment: " + result1);
        System.out.println("Unary Operator, After decrement: " + result2);
    }
}
