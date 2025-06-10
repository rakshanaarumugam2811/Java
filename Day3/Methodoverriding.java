package Day4;

 class LAPTOP{
  void Os() {
	  System.out.println("Window 10");
  }
}
class Update extends LAPTOP{
	void Os() {
		System.out.println("Window 11");
	}
}
public class Methodoverriding{
	public static void main(String[] args) {
		Update u=new Update();
		u.Os();
	}
}