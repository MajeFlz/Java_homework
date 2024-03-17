package lr2;

public class Example4 {
    static class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public static void main(String[] args) {
            Person person1 = new Person("Alice", 30, "female");
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Gender: " + person1.getGender());
        }
    }
}
