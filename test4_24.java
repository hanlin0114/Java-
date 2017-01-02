import java.util.Scanner;

public class test4_24{
	public static int total = 0;
	public static void main(String[] args){
		System.out.println("Please put into the number: ");
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		System.out.println(sumDigits(x));
	}
	public static int sumDigits(long n){
	long nNext = n%10;
	total += nNext;
	n = n/10;
	if(n != nNext){
		sumDigits(n);
	}
	return total;
}
}
