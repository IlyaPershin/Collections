package pkg2Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.ListIterator;

public class PrimesGeneratorTest implements Iterator<Integer> {
    
    int i = 0;
    ArrayList<Integer> array;
    
    public void PrintArray(){
        while (this.hasNext()){
            Object element = this.next();
            System.out.print(element + " ");
        }
        System.out.println();
        Collections.reverse(this.array);
        this.i = 0;
        
        while(this.hasNext()) {
            Object element = this.next();
            System.out.print(element + " ");
        }
        System.out.println();
        Collections.reverse(this.array);
    }

    public PrimesGeneratorTest(ArrayList array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return i < this.array.size();
    }

    @Override
    public Integer next() {
        return this.array.get(i++);
    }
}
