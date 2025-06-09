package Program;

public class singlelevel { //super class

     void Message() {
    	 System.out.println("client");
     }
}
class subclass extends singlelevel {
	void Raw() {
		System.out.println("server");
	}
}
class Main{
	public static void main(String[] args) {
		subclass ref=new subclass();
		ref.Message();
		ref.Raw();
	}
}