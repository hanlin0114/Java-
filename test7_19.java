import java.util.Scanner;
import java.lang.String;

public class test7_19{
	public static void main(String[] Args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		final int begin =(int) 'A';
		final int End = (int) 'Z';
		char[] str = input.next().toCharArray();
		for(int i=0;i<str.length;i++){
			int x = (int) str[i];
			if(x>=begin&&x<=End)
				count++;
		}
		System.out.println(count);
	}
}