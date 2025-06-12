package Day6;

public class Task4  extends Thread {
          public void run() {
        	  System.out.println("Java");
          }
}
class Execute {
	public static void main(String[] args) {
	Task4 m=new Task4();
		m.start();
	}
}
