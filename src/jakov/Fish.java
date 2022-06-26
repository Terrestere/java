package jakov;

public class Fish extends Pet{
    int currentDepth = 0;
    Fish(int currentDepth) {
        this.currentDepth = currentDepth;
    }
    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth>100) {
            System.out.println("i am small fish and i cant go deeper");
            currentDepth=currentDepth-howDeep;
        }else{
            System.out.println("I am going " + currentDepth + " meters");
            System.out.println("I am on " + currentDepth + " meters");
        }

        return currentDepth;
    }

   @Override
    public String say(String something) {
        return "i dont speak";
    }
}
