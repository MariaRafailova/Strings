import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a word:");
	String str = sc.next();
	
	char[] arr = new char[str.length()];
	
	for (int i = 0; i < str.length(); i++) {
		arr[i] = (char)(str.charAt(i)+5);
	}
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
}
}
