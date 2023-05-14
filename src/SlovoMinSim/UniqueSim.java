package SlovoMinSim;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqueSim {
    public String search(String text, String reg) {
        Word result = new Word(text);
        Matcher m = Pattern.compile(reg).matcher(text);
        while (m.find()) {
            Word currentWord = new Word(text.substring(m.start(), m.end()));
            if (result.getUniqueCharsNumber() == 1) {
                return result.getWord();
            } else if (currentWord.getUniqueCharsNumber() < result.getUniqueCharsNumber()) {
                result = currentWord;
            }
        }
        return result.getWord();
    }
}
