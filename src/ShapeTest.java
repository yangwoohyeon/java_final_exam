public class ShapeTest {
    public static void main(String[] args) {
        Shape3 s1,s2,s3,s4;
        s1= new Shape3();
        s2 = new Rectangle3();
        s3 = new Triangle3();
        s4 = new Circle3();

        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
    }
}
