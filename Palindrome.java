import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter letters to check");
		String str = userInput.toString();
		int start = 0;
		int end = str.length() - 1;
		int i = str.length();
		while(i != 0) {
			if(str.charAt(start) != str.charAt(end)) {
				System.out.println("Not a Palindrome");
			}
			else {
				start++;
				end--;
			}
			i--;
		}
		if(i == 0) {
			System.out.println("Is a Palindrome");
		}
	}
}
