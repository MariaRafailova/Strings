import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

//		String str = "asd-12sdf45-56asdf100";
		
		System.out.println("Please enter the string:");
		StringBuilder sb = new StringBuilder(sc.next());

		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < sb.length(); i++) {

			if (sb.charAt(i) == '-') {
				sb2.append("," + sb.charAt(i));
			}

			if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9' && i != 0) {
				if ((sb.charAt(i - 1) >= 'A' && sb.charAt(i - 1) <= 'Z')
						|| (sb.charAt(i - 1) >= 'a' && sb.charAt(i - 1) <= 'z')) {
					sb2.append("," + sb.charAt(i));
				} else if (sb.charAt(i - 1) == '-' || (sb.charAt(i - 1) >= '0' && sb.charAt(i - 1) <= '9') || i == 0) {
					sb2.append(sb.charAt(i));
				}
			}
		}
		if (sb2.charAt(0) == ',') {
			sb2.deleteCharAt(0);
		}

		String str2 = sb2.toString();

		String[] arr = str2.split(",");

//		System.out.println(Arrays.toString(arr));

		int[] strInt = new int[arr.length];

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			strInt[i] = Integer.parseInt(arr[i]);
			sum += strInt[i];
		}

		System.out.println("The sum is: " + sum);
	}

}
