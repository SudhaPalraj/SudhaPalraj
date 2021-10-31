package week2.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator objcalc=new Calculator();
		
		
		int sum=objcalc.add(20,30, 40);
		
		System.out.println("The sum of 3 numbers is " +sum);
		
		
		int sub=objcalc.sub(100, 20);
		
		System.out.println("The difference of 2 numbers " +sub);
		
		
		double mul=objcalc.mul(12.5, 2.5);
		
		System.out.println("The product of 2 numbers " +mul);
		
		
		float div=objcalc.div(40.252F, 20.345F);
		
		System.out.println("The divison of 2 numbers is " +div);
		
		
	}

}
