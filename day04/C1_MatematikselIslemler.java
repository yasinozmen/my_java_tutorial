package day04;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {
		
		int num1 = 38 / 2*( 4 + 3 ) * 2;
		int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12;
    
		System.out.println(num1);
	
		System.out.println(num2);
		
		
		int num3 = 10;
		
		double num4 = num1 * num2 / num3;
		
		System.out.println(num4); // 266 * 18 / 10 = 478.8 
								 // ama 478.0 yazd�rd� ��nk� 
								// java �nce e�itli�i sa� taraf�n� yapar 
							   //  sa� taraf 3 tanesinide int java sonucunu 478.8 bulur
							  // ancak hepsi int oldu�u i�in java sonucu int olarak hesaplar virg�ll� k�sm� s�f�r yapt�
							 // sonra assignment(atama) yapar
						    // auto wid yapar
		
		double num5 = 24.56;
		double num6 = 14.2;
		
		double num7 = num5 / num6 ;
		
		System.out.println(num7);
		// say�lar�n ikiside double oldu�u i�in sonu� tam virg�ll� ��kar
		 
		System.out.println(num5 / num3); //24.56 / 10
		
		
		// biri daouble biri int olursa daouble yani geni� olana g�re davran�r
		
		double num8 = (double)num1 * num2 / num3; //478.8  bu i�lemde sonucun tam virg�ll� olmas�n� istersek ba�a double yazar�z
												// birisi daouble olursa sonu� da double olur geni�e g�re davran�r
		
		System.out.println(num8);
	}

}
