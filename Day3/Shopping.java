package Day3;
//Method loading
public class Shopping {
void add_to_cart(String category,int price) {
	System.out.println("your category:"+category);
	System.out.println("item price:"+price);
}
void add_to_cart(String category,int price,int quantity) {
	int total = price*quantity;
	System.out.println("Total price:"+total);
}
public static void main(String[] args) {
	Shopping in=new Shopping();
	in.add_to_cart("Shirt",250);
	in.add_to_cart("Shirt", 250,2);
}
}
