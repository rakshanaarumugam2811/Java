package Day4;
      ///abstract
abstract class program {
      abstract void m1();
}
class display extends program{
	void m1() {
		System.out.println("JAVA");
	}
}
class Main{
	public static void main(String[] args) {
		display d=new display();
		d.m1();
	}
}