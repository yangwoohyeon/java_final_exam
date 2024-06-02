public class OrderedPair<K,T> {
    private K key;
    private T value;
    public OrderedPair(K key, T value){
        this.key=key;
        this.value=value;
    }

    public K getKey(){
        return key;
    }
    public T getValue(){
        return value;
    }

}
