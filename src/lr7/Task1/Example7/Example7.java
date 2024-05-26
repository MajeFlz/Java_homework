package lr7.Task1.Example7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example7 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);

        try {
            FileOutputStream fileOut = new FileOutputStream("src/lr8/example9/person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}