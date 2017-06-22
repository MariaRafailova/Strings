import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the three names of two people, " + "separated with comma:");
		String str = sc.nextLine();

		String[] parts = str.split(",");
		
		System.out.println(countAscii(parts[0]) > countAscii(parts[1]) ?
							parts[0] : parts[1].trim());
	}

	static int countAscii(String part) {
		int sum = 0;
		for (int i = 0; i < part.length(); i++) {
			if(part.charAt(i) != ' '){
				sum += part.charAt(i);
			}
		}		
		return sum;
	}
}
