import java.util.Arrays;
import java.util.List;

public class wildCardPractice {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        System.out.println("sum = "+sumOfList(li));
    }
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for(Number n : list){
            s+=n.doubleValue();
        }
        return s;
    }
    public static void printlist(List<?>list){
        for(Object elem : list){
            System.out.print(elem+" ");
        }
    }

    public static void addNumber(List<? super Integer>list){
        for(int i=0; i<=10; i++){
            list.add(i);
        }
    }
}
