package Day3;
//subclass 
 class superclass {
	 void method() {
		 System.out.println("Method 1");
		
	 }
              
}
 // subclass1
 class subclass1 extends superclass{
	 void method2() {
		 System.out.println("Method2");
	 }
	 
 }
 class subclass2 extends subclass1{
	 void method3() {
		 System.out.println("Method 3");
	 }
 }
 public class Multilevel{
	 public static void main(String[] args) {
		 subclass1 s=new subclass1();
		 s.method();
		 s.method2();
	 }
 }