package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		// = atama/assignment i�areti
		
		int sayi1 = 5;
		int sayi2 = 4;
		
		boolean isGreat = sayi1>sayi2; // true/ false 
		
		
		System.out.println(isGreat);//true
		
     boolean isSmall = sayi1<=sayi2;
     
     System.out.println(isSmall); //false
     
     boolean isEqual = sayi1==sayi2; // == esit mi anlam�na gelir ve comparison operator 
     
		System.out.println(isEqual);
		
		System.out.println(sayi1==5);
		
		System.out.println(sayi1*sayi2==20);
		System.out.println(sayi1+sayi2 !=9);
		
		System.out.println(sayi1-sayi2 !=0);
		
		// t�m mant�ksal ifadelerde �nlem kullan�ld���nda olumsuzluk anlam� katar
		
		
	}

}
