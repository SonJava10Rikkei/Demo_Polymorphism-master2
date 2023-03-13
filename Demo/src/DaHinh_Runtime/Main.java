package DaHinh_Runtime;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
        shape.draw();
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
