package Chapter3;

import java.util.NoSuchElementException;

public class StringStack {
    
    // A. This code does not correctly implement the push and pop methods
    // B. A new object does not need to be made for each element in this stack.
    //    If you simply want a stack of characters, this is fast and simple.
    // C. Code overwritten by D.
    // D. See current code.
    
    private StringBuffer buffer;
    
    public void push(char c){
        buffer.append(c);
    }
    
    public char pop(){
        if(buffer.length() > 0){
            char temp = buffer.charAt(buffer.length()-1);
            buffer.deleteCharAt(buffer.length()-1);
            return temp;
        }
        else{
            throw new NoSuchElementException();
        }
    }
}
