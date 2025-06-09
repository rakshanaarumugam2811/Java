package Program;

public class Laptop {
	String model;
	 int size;
             Laptop(String model,int size){
            	 this.model=model;
            	 this.size=size;
             }
             void display() {
            	 System.out.println("Lap"+" "+model+" "+size);
             }
             public static void main(String[] args) {
            	 Laptop e=new Laptop("acer",45);
            	 e.display();
             }
}
                                                                                                                     