//Напишите класс Pair<T1, T2>, который хранит два значения (T1 и T2).
// Реализуйте методы getFirst() и getSecond().
//Обобщённый метод для реверса массива.

class Pair1<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair1(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + " ," + second + " )";

    }
}


public class Main4 {
    public static void main(String[] args) {
        Pair1<Integer, String> pair1 = new Pair1<>(1, "One");
        System.out.println("Первый элемент :" + pair1.getFirst());
        System.out.println("Второй элемент :" + pair1.getSecond());
        System.out.println("Пара :" + pair1);

        Integer[] number = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив" + java.util.Arrays.toString(number));
        reverseArray(number);
        System.out.println("Обратный массив" + java.util.Arrays.toString(number));
    }

    public static <T> T[] reverseArray(T[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            T temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;


    }
}
