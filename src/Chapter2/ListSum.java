
package Chapter2;

import java.util.List;
import java.util.ListIterator;

public class ListSum {
    public double sum2(List<?> list){
        double sum = 0;
        
        ListIterator<?> iter1 = list.listIterator();
        
        int index = 1;
        
        while (index < list.size()){
            Double val = (Double) iter1.next();
            ListIterator<?> iter2 = list.listIterator(index);
            
            while(iter2.hasNext())
                sum += val*(Double)iter2.next();
            
            index++;
        }
        
        return sum;
    }
}