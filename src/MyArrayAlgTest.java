public class MyArrayAlgTest {
    public static void main(String[] args) {
        String[] language = {"C++","C#","JAVA"};
        String last = MyArrayAlg.getLast(language);
        System.out.println(last);
        MyArrayAlg.swap(language,0,1);
        for(int i=0; i<3; i++){
            System.out.println(language[i]);
        }
    }
}
