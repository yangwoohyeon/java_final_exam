abstract class Shape2 {
    private int x,y;
    public void move(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Shape2(){}
    public abstract void draw();
};

class Rectangle2 extends Shape{

    private int width,height;

    public Rectangle2(int x, int y) {
        super(x, y);
    }

    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle extends Shape{
    private int radius;

    public Circle(int x, int y) {
        super(x, y);
    }

    public void draw(){
        System.out.println("원 그리기");
    }
}
