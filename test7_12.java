import java.util.Scanner;
import java.lang.String;

public class test7_12{
	public static void main(String[] Args){
		Scanner input = new Scanner(System.in);
		boolean r1 = isAnagram("silent","listen");
		boolean r2 = isAnagram("garden","ranged");
		boolean r3 = isAnagram("split","lisp");
		boolean r4 = isAnagram("split","lisps");
		System.out.print(r1+" "+r2+" "+r3+" "+r4);
	}
	public static boolean isAnagram(String s1,String s2){
		StringBuilder strBuilder2 = new StringBuilder(s2);
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				for(int j=i;j<s1.length();j++){
					if(s1.charAt(i)==strBuilder2.charAt(j)){
						strBuilder2.setCharAt(j, strBuilder2.charAt(i));
						strBuilder2.setCharAt(i, s1.charAt(i));
						break;
					}else if(j==s1.length()-1)
						return false;
				}
				if(i==s1.length()-1)
					return true;
			}
		}
		return false;
	}
}