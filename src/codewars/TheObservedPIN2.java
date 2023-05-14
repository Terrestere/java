package codewars;

import java.util.*;

public class TheObservedPIN2 {
    private final static Map<String, List<String>> VARIANTS = new HashMap<>();
    public static void main(String[] args) {
        VARIANTS.put("0", Arrays.asList("0", "8"));                  // 0
        VARIANTS.put("1", Arrays.asList("1", "2", "4"));             // 1
        VARIANTS.put("2", Arrays.asList("2", "1", "3", "5"));        // 2
        VARIANTS.put("3", Arrays.asList("3", "2", "6"));             // 3
        VARIANTS.put("4", Arrays.asList("4", "1", "5", "7"));        // 4
        VARIANTS.put("5", Arrays.asList("5", "2", "4", "6", "8"));   // 5
        VARIANTS.put("6", Arrays.asList("6", "3", "5", "9"));        // 6
        VARIANTS.put("7", Arrays.asList("7", "4", "6"));             // 7
        VARIANTS.put("8", Arrays.asList("8", "5", "7", "9", "0"));   // 8
        VARIANTS.put("9", Arrays.asList("9", "6", "8"));             // 9

        new TheObservedPIN2().foo("446");
    }

    private void foo(String pin) {
        String[] pins = pin.split("");
        List<String> temp = new ArrayList<>();
        List<String> result = new ArrayList<>(VARIANTS.get(pins[0]));
        for (int i = 0; i < pin.length(); i++) {
            temp.clear();
            temp.addAll(result);
            for (String s : temp) {
                VARIANTS.get(pins[i]).forEach(x -> result.add(s + x));
            }
        }
        result.stream().filter(x -> x.length() == pins.length).sorted().forEach(System.out::println);    }
}
