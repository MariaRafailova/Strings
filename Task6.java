import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter separated words:");
	String str = sc.nextLine();
	
	String[] parts = str.split(" ");
	
	for (int i = 0; i < parts.length; i++) {
		char first = parts[i].toUpperCase().charAt(0);
		String rest = parts[i].substring(1).toLowerCase();		
		
		String result = first+rest;
		System.out.print(result + " ");
	}
}
}
