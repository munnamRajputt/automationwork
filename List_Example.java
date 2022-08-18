package com.example.assignment4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class List_Example {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(12);
        list1.add(13);
        list1.add(22);
        list1.add(23);

        System.out.println("List -> The data representation after using Add method"+"\n" + list1);

        System.out.println("List -> The data taken out from get method on 3rd index" +  "\n" + list1.get(2));

        System.out.println("List -> data representation after using Size method"+"\n" + list1.size());

        list1.remove(2);
        System.out.println("List -> data representation after using Remove method & remove value from 3 index"+"\n" + list1);

        list1.clear();
        System.out.println("List -> data representation after using Clear Method"+"\n" + list1);


    }
}
