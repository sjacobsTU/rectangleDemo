public class RectangleDemo {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape shape = new RectangleAdapter(legacyRectangle);

        // Drawing using the Shape interface
        shape.draw(10, 20, 30, 40);
    }
}
