//Напишите метод reverseArray,
// который принимает массив любого типа (T[])
// и возвращает новый массив с элементами в обратном порядке.

import java.util.Arrays;


public class Main5 {

    public static <T> T[] reverseArray(T[] array) {
        T[] reversedArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];

        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};
        Integer[] reversedIntArray = reverseArray(intArray);
        String[] reversedStringArray = reverseArray(stringArray);

        System.out.println(Arrays.toString(reversedIntArray));
        System.out.println(Arrays.toString(reversedStringArray));

    }
}
