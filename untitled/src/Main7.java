
//Создайте обобщённый метод для поиска элемента.
//
//Напишите метод findIndex, который принимает массив
// (T[]) и элемент (T) и возвращает индекс первого
// вхождения элемента в массив (или -1, если элемент не найден).
//Обобщённый метод для создания списка.



public class Main7 {
    public static<T> int findIndex(T[]array, T element){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers={1,2,3,4,5};
        System.out.println(findIndex(numbers,3));
        System.out.println(findIndex(numbers,7));

        String[] words={"apple", "cherry","tomato"};
        System.out.println(findIndex(words,"apple"));
        System.out.println(findIndex(words,"chair"));

    }
}

