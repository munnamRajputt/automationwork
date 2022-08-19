package com.example.javasession;

public class FunctionExamples {
    public static void main(String[] args) {

        System.out.println("Example of Built-In Functions");
        //Built-In function Example
        String str1 = " I am Java String";    // check if str1 contains "Java"
        boolean result;
        result = str1.contains("Java");
        System.out.println(result);



        System.out.println("Example of Arguments & Parameters");
        FunctionExamples obj = new FunctionExamples();
        int refervar = obj.sum(20, 10);
        System.out.println(refervar);
    }
    int sum (int var1, int var2)
    {
        int result = var1 + var2;
        return result;
    }

}
