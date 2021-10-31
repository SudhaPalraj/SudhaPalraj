package week1day1;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int fact=1;
		
		for (int i = 1; i <= 5; i++) {
			
			//System.out.println(i);
		
			fact=fact*i;
			//System.out.println(fact);
			
		}
		
		System.out.println("The factorial of number 5 is " + fact);
	}

}
