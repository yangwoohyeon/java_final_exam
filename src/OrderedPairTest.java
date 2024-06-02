public class OrderedPairTest {
    public static void main(String args[]){
        OrderedPair<String,Integer> orderedPair = new OrderedPair<String,Integer>("양우현",2020037026);
        System.out.println(orderedPair.getKey()+" "+orderedPair.getValue());
    }
}
