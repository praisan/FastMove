package fastmoveV0_7_8;

public interface Bag<T> extends Iterable<T> {

    boolean add(T t);

    boolean remove(T t);

    boolean contains(T t);

    int size();
}
