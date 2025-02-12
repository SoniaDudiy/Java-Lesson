package src.homework5;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        shuffleArray(array);

        System.out.println("Перемішаний масив: " + Arrays.toString(array));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
