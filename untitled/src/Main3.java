

//Реализуйте метод isEqual, который принимает два
// параметра одного типа (T) и возвращает true, если они равны.
//Создайте обобщённый класс для хранения пары.

public class Main3 {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }


    public static void main(String[] args) {
        System.out.println(isEqual(5, 5));
        System.out.println(isEqual(5, 6));
        System.out.println(isEqual("Test", "Test"));
        Pair<Integer,String>pair=new Pair<>(1,"One");
        System.out.println(pair);

        pair.setFirst(2);
        pair.setSecond("One");
        System.out.println(pair);
    }
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public void setFirst(T first){
        this.first=first;
    }
    public U getSecond(U second){
        return second;
    }
    public void setSecond(U second){
        this.second=second;
    }
    @Override
    public String toString(){
        return "(" +first+" ," + second+" )";
    }
}

