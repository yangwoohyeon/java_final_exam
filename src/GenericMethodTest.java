public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] iArray={1,2,3,4,5};
        Double[] dArray={1.1,2.2,3.3,4.4,5.5};
        Character[] cArray={'K','O','R','E','A'};

        printArray(iArray);
        printArray(dArray);
        printArray(cArray);
    }
    public static <T> void printArray(T[] array){
        for(T element : array){ //향상된 for문
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static <T extends Comparable> T getMax(T[] a){
        if(a==null||a.length==0){
            return null;
        }
        T largest = a[0];

        for(int i=0; i<a.length; i++){
            if(largest.compareTo(a[i])<0){
                largest=a[i];
            }
        }
        return largest;
    }
}
