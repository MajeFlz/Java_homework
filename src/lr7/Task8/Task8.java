package lr7.Task8;

import java.io.*;

public class Task8 {
    public static void main(String[] args) {
        Person person = new Person("Иван", 30, "123 Улица Пушкина, Россия");

        // Сохранение объекта в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Объект сохранен в файл person.ser");
        } catch (IOException e) {
            System.out.println(STR."Произошла ошибка при сохранении объекта: \{e.getMessage()}");
        }

        // Восстановление объекта из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person restoredPerson = (Person) ois.readObject();
            System.out.println("Объект восстановлен из файла person.ser");
            System.out.println(STR."Восстановленный объект: \{restoredPerson}");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(STR."Произошла ошибка при восстановлении объекта: \{e.getMessage()}");
        }
    }
}

