import java.util.Scanner;
public class Lab3_3{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int n =(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		if(n==a){
			System.out.println(a+" is largest");
		}
		else if(n==b){
			System.out.println(b+" is largest");
		}
		else{System.out.println(c+" is largest");}
	}
}