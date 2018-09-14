import java.util.Scanner;
public class Tutorial3 {

	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int age = 0;
		
		System.out.println("Hello your name how old are you?");
		age = kboard.nextInt();
		System.out.println("You are "+age+" years old");
		kboard.close();
	}
	
}
