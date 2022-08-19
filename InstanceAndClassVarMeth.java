package com.example.javasession;


// Instance method to be called using InstanceClass
class ExampleInstanceClass
{
    String name = "";
    public void geek(String name)
    {
        this.name = name;
    }
}

// Class method to be called using ExampleStaticClass
class ExampleStaticClass
{
    public static String Name = "";

    public static void examplestaticclass(String name)
    {
        Name = name;
    }
}

public class InstanceAndClassVarMeth {

   //Instance variable ---->
    int age;
   //Class variable ------>
    static int age1;



    public static void main(String[] args)
    {

        // create an instance of the class.
        ExampleInstanceClass instanceobj = new ExampleInstanceClass();

        // calling an instance method in the class 'ExampleInstanceClass'.
        instanceobj.geek("Munnam (Instance Method)");
        System.out.println(instanceobj.name);


        //access staticclassMethod using class
        ExampleStaticClass.examplestaticclass("Munnam is the name");
        System.out.println(ExampleStaticClass.Name);

        //access staticclassMethod using object
        ExampleStaticClass ex = new ExampleStaticClass();
        ex.examplestaticclass("Munnam Babar -- Complete Name(class Method)");
        System.out.println(ex.Name);

    }

}
