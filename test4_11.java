import java.util.Scanner;

public class test4_11{
	public static void main(String[] args){
		System.out.println("Please put into the number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}
	public static void printMatrix(int n){
		int i = n;
		int j = n;
		for(;j>0;j--){
			for(;i>0;i--){
				double x = Math.random()*10;
				if(x>=5){
					System.out.print("1 ");
				}else
					System.out.print("0 ");
				
			}
			System.out.print("\n");
			i = n;
		}
}
}

