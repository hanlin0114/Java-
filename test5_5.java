import java.util.Scanner;

public class test5_5{
	public static int total = 0;
	public static void main(String[] args){
		System.out.println("Please put into the number: ");
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		int[] check = new int[]{1,1,1,1,1,1,1,1,1,1};
		for(int i=0;i<10;i++){
			num[i] = input.nextInt();
		}
		for(int j=0;j<10;j++){
			for(int k=0;k<10;k++){
				if(num[j]==num[k]&&check[k]==1&&j!=k){
					check[j]=-1;
				}
			}
		}		
		for(int h=0;h<10;h++){
			if(check[h]==1)
			System.out.print(num[h] + " ");
	}
		}
}