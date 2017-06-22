import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter two strings:");
		String str1 = sc.next();
		String str2 = sc.next();

		int smaller = 0;
		if (str1.length() > str2.length()) {
			smaller = str2.length();
			System.out.println("The first string has bigger length.");
		} else if (str1.length() < str2.length()) {
			smaller = str1.length();
			System.out.println("The second string has bigger length.");
		} else {
			smaller = str2.length();
			System.out.println("The strings have an equal lengths.");
		}

		for (int i = 0; i < smaller; i++) {
			if(str1.charAt(i) != str2.charAt(i)){
				System.out.printf("%d %s-%s\n", i,str1.charAt(i),str2.charAt(i));
				
			}
				
		}
		
	}
}
