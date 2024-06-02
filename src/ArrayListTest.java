import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Milk");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1,"APPLE");
        list.set(2,"GRAPE");
        list.remove(3);
        String s;
        Iterator e = list.iterator();
        while(e.hasNext()){
            s=(String)e.next();
            System.out.println(s);
        }

        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        link.add(1,"d");
        for(int i=0; i<link.size(); i++){
            System.out.print(link.get(i)+" ");
        }


    }
}
