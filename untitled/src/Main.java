//Создайте обобщённый метод для вывода элементов.
//
//Напишите метод printElement, который принимает один параметр любого типа
//        (T) и выводит его значение в консоль.
//Создайте обобщённый метод для работы с массивами.

public class Main {
    public static void main(String[] args) {
        printElement(123);
        printElement("Hello!");
        printElement(3.14);
        Integer[] numbers = {1, 2, 3};
        String[] words = {"one,two,three"};
        printArray(numbers);
        printArray(words);

    }

    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
