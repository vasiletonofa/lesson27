package employee;

import java.util.*;

public class CustomQueue<E> {

    int counter = 0;
    List<E> list = new ArrayList<>();
    
    public void offer(E val) {
        list.add(val);
    }

    public E peek() {
        return list.get(counter++);
    }
}