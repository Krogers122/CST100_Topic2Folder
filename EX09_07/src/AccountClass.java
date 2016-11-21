import java.util.Date;

public class Account  {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;		
	private Date dateCreated;
	//first account 
	public AccountClass() {
		 this.id = id;
		 this.balance = balance;
		 this.annualInterestRate = annualInterestRate;
		 this.dateCreated = new Date();
		 	 }
	
	 public void setID(int id) {
		this.id=id;
			 }
	 public int getID() {
		return this.id; 
	 }
	 
	 public void setbalance(double balance){
		this.balance = balance;
			 }
	 public double getbalance(){
		return this.balance; 
	 }
	 
	 public void setAnnualInterestrate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate; 
	 }
	 
	 public double getAnnualInterest(){
		return this.annualInterestRate; 
	 }
	 
	 public Date getDateCreated(){
		return this.dateCreated; 
	 }
	 
	 public double getMonthlyInterestRate(){
		 return (this.annualInterestRate)/12;
	}
		
	 public void withdraw(double amount){
	 if (this.balance <amount)
	 }
	 {
	 System.out.println("Insufficient balance in the account");
	 }
		else
	{
		this.balance -=amount;
		System.out.println ("After withdrawing  " + amount + "balance in " + "account is: " + this.balance);
	}
		
}

	public static void main(String args[] {
	Account ac= new Account (1122, 20000, 4.5);
	ac.withdraw(2500);
	ac.depost(3000);
	
	System.out.println("balance in account " + ac.getID() + "is: " + ac.getbalance());
	System.out.println("Monthly Interest is: " + (ac.getMonthlyInterstRate() * ac.getbalance())/100);
	System.out.println("Account is created on: " + ac.getDateCreated());
	}
}