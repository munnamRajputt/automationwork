package com.example.javasession;

public class LoopsAndStatements {
    public static void main(String[] args) {

        //If-else statement
        System.out.println("Example of If-Else Statement");
    int a=1, b=2;

    if(a==1 && b==2)
    {
        System.out.println("Testing If statement Works");
    }
    else
    {
        System.out.println("Testing else statement Works");
    }

       //For Loop
        System.out.println("Example of FOR loop");
        int n=2;
        for(int i=1; i<=10; i++)
        {
            System.out.println("Table of 2 using for loop:: \t" + n + "*"  +i +"=" + (n*i));
        }

        //While Loop
        System.out.println("Example of WHILE loop");
        int i = 1;
        while (i <= 10) {
            System.out.println("Table of 2 using for loop:: \t" + n + "*"  +i +"=" + (n*i));
            i++;
        }


        //Do-While LOOP
        System.out.println("Example of DO-WHILE loop");

        int x=1;
        do{
            System.out.println("Table of 2 using Do-While loop:: \t" + n + "*"  + x +"=" + (x*n));
            x++;
        }while(x<=10);


        //For-Each Loop
        System.out.println("Example of For-Each loop");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int number1:numbers)
        {
            System.out.println("Table of 2 using For-Each loop::" + "\t" + number1 + "*"  + n +"=" +  (number1*n));
        }
    }
}
