import java.util.Scanner;
public class Lab2_1{
	public static void main(String[] args) {
		
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		
		System.out.println("Sum through Command line="+(a+b));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		System.out.println("Sum through Scanner="+(c+d));
	}
}