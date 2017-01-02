import java.util.Scanner;

public class test4_6{
	public static void main(String[] args){
		System.out.println("Please put into two numbers: ");
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int x2 = input.nextInt();
		System.out.println("The max common divisor of the two numbers is :" + gcd(x1,x2));
	}
	public static int gcd(int m,int n){
		int xGcd = 0;
		if (m>=n) 
			 xGcd = m;
		else
			 xGcd = n;
		for(;xGcd>=1;xGcd--){
			if(m%xGcd==0&&n%xGcd==0){
				break;
			}
		}
		return xGcd;
}
}

