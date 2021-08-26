package task1;

public class Box<T> {

    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{obj=%s}".formatted(obj.getClass().getName());
    }
}