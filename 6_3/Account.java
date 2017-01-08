public class Account {

	int id;
	double balance;
	double interestRate;
	public Account(int name,double bal,double rate){
		id = name;
		balance = bal;
		interestRate = rate;
	}
	public int getId(){
		return id;
	}
	public void setId(int i){
		id = i;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double bal){
		balance = bal;
	}
	public double getAnnualInterestRate(){
		return interestRate;
	}
	public void setAnnualInteresrRate(double rat){
		interestRate = rat;
	}
	public double getMonthlyInterestRate(){
		return interestRate/12;
	}
	public void withdraw(double amount){
		balance -=amount; 
	}
	public void deposit(double amount){
		balance +=amount;
	}
}
