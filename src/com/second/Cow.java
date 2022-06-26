package com.second;

public class Cow  extends Animal{
    public Cow(String say, int teeth) {
        setTeeth(teeth);
        setSay(say);


    }

     void mu () {

        System.out.println(getSay() + " vo vse " + getTeeth() + " zuba");
    }
}
