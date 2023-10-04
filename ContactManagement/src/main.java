
import controller.manager;
import model.Contact;


public class main {
    public static void main(String[] args) {
        String[] options = {"Add a Contact","Display all Contact","Delect a Contact","Exit"};
        manager m = new manager("Contect Program", options);
        m.run1();
    }
}
