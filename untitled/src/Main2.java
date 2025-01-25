//Создайте обобщённый метод для вывода элементов.
//Напишите метод getFirstElement, который принимает массив любого типа (T[])
// и возвращает его первый элемент.
//Напишите метод для проверки равенства.


public class Main2 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] words = {"apple", "banan", "cherry"};
        System.out.println("первый элемент " + getFirstElement(numbers));
        System.out.println("первый элемент " + getFirstElement(words));
        System.out.println("Равны ли 5 и 5? " + equals(5, 5));
        System.out.println("Равны ли \"hello\" и \"world\" ?" + equals("hello", "world"));

    }
    public static <T> T getFirstElement(T[]array){
        if (array==null||array.length==0){
            return null;
        }
        return array[0];
    }
    public static <T> boolean equals(T element1,T element2){
        return element1.equals(element2);
    }
}
