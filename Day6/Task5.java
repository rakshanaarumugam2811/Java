package Day6;

public class Task5 extends Thread {

	private String n;

	public Task5(String n) {

		this.n=n;

	}

	public void run() {

		for(int i=1;i<=5;i++) {

			System.out.println(n);

		try {

			Thread.sleep(500);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		}

	}

}

class Main{

public static void main(String[] args) {

	Task5 m=new Task5("HIII");

	Task5 m1=new Task5("Hello");

	m.start();

	m1.start();

}

}



