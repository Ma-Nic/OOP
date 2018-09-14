import java.text.DecimalFormat;
import java.util.Scanner;

public class Tutorial6 {
	public static void main(String[] args)
	{
	Scanner kboard = new Scanner(System.in);
	DecimalFormat dec = new DecimalFormat("#.00");
	int empNo = 0;
	int hourNo = 0;
	int hourRate = 0;
	
	System.out.println("Please enter your employee number");
	empNo = kboard.nextInt();
	
	System.out.println("Please enter the hours you worked");
	hourNo = kboard.nextInt();
	
	System.out.println("Please enter your hourly rate");
	hourRate = kboard.nextInt();
	
	double wageTotal = hourNo * hourRate;
	
	System.out.println("Employee "+empNo+" your wages are £"+dec.format(wageTotal));
	kboard.close();
	}
}