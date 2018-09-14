import java.text.DecimalFormat;
import java.util.Scanner;

public class Tutorial7 
{
	public static final double METRE_CONV = 0.305;
	public static final double LBS_CONV = 2.205;
	public static final double EURO_CONV = 1.26;
	public static final int TEMP_CONS1 = 32;
	public static final double TEMP_CONS2 = 1.8;
	
	
	public static void main(String[] args)
	{
	Scanner kboard = new Scanner(System.in);	
	DecimalFormat df = new DecimalFormat("#.00");
	
	
	double Feet = 0;
	double Kgs = 0;
	double Pounds = 0;
	double Fahr = 0;
	double Cels = 0;
		
	System.out.println("Please enter number of feet: ");
	Feet = 	kboard.nextDouble();
	double Metre = Feet * METRE_CONV; 
	System.out.println(+Feet+" equals "+Metre+"m");
	
	
	kboard.close();
	}
} 
