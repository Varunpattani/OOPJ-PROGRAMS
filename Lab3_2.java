import java.util.Scanner;
public class Lab3_2{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		
		int res=0,n,ld;
		n=a;
		
		while(a!=0){
			ld=a%10;
			res=res*10+ld;
			a=a/10;
       	}
		
		if(res==n){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}

}