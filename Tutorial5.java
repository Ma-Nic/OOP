import java.text.DecimalFormat;
import java.util.Scanner;

public class Tutorial5 {
	public static void main(String[] args)
	{
	Scanner kboard = new Scanner(System.in);
	DecimalFormat dec = new DecimalFormat("#.00");
	double wage = 0;
	double taxP = 0.25;
	
	
	System.out.println("Please enter your wage");
	wage = kboard.nextDouble();
	
	double taxA = wage * taxP;
	double wageA = wage - taxA;
	
	System.out.println("Your wages after tax are "+dec.format(wageA));
	kboard.close();
	}
}
