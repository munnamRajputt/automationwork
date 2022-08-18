package com.example.assignment4;

import java.util.*;

public class Map_Example {
    public static void main(String[] args) {

        HashMap<String, Integer> hashmap1 = new HashMap<String, Integer>();

        hashmap1.put("Munnam", 123);
        hashmap1.put("Hassan", 123);
        hashmap1.put("Nadeem", 123);
        hashmap1.put("Omer",   223);

        System.out.println("HashMap -> data representation after using Put method"+"\n" + hashmap1);

        System.out.println("HashMap -> data representation after using Size method"+"\n" + hashmap1.size());

        System.out.println("HashMap -> data representation after using Containskey method"+"\n" + hashmap1.containsKey(123));
        System.out.println("HashMap -> data representation after using Containsvalue method"+"\n" + hashmap1.containsValue("Munnam"));



    }
    }
