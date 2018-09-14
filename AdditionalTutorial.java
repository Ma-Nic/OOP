import java.text.DecimalFormat;
import java.util.Scanner;

public class AdditionalTutorial {

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
	System.out.println(+Feet+"ft equals "+Metre+"m");
	
	System.out.println("Please enter number of Kgs: ");
	Kgs = 	kboard.nextDouble();
	double Lbs = Kgs * LBS_CONV; 
	System.out.println(+Kgs+"Kg equals "+Lbs+"lbs");
	
	System.out.println("Please enter number of £: ");
	Pounds = 	kboard.nextDouble();
	double Euros = Pounds * EURO_CONV; 
	System.out.println("£"+df.format(Pounds)+" equals €"+df.format(Euros));
	
	System.out.println("Please enter the temperature in Fahrenheit:");
	Fahr = 	kboard.nextDouble();
	Cels =  (Fahr - TEMP_CONS1) / TEMP_CONS2;
	System.out.println(+Fahr+"F equals "+Cels+"C");
	
	System.out.println("Please enter the temperature in Celsius:");
	Cels = 	kboard.nextDouble();
	Fahr =  (Cels * TEMP_CONS2) + TEMP_CONS1;
	System.out.println(+Cels+"C equals "+Fahr+"F");
	
	
	kboard.close();
	}
}
