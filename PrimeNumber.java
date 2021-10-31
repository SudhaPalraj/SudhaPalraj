package week1day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =13;
		boolean a =false;
		
		for (int i = 2; i < num/2; i++) {
			
			if (num%i==0) {
				
				a=true;
				
			}
			
			
		}
		
		if(!a) 
			System.out.println(num + " is a prime number");
		
		else
			
			System.out.println(num + " is NOT a prime number");
		
		
		


	}

}
