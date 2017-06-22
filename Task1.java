import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the first string:");
	String str1 = sc.nextLine();
	System.out.println("please enter the second string:");
	String str2 = sc.nextLine();
	
	if (str1.length()<= 40 && str2.length()<= 40) {
		
		System.out.print(str1.toUpperCase() + " " + str1.toLowerCase());
		System.out.println();
		
		System.out.print(str2.toUpperCase() + " " + str2.toLowerCase());
		System.out.println();
		
	}
	else {
		System.out.println("The strings are bigger than 40 simbols");
	}
}
}
