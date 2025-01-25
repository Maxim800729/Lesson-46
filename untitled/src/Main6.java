//Реализуйте метод compareElements,
// который принимает два элемента одного типа (T)
// и возвращает строку:
//
//        "Элементы равны" — если они равны.
//"Элементы не равны" — если они различны.
//Создайте обобщённый метод для поиска элемента.

public class Main6 {
    public static <T> String compareElements(T element1, T element2) {
        if (element1.equals(element2)) {
            return "Элементы равны";
        } else {
            return "Элементы не равны";
        }
    }

    public static void main(String[] args) {
        System.out.println(compareElements(5, 5));
        System.out.println(compareElements(5, 6));
        System.out.println(compareElements("Hello", "Hello"));
        System.out.println(compareElements("Hello", "Hi"));
    }
}