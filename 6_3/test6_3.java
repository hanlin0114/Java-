import java.util.Scanner;

public class test6_3{
	public static void main(String[] Args){
		Account user1;
		user1 = new Account(1122,20000.0,0.0045);
		user1.withdraw(2500);
		user1.deposit(3000);
		System.out.print(user1.getBalance()+" "+user1.getMonthlyInterestRate());
	}
}