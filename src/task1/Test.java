package task1;

public class Test {
    public static void main(String[] args) {
        Box<String> obj1 = new Box<>("Runtime");
        System.out.println(obj1);

        Box<Integer> obj2 = new Box<>(1);
        System.out.println(obj2);

        Box<Boolean> obj3 = new Box<>(true);
        System.out.println(obj3);
    }
}