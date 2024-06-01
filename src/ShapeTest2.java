public class ShapeTest2 {
    private static Shape3 arrayOfShape[];

    public static void main(String arg[])
    {
        init();
        drawAll();
    }

    public static void init(){
        arrayOfShape = new Shape3[3];
        arrayOfShape[0] = new Rectangle3();
        arrayOfShape[1] = new Triangle3();
        arrayOfShape[2] = new Circle3();
    }

    public static void drawAll(){
        for(int i=0; i<arrayOfShape.length; i++){
            arrayOfShape[i].draw();
        }
    }
}
