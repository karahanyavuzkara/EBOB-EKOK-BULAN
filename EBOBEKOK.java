package patika;
import java.util.Scanner;
public class EBOBEKOK {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("n1 sayısını giriniz : ");
		int n1 = input.nextInt();
		System.out.print("n2 sayısını giriniz : ");
		int n2 = input.nextInt();
		
		int ebob = 1 ;
		int ekok ; 
		if (n1 < n2 ) {
			for (int i = 1 ; i <= n1 ; i++ ) {
				if ( n1 % i == 0 && n2 % i == 0 ) {
					
	    		     ebob = i ; 
	 	             
				}
			}
			
		}
		System.out.println("Bu iki sayının EBOB değeri : " + ebob);
		ekok = (n1*n2) / ebob ; 
	    System.out.print("Bu iki sayının EKOK değeri : " + ekok);
	
	}
	
}
