package jakov;

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("i am sleeping");
    }
    public void eat(){
        System.out.println("I want to eat");
    }

    public String say(String Word){
        String petResponse = "Ok!" + Word;
        return petResponse;
    }


}

