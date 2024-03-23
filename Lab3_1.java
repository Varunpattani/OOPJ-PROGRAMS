import java.util.Scanner;
public class Lab3_1{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		Double[] a=new Double[5];
	
		for(int i=0;i<5;i++){
			System.out.println("Enter Marks of Subject"+(i+1)+":");
			a[i]=sc.nextDouble();
		}
		
		double sum=0;

		for(int i=0;i<5;i++){
			sum+=a[i];
		}
		double p=sum/5.0;

		if (p > 60 && p <= 100) {
			System.out.println("First Division");
		}
		else if (p > 50 && p <= 60) {
			System.out.println("Second Division");
		}
		else if (p > 40 && p <= 50) {
			System.out.println("Third Division");
		}
		else if (p <= 40 && p >= 0) {
			System.out.println("Fail");
		}

		

	}
}