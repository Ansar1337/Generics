package task2;

public class Test {
    public static void main(String[] args) {
        Box<String, String> obj1 = new Box<>("name", "Runtime");
        System.out.println(obj1);

        Box<Integer, Boolean> obj2 = new Box<>(1, true);
        System.out.println(obj2);
    }
}