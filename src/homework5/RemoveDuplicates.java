package src.homework5;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);

        if (array.length == 0) {
            return array;
        }

        int uniqueCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueCount++;
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        uniqueArray[0] = array[0];
        int index = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                uniqueArray[index] = array[i];
                index++;
            }
        }

        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 2, 2, 8, 4, 6, 8, 1 };
        int[] result = removeDuplicates(numbers);

        System.out.println("Масив без дублікатів: " + Arrays.toString(result));
    }
}
