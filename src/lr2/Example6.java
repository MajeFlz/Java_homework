package lr2;

public class Example6 {
    interface Shape {
        double area();
        double perimeter();
    }

    static class Circle implements Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Shape {
        private final double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public double area() {
            return sideLength * sideLength;
        }

        @Override
        public double perimeter() {
            return 4 * sideLength;
        }
    }

    static class Triangle implements Shape {
        private final double side1;
        private final double side2;
        private final double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        public double area() {
            double s = (side1 + side2 + side3) / 2;
            // Формулда герона
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        public double perimeter() {
            return side1 + side2 + side3;
        }
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());

        Square square = new Square(4);
        System.out.println("Площадь квадрата: " + square.area());
        System.out.println("Периметр квадрата: " + square.perimeter());

        Triangle triangle = new Triangle(3, 5, 5);
        System.out.println("Площадь преугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " + triangle.perimeter());
    }

}
