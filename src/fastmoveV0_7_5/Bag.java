
package fastmoveV0_7_5;

import java.util.Objects;


public class Bag<T> {
    private T[] items;
    private int count;

    public Bag() {
        this(10);
    }
    
    public Bag(int size) {
        this.items=(T[])new Object[size];
    }
    private void expand(){
        T[] temp=(T[])new Object[items.length+10];
        System.arraycopy(this.items, 0, temp, 0, count);
        this.items=temp;
    }
    public void add(T it){
        Objects.requireNonNull(it);
        this.items[this.count++]=it;
        if(this.count==this.items.length)
            this.expand();
    }

    public int getCount() {
        return count;
    }
    
}
