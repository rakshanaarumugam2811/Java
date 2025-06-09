package Program;

public class constructor {
	 String language;
	   String name;
	   int year;
             constructor(String language, int year, String name){
            		   this.name=name;
            		   this.year=year;
            		   this.language=language;         	   
            	   }
             //copy constructor
              constructor(constructor copy) {
            	  this.name=copy.name;
       		   this.year=copy.year;
       		   this.language=copy.language;
			}
            	   void Display() {
            		   System.out.println("Default constructor"+" "+name+ " "+year);
            		   
            		   }
            	   public static void main(String[] args) {
            		   constructor r=new constructor("JAVa", 1995, "Programming");
            		  
            		   r.Display();
            		   constructor r1=new constructor(r);
            		   System.out.println("COPY CONSTRUCTOR");
            		   r1.Display();
            	   }

			}

