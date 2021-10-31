package week1day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumm=0,secNum=1;
		int sum;
		
		System.out.println(firstNumm);
		
		
		for (int i = 1; i < 8; i++) {
			
			
			sum=firstNumm+secNum;  //sum=1
			
			firstNumm=secNum; //firstNum=1
			
			secNum= sum;//secNum=1
			
			System.out.println(sum);
			
		}
		
		
		
	}

}
