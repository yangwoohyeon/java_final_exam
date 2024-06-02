public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        b.set("Hello World");
        String s = (String)b.get();
        b.set(10);
        Integer i = (Integer)b.get();

        System.out.println(b.get());
        System.out.println(s);
    }
}
