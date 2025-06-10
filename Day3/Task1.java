package Day4;
class SbiAcc{
	private String Accholder;
	private int balance; 
	
	public  SbiAcc(String Accholder,int balance) {
		this.Accholder=Accholder;
		this.balance=balance;
	
	}
	public String getAccholder() {
		return Accholder;
	}
	public int getbalance() {
		return balance;
	}
	public void Deposite(int dep) {
		if(balance>0) {
		balance+=dep;
		 System.out.println("Deposite Amout:"+dep);
		 System.out.println("Total amt:"+balance);
		 
		}
	}
	public void setAccholder(String Accholder) {
	this.Accholder=Accholder;
	}
	public void setwithdraw(int withdraw) {
		balance -= withdraw;
		System.out.println("Withdrawn amt:"+withdraw);
	}
}

public class Task1 {
    public static void main(String[] args) {
    	SbiAcc ac=new SbiAcc("Rithi", 30000);
    	System.out.println("Account holder name:"+ac.getAccholder());
    	ac.setAccholder("Keerthu");
    	System.out.println("update:"+ac.getAccholder());
    	System.out.println(ac.getbalance());
    	ac.Deposite(50000);
    	ac.setwithdraw(79999);
    	System.out.println("Available bal:"+ac.getbalance());
    }
}
