import java.util.Scanner;

public class test4_2{
	public static void main(String[] args){
		System.out.println("Please put into the number: ");
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		System.out.println(sumDigits(x));
	}
	public static int sumDigits(long n){
	long nNext = n%10;
	int total = 0;
	total += nNext;
	while(nNext != n){
		n = n/10;
		nNext = n%10;
		total += nNext;
	}
	return total;
}
}

