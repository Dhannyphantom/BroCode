
public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer, String> generic = new MyGenericClass<>(1, "Dhanny");

        System.out.println(generic.getValue());
    }
}