package com.gmail.zernetcsgo.hw13;

    public class GeometryApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(3.0),
                new Triangle(4.0, 5.0),
                new Square(2.5),
                new Circle(1.2),
                new Square(4.0)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.printf("Total area of all shapes: %.3f%n", totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double sum = 0.0;
        for (Shape s : shapes) {
            sum += s.getArea();
        }
        return sum;
    }
}
