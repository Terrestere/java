package codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PigLatinTest {

    @Test
    public void pigIt() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("uraDay exlay edsay exlay", PigLatin.pigIt("Dura lex sed lex"));
    }
}