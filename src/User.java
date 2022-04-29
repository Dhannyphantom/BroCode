import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    void sayHello () {
        System.out.println("Hello " + this.name);
    }
}
