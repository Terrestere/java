package codewars;

import java.util.Arrays;

public class Kata {
    public static char findMissingLetter(char[] array){
        char expectableLetter = array[0];
      // System.out.println(expectableLetter);
        for(char letter : array) {
           if(letter != expectableLetter) break;
            System.out.println("let=" + letter);
            System.out.println("ara=" + Arrays.toString(array));
            System.out.println("ex=" + expectableLetter);
            expectableLetter++;
        }
       return expectableLetter;
    }

    public static void main(String[] args) {
        findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'});
//        char missingLetter = Kata.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'});
//        System.out.println(missingLetter);
    }
}

