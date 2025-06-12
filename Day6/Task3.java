package Day6;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
public class Task3 {
        public static void main(String[] args) {
        	HashMap<String,Integer> studentMarks=new HashMap();
        studentMarks.put("Resh", 130);
        studentMarks.put("ert", 10);
        studentMarks.put("Dxg", 110);
        int totalmarks=0;
        for(int Marks:studentMarks.values()) {
        	totalmarks +=Marks;
        	
        }
        System.out.println(totalmarks);
        		double average=totalmarks/studentMarks.size();
        		System.out.println(average);
        		for(Map.Entry<String,Integer> entry:studentMarks.entrySet()) {
        			System.out.println(entry.getKey()+" "+entry.getValue());
        		}
        	
        }
}
