package day05;



public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// AND && , OR  || 
		
		boolean isTrue = 5>4 && 7-3>0;  // ve operatorunde bir tane false varsa sonuç false olur true için ikisinde true olmasý lazým
		System.out.println(isTrue);
		
		int x = 10;
		int y = 5;
		
		
		
		System.out.println(x/y == 2 && x*y>20 && x-y>0);

		System.out.println(x+y<0 && x-y>0 );
		
		// OR operatoru 1 tane dogru vasa dogru 
		
	
		
		System.out.println(x<y || x+y<0 || x*y>0);
		
		
	}

}
