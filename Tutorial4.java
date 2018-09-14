import java.util.Scanner;


public class Tutorial4 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int age = 0;
		String forename;
		String surname;
		
		System.out.println("Please enter your forename");
		forename = kboard.next();
		
		System.out.println("Please enter your surname");
		surname = kboard.next();
		
		System.out.println("Hello "+forename+" "+surname+" how old are you?");
		age = kboard.nextInt();
		
		System.out.println("Hello "+forename);
		System.out.println("You are "+age+" years old");
		kboard.close();
	}
}
