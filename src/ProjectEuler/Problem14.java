package ProjectEuler;

public class Problem14 {
    public static void main(String[] args){
    	long num = 0;
        int count = 0;
        int highest = 0;
        
        for(int i = 1; i < 1000000; i++){
            num = i;
            while(num != 1){
                if(num%2 == 0)
                    num /= 2;
                else
                    num = (num*3) + 1;
                count++;
            }
            if(count > highest){
            	highest = count;
            	System.out.println("new highest is " + i + " at " + highest);
            }
            count = 0;
        }
    }
}
