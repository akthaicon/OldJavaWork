import java.util.Scanner;

public class Java1 {


	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter integer grade");

	String s;

	char g;

	int grade = scan.nextInt();

	if(grade < 0 || grade > 100) {

		s ="ERROR You have entered an invalid input";

		System.out.println(s);

	} 
	else {

	if(grade>=90) {

		g = 'A';

	} 
	else if(grade>=80 && grade<90) {

		g = 'B';

	} 
	else if(grade>=70 && grade<80) {

		g = 'C';

	} 
	else if(grade>=60 && grade<70) {

		g = 'D';

	} 
	else {

		g ='F';
	}

	System.out.printf("You have earned the letter grade: %c\n",g);
		}
	}
}
	

