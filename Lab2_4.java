import java.util.Scanner;
public class Lab2_4{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Fahrenheit:");
		Double a=sc.nextDouble();
		
		Double c;

		c=(a-32)*(5.0/9.0);
		System.out.println("Celsius="+c);
	}
}