import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter two words with 10-20 chars:");
	String str1 = sc.next();
	String str2 = sc.next();
	
	if(str1.length()+str2.length()>10 && str1.length()+str2.length()<20){
		String newStr1 = str1.replaceFirst(str1.substring(0, 5), str2.substring(0, 5));
		String newStr2 = str2.replaceFirst(str2.substring(0, 5), str1.substring(0, 5));
		
		System.out.println(newStr1.length() >= newStr2.length() ? 
							newStr1.length()+" "+newStr1 :
							newStr2.length()+" "+newStr2);
	}
	else {
		System.out.println("The words don't have from 10 to 20 chars");
	}
}
}
