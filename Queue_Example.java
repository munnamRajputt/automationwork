package com.example.assignment4;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {
    public static void main(String[] args) {

        Queue<Integer> Line = new LinkedList<Integer>();

        Line.add(12);
        Line.add(13);
        Line.add(22);
        Line.add(23);

        System.out.println("Queue -> The data representation after using Add method"+"\n" + Line);

        System.out.println("Queue -> The data taken out from Peek method" +  "\n" + Line.peek());

        Line.poll();
        System.out.println("Queue -> The data representation after using Pool method"+  "\n" + Line);

        Line.remove();
        System.out.println("Queue -> The data representation after using Remove method"+  "\n" + Line);


        System.out.println("Queue -> The data taken out from Element method at current position" +  "\n" + Line.element());


        Line.offer(33);
        Line.offer(43);
        System.out.println("Queue -> The data representation after adding data from Offer method"+"\n" + Line);

    }
}
