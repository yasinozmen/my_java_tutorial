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
								 // ama 478.0 yazdýrdý çünkü 
								// java önce eþitliði sað tarafýný yapar 
							   //  sað taraf 3 tanesinide int java sonucunu 478.8 bulur
							  // ancak hepsi int olduðu için java sonucu int olarak hesaplar virgüllü kýsmý sýfýr yaptý
							 // sonra assignment(atama) yapar
						    // auto wid yapar
		
		double num5 = 24.56;
		double num6 = 14.2;
		
		double num7 = num5 / num6 ;
		
		System.out.println(num7);
		// sayýlarýn ikiside double olduðu için sonuç tam virgüllü çýkar
		 
		System.out.println(num5 / num3); //24.56 / 10
		
		
		// biri daouble biri int olursa daouble yani geniþ olana göre davranýr
		
		double num8 = (double)num1 * num2 / num3; //478.8  bu iþlemde sonucun tam virgüllü olmasýný istersek baþa double yazarýz
												// birisi daouble olursa sonuç da double olur geniþe göre davranýr
		
		System.out.println(num8);
	}

}
