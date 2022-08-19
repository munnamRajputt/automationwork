package com.example.javasession;

public class ConstructorExample {
    String firstName;
    String lastName;
    int age;

    //Student constructor --- By own in the class
    public ConstructorExample(){
        firstName = "Munnam";
        lastName = "Babar";
        age = 27;
    }

    public static void main(String args[]) {
        System.out.println("Example of Constructor");
        ConstructorExample studentobj = new ConstructorExample();
        System.out.println(studentobj.age);
        // 27
        System.out.println(studentobj.firstName);
        //Munnam
    }
}
