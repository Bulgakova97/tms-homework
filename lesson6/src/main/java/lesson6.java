public class lesson6 {
    // Базовый класс "Фигура"
    abstract class Shape {
        abstract double calculateArea();
        abstract double calculatePerimeter();
    }

    // Класс "Треугольник"
    class Triangle extends Shape {
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangle(double sideA, double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        @Override
        double calculateArea() {
            // Формула Герона для вычисления площади треугольника
            double s = (sideA + sideB + sideC) / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

        @Override
        double calculatePerimeter() {
            return sideA + sideB + sideC;
        }
    }

    // Класс "Прямоугольник"
    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    // Класс "Круг"
    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Создание массива из 5 фигур
            Shape[] shapes = new Shape[5];
            shapes[0] = new Triangle(3, 4, 5);
            shapes[1] = new Rectangle(5, 8);
            shapes[2] = new Circle(4);
            shapes[3] = new Triangle(6, 7, 8);
            shapes[4] = new Circle(3.5);

            // Вывод на экран суммы периметров всех фигур в массиве
            double totalPerimeter = 0;
            for (Shape shape : shapes) {
                totalPerimeter += shape.calculatePerimeter();
            }
            System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
        }
    }
}
