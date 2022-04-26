public class Boy extends Human {

    Boy(String name, int age) {
        super(name, age);
    }

    @Override
    void sayGender() {
        System.out.println("I'm a boy");
    }
}
