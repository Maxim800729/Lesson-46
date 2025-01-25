//Метод для копирования массива.
//
//Напишите метод copyArray, который принимает
// массив любого типа (T[]) и возвращает его копию.
//Создайте класс для хранения трёх объектов.


import java.util.Arrays;

public class Main9 {
    // Generic method to copy an array
    public static <T> T[] copyArray(T[] array) {
        return Arrays.copyOf(array, array.length);
    }

    // Generic class to store three objects
    public static class Triple<T1, T2, T3> {
        private T1 first;
        private T2 second;
        private T3 third;

        // Constructor
        public Triple(T1 first, T2 second, T3 third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        // Getters
        public T1 getFirst() {
            return first;
        }

        public T2 getSecond() {
            return second;
        }

        public T3 getThird() {
            return third;
        }

        // Setters
        public void setFirst(T1 first) {
            this.first = first;
        }

        public void setSecond(T2 second) {
            this.second = second;
        }

        public void setThird(T3 third) {
            this.third = third;
        }

        @Override
        public String toString() {
            return "Triple{" +
                    "first=" + first +
                    ", second=" + second +
                    ", third=" + third +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Example usage of copyArray
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer[] copiedNumbers = copyArray(numbers);
        System.out.println(Arrays.toString(copiedNumbers)); // Output: [1, 2, 3, 4, 5]

        // Example usage of Triple class
        Triple<String, Integer, Double> triple = new Triple<>("Hello", 42, 3.14);
        System.out.println(triple); // Output: Triple{first=Hello, second=42, third=3.14}

        // Modifying values in the Triple
        triple.setFirst("World");
        triple.setSecond(100);
        triple.setThird(2.71);
        System.out.println(triple); // Output: Triple{first=World, second=100, third=2.71}
    }
}
