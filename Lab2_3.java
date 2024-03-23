import java.util.Scanner;

public class Lab2_3{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Radius:");
		Double a=sc.nextDouble();

		Double b=Math.PI*a*a;
		System.out.println("Area of Circle="+b);

	}
}