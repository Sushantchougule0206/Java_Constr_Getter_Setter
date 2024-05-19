package Constr_Getter_Setter.bank;

public class Account {
	private int accountno;
	private String name;
	private double balance;
	
	public Account() {
		accountno=10;
		name="amit";
		balance=10000;
	}
	public Account(int actno,String nm,double bal) {
		
		accountno=actno;
		name=nm;
		balance=bal;
		
	}
	
	public void showDetalis() {
		System.out.println("account no:"+accountno+" customer name:"+name+" Balance:"+balance);
	}
	
	public double getBalance(double amount) {
		balance=balance-amount;
		return balance;
	}
	

}
