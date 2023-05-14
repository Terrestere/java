package codewars;

import java.util.Arrays;

public class TheObserveredPIN3 {
    public static void main(String[] args) {
        // Предполагаемый Pin-Cod
        String pin = "307";
        System.out.println("Исходный пин-код: " + pin);
        // Массив "соседних" кнопок
        String[][] buttons = {
                {"","0","8"},
                {"","1","2","4"},
                {"","1","2","3","5"},
                {"","2","3","6"},
                {"","1","4","5","7"},
                {"","2","4","5","6","8"},
                {"","3","5","6","9"},
                {"","4","7","8"},
                {"","0","5","7","8","9"},
                {"","6","8","9"},
                {""}
        };

        // Добавление к пин-коду доп.символов до 8-разряда
        while (pin.length() < 8)
            pin += ':';

        int lenRes = 1, k = 0; // длина и индекс выходного массива
        int[] L = new int[8];  // массив длинн кнопочных массивов
        int[] I = new int[8];  // массив коррекции индексов
        for (int i = 0; i < 8; i++) {
            int temp = 1;
            L[i] = buttons[pin.charAt(i)-48].length;
            if (L[i] > 1) {
                I[i] = 1;
                temp = L[i] - 1;
            }
            lenRes *= temp;
        }
        String[] result = new String[lenRes]; // выходной массив

        // Циклы перебора вариантов пин-кода
        for (int i7 = I[7]; i7 < L[7]; i7++)
            for (int i6 = I[6]; i6 < L[6]; i6++)
                for (int i5 = I[5]; i5 < L[5]; i5++)
                    for (int i4 = I[4]; i4 < L[4]; i4++)
                        for (int i3 = I[3]; i3 < L[3]; i3++)
                            for (int i2 = I[2]; i2 < L[2]; i2++)
                                for (int i1 = I[1]; i1 < L[1]; i1++)
                                    for (int i0 = I[0]; i0 < L[0]; i0++)
                                        result[k++] =
                                                buttons[pin.charAt(0)-48][i0] +
                                                        buttons[pin.charAt(1)-48][i1] +
                                                        buttons[pin.charAt(2)-48][i2] +
                                                        buttons[pin.charAt(3)-48][i3] +
                                                        buttons[pin.charAt(4)-48][i4] +
                                                        buttons[pin.charAt(5)-48][i5] +
                                                        buttons[pin.charAt(6)-48][i6] +
                                                        buttons[pin.charAt(7)-48][i7];
        Arrays.sort(result);
        System.out.println("Количество вероятных вариантов: " + lenRes);
        System.out.println("Вероятные варианты пин-кодов: " +
                Arrays.toString(result));
    }
}