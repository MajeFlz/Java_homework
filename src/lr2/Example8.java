package lr2;

public class Example8 {
    // Определение класса Animal
    static class Animal {
        // Поля
        String name;
        int age;

        // Конструктор
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Метод для издания звука
        public void makeSound() {
            System.out.println("Животное издает звук");
        }
    }

    // Подклассы
    static class Dog extends Animal {
        // Уникальные поля для собаки
        String breed;

        // Конструктор
        public Dog(String name, int age, String breed) {
            super(name, age);
            this.breed = breed;
        }

        // Метод для лая
        public void bark() {
            System.out.println("Собака лает");
        }
    }

    static class Cat extends Animal {
        // Уникальные поля для кошки
        String furColor;

        // Конструктор
        public Cat(String name, int age, String furColor) {
            super(name, age);
            this.furColor = furColor;
        }

        // Метод для мяуканья
        public void meow() {
            System.out.println("Кошка мяукает");
        }
    }

    static class Bird extends Animal {
        // Уникальные поля для птицы
        boolean canFly;

        // Конструктор
        public Bird(String name, int age, boolean canFly) {
            super(name, age);
            this.canFly = canFly;
        }

        // Метод для полета
        public void fly() {
            if (canFly) {
                System.out.println("Птица летит");
            } else {
                System.out.println("Эта птица не может летать");
            }
        }
    }

    // Класс Shape
    static class Shape {
        // Поля
        double area;
        double perimeter;

        // Методы для вычисления площади и периметра
        public void calculateArea() {
            System.out.println("Рассчет площади фигуры");
        }

        public void calculatePerimeter() {
            System.out.println("Рассчет периметра фигуры");
        }
    }

    // Подклассы для геометрических фигур
    static class Circle extends Shape {
        // Уникальное поле для круга
        double radius;

        // Конструктор
        public Circle(double radius) {
            this.radius = radius;
        }

        // Переопределение методов для вычисления площади и периметра
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
        // Уникальное поле для квадрата
        double side;

        // Конструктор
        public Square(double side) {
            this.side = side;
        }

        // Переопределение методов для вычисления площади и периметра
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
        // Уникальные поля для треугольника
        double base;
        double height;

        // Конструктор
        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        // Переопределение методов для вычисления площади и периметра
        @Override
        public void calculateArea() {
            area = 0.5 * base * height;
            System.out.println("Площадь треугольника: " + area);
        }

        // Переопределение метода для вычисления периметра
        // В данном примере просто для наглядности, можно реализовать и другой способ
        @Override
        public void calculatePerimeter() {
            System.out.println("Невозможно вычислить периметр треугольника без дополнительной информации");
        }
    }
    public static void main(String[] args) {
        // Создание объектов для каждого из подклассов Animal
        Dog dog = new Dog("Шарик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2, "Серый");
        Bird bird = new Bird("Чижик", 1, true);

        // Вызов методов для проверки наследования
        dog.makeSound();
        dog.bark();

        cat.makeSound();
        cat.meow();

        bird.makeSound();
        bird.fly();

        // Создание объектов для каждого из подклассов Shape
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 6);

        // Вызов методов для проверки наследования
        circle.calculateArea();
        circle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();
    }

}
