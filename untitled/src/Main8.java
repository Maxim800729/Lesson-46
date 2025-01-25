//Обобщённый метод для создания списка.
//
//Реализуйте метод toList, который принимает массив
// любого типа (T[]) и возвращает список (List<T>),
// содержащий те же элементы.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main8 {
    public static <T>List<T>toList(T[]array){
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5};
        List<Integer>numberList= toList(numbers);

        String[]words= {"apple","cherry","banana"};
        List<String>wordList=toList(words);
        System.out.println(wordList);

    }
}
