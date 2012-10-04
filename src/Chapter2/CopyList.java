package Chapter2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class CopyList {
    
    public ArrayList<Object> copyToArrayList(LinkedList<?> list){
        ArrayList<Object> arrayList = new ArrayList<Object>(list.size());
        
        ListIterator<?> iter = list.listIterator();
        
        while(iter.hasNext()){
            arrayList.add(iter.next());
        }
        
        return arrayList;
    }
    
    public LinkedList<Object> copyToLinkedList(ArrayList<?> list){
        LinkedList<Object> linkedList = new LinkedList<Object>();
        
        for(Object o : list)
            linkedList.addLast(o);
        
        return linkedList;
    }
}