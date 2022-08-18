package com.example.assignment4;

import java.util.HashSet;

public class Set_Example {
    public static void main(String[] args) {


        HashSet<Integer> hash1 = new HashSet<Integer>();

        hash1.add(12);
        hash1.add(13);
        hash1.add(22);
        hash1.add(23);

        System.out.println("HashSet -> data representation after using Add method"+"\n" + hash1);

        System.out.println("HashSet -> Using Contains Method"+"\n" + hash1.contains(13));

        System.out.println("HashSet -> data representation after using Size method"+"\n" + hash1.size());

        System.out.println("HashSet -> data representation after using remove method & remove 12 from list"+"\n" + hash1.remove(12));

        System.out.println("HashSet -> data representation after using Clear method"+"\n" + hash1);
    }


    //conatins, remove, clear, size
}
