package com.example.javasession;

public class DefaultConstructorExample {
        String firstName;
        String lastName;
        int age;

        public static void main(String args[]) {
            System.out.println("Example of Default Constructor");
            DefaultConstructorExample studentobj = new DefaultConstructorExample();

            studentobj.firstName = "Munnam";
            studentobj.lastName = "Babar";
            studentobj.age = 27;

            System.out.println(studentobj.age);
            //27

            System.out.println(studentobj.firstName);
            //Munnam
        }
}
