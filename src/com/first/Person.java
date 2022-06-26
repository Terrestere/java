package com.first;

public class Person {

    private static int count;
    public int health;

    public Person(){

        count++;

    }

    public static void  getCount() {
        System.out.println("Количество: " + count);
    }

}
