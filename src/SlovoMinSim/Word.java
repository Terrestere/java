package SlovoMinSim;


public class Word {
    private String word;
    private int uniqueCharsNumber;

    public Word(String word) {
        this.word = word;
        uniqueCharsNumber = uniqueCharsNumber(word);
    }

    private int uniqueCharsNumber(String word) {
        int count = word.length();
        String lowerCaseWord = word.toLowerCase();
        for (int i = 0;i < word.length()-1; i++) {
            for (int j = i+1; j < word.length();j++) {
                if (lowerCaseWord.charAt(i) == lowerCaseWord.charAt(j)) {
                count--;
                break;
                }
            }
        }
        return count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getUniqueCharsNumber() {
        return uniqueCharsNumber;
    }

    public void setUniqueCharsNumber(int uniqueCharsNumber) {
        this.uniqueCharsNumber = uniqueCharsNumber;
    }
}
