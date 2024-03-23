import java.util.Scanner;
public class Practice{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int a=sc.nextInt();

		int i=1;
		while(i<a){
			i++;
			if(a%i==0){
				System.out.println("Not Prime");
				break;
			}
			else{
				System.out.println("Prime");
				break;
			}
			
		}
	}
}