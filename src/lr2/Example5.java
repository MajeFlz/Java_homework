package lr2;

public class Example5 {
    static class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }

        public static void main(String[] args) {
            // Пример использования класса Rectangle
            Rectangle rectangle1 = new Rectangle(5, 4);
            System.out.println("Длина: " + rectangle1.getLength());
            System.out.println("Ширина: " + rectangle1.getWidth());
            System.out.println("Площадь: " + rectangle1.area());
            System.out.println("Периметр: " + rectangle1.perimeter());
        }
    }

}
