//
//Реализуйте класс Triple<T1, T2, T3>,
// который содержит три поля разных типов (T1, T2, T3).
// Добавьте методы для установки и получения значений.

public class Main10 {
    // Generic Triple class
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

        // Getter methods
        public T1 getFirst() {
            return first;
        }

        public T2 getSecond() {
            return second;
        }

        public T3 getThird() {
            return third;
        }

        // Setter methods
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
        // Example usage of the Triple class
        Triple<String, Integer, Double> triple = new Triple<>("Hello", 42, 3.14);
        System.out.println(triple); // Output: Triple{first=Hello, second=42, third=3.14}

        // Setting new values
        triple.setFirst("World");
        triple.setSecond(100);
        triple.setThird(2.71);
        System.out.println(triple); // Output: Triple{first=World, second=100, third=2.71}

        // Getting individual values
        System.out.println("First: " + triple.getFirst()); // Output: First: World
        System.out.println("Second: " + triple.getSecond()); // Output: Second: 100
        System.out.println("Third: " + triple.getThird()); // Output: Third: 2.71
    }
}
