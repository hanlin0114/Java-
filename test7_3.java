import java.util.Scanner;
import java.lang.String;

public class test7_3{
	public static void main(String[] Args){
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëµÚÒ»´®×Ö·û´®£º ");
		String x1 = input.next();
		System.out.println("ÇëÊäÈëµÚ¶ş´®×Ö·û´®£º ");
		String x2 = input.next();
		System.out.print(sonChar(x1,x2));
		
	}
	public static boolean sonChar(String str1,String str2){
		int length1 = str1.length();
		int length2 = str2.length();
		boolean result = false;
		char sonStr = str2.charAt(0);
		for(int i=0;i<=length1-length2;i++){
			char parentStr = str1.charAt(i);
			if(sonStr==parentStr){
				for(int j=0;j<length2;j++){
					if(str1.charAt(i+j)!=str2.charAt(j)){
						break;
					}else if(j==length2-1){
						result = true;
						return result;
					}
				}
				if(i==length1-length2)
					result = false;
			}
		}
		return result;
	}
}