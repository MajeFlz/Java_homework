package lr2;

public class Example8 {

    static class Animal {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void makeSound() {
            System.out.println("Животное издает звук");
        }
    }

    static class Dog extends Animal {
        String breed;

        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        public void bark() {
            System.out.println("Гав");
        }
    }

    static class Cat extends Animal {
        String furColor;

        public Cat(String name, int age, String furColor) {
            super(name, age);
            this.furColor = furColor;
        }

        public void meow() {
            System.out.println("Мяу");
        }
    }

    static class Bird extends Animal {
        boolean canFly;

        public Bird(String name, int age, boolean canFly) {
            super(name, age);
            this.canFly = canFly;
        }

        public void fly() {
            if (canFly) {
                System.out.println("Птица летит");
            } else {
                System.out.println("Эта птица не может летать");
            }
        }
    }

    static class Shape {
        double area;
        double perimeter;

        public void calculateArea() {
            System.out.println("Рассчет площади фигуры");
        }

        public void calculatePerimeter() {
            System.out.println("Рассчет периметра фигуры");
        }
    }

    static class Circle extends Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public void calculateArea() {
            area = Math.PI * radius * radius;
            System.out.println("Площадь круга: " + area);
        }

        @Override
        public void calculatePerimeter() {
            perimeter = 2 * Math.PI * radius;
            System.out.println("Периметр круга: " + perimeter);
        }
    }

    static class Square extends Shape {
        double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public void calculateArea() {
            area = side * side;
            System.out.println("Площадь квадрата: " + area);
        }

        @Override
        public void calculatePerimeter() {
            perimeter = 4 * side;
            System.out.println("Периметр квадрата: " + perimeter);
        }
    }

    static class Triangle extends Shape {
        double side1;
        double side2;
        double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        public void calculateArea() {
                double s = (side1 + side2 + side3) / 2;
                // Формула герона
            System.out.printf("Площадь треугольника: %s%n", Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
        }

        @Override
        public void calculatePerimeter() {
            System.out.println("Периметр треугольника: " + (side1 + side2 + side3));
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2, "Серый");
        Bird bird = new Bird("Чижик", 1, false);

        dog.makeSound();
        dog.bark();

        cat.makeSound();
        cat.meow();

        bird.fly();

        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);

        circle.calculateArea();
        circle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();
    }

}
