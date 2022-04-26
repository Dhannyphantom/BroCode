public class Girl extends Human{
    Girl(String name, int age) {
        super(name, age);
    }

    @Override
    void sayGender() {
        System.out.println("I'm a girl");
    }
}
