import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first word:");
		String str1 = sc.next();
		System.out.println("Please enter the second word:");
		String str2 = sc.next();

		char[][] result = new char[str1.length()][str2.length() * 2 - 1];

		for (int i = 0; i < str1.length(); i++) {
			if(str2.indexOf(str1.charAt(i)) == -1){
			result[i][str2.length() - 1] = str1.charAt(i);
			System.out.println(result[i][str2.length() - 1]);
			}
			else if (str2.indexOf(str1.charAt(i)) != -1) {
//				int ind = str2.indexOf(str1.charAt(i));
//				....
				for (int j = 0; j < str2.length(); j++) {
					result[i][str2.length() - 1] = str2.charAt(j);
					System.out.print(result[i][str2.length() - 1]);					
				}
				System.out.println();
			}
		}
	}
}
