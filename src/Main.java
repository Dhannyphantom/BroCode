import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
//        THIS WILL SERIALIZE THE USER DATA
       User user = new User();
       user.name = "Daniel";
       user.password = "qwerty";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(user);
        fileOut.close();
        objectOut.close();

        System.out.println("User info has been saved;");

//        IN ANOTHER PROJECT, YOU CAN NOW DESERIALIZE
        /*

        IN THAT NEW PROJECT YOU NEED TO CREATE THE EXACT SAME CLASS AS THE USER CLASS;
        ========= IMPORTANT ===============
        ============ IT MUST BE EXACT!!!!!! ====
        SUCH THAT THE USER CLASS IN THIS PROJECT WILL HAVE THE
            SAME VERSIONUID AS THE CLASS IN THE OTHER PROJECT

        ============NOTE==================
        TRANSIENT ATTRIBUTES OR METHODS WILL NOT BE SERIALIZED;

        User user = null;

        FileInputStream fileIn = new FileInputStream("C:\\Users\\PHANTOM\\Documents\\PHANTOM\\DOCS\\PROGRAMS\\JAVA\\BroCode\\UserInfo.ser");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        user = (User) objectIn.readObject();
        fileIn.close();
        objectIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

         */

    }
}