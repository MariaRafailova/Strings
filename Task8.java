import java.util.Scanner;

public class Task8 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string:");
		String str = sc.next();

		if (str.length() % 2 != 0) {

			boolean palindrome = true;
			for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
				if (str.charAt(i) != str.charAt(j)) {
					palindrome = false;
					break;
				}
			}

			System.out.println(palindrome ? "Yes" : "No");

		} else {
			System.out.println("No");
		}
	}
}
