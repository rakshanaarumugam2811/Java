package Day6;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
public class Task1 {
       public static void main(String[] args) {
    	   ArrayList<Object> arr=new ArrayList<Object>();
    	   arr.add("Raks");
    	   arr.add("B");
    	   arr.add("Computer Technology");
    	   arr.add("Final year");
    	   arr.add(0,"Keethu");
    	   arr.get(2);
    	   arr.set(4,"Kg");
    	   arr.remove(2);
    	   arr.add(4,"Web developer");
    	   for(Object data:arr) {
    		   System.out.println(data);
    		   
    	   }
       }
}
