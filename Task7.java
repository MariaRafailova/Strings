import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете набор от думи разделени с интервал:");
	String str = sc.nextLine();
	
	String[] words = str.split(" ");	
	
	int maxLength = 0;
	for (int i = 0; i < words.length; i++) {		
		if(words[i].length() > maxLength){
			maxLength = words[i].length();
		}
	}
	System.out.printf("%d думи, най-дългата е с %d символа.", words.length, maxLength);
}
	
}
