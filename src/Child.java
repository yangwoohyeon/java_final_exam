public class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("자식 클래스의 print()");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
    }

}
