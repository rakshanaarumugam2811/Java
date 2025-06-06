package Day2;

public class Array {
        public static void main(String[] args) {
        	/*int[] number=new int[5];
        	number[0]=1;
        	number[1]=2;
        	number[2]=3;
        	number[3]=4;
        	number[4]=5;*/
        	int[] number= {1,2,3,4,5};
        	int sum=0;
        	System.out.println(number[3]);
        	System.out.println(number.length);
        for(int i=0;i<=number.length-1;i++) {
        	sum=sum+number[i];
        System.out.println(number[i]);}
        	
        	//reverse
        	//for(int i=number.length-1;i>=0;i--) {//
        		//System.out.println(number[i]);//
        	//}
        	System.out.println("sum is:"+sum);
        	
        	
        	
        }
        
        	
        
        
}
