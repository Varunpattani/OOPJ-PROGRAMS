import java.util.Scanner;
public class Lab2_2{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
	
		System.out.println("Enter number 2:");
		int b=sc.nextInt();

		System.out.println("Enter Operation +,-,/,*:");
		String c=sc.next();
		

		switch(c){
		case "+":
			System.out.println("Sum="+(a+b));
			break;
		case "-":
			System.out.println("Diff="+(a-b));
			break;
		case "*":
			System.out.println("Sum="+(a*b));
			break;
		case "/":
			System.out.println("Sum="+(a/b));
			break;
		default:
			System.out.println("Invalid operator");


		}
		
	}
}