package day01;

public class C2_Variables {

	public static void main(String[] args) {
		
		int sayi; // ; yazim dilindeki nokta gibidir.Java ; gorunce o satirdaki kod yaziliminin bittigini anlar
		sayi=27;
		
		System.out.print(sayi); // print yazsaydik alt satira gecmezdi
		
		char ilkHarf='M';
		
		System.out.println(ilkHarf); //println yazinca alt satira gecer
		
		double sayiDouble = 5.34;
		
		System.out.println(sayiDouble); 
		System.out.println(sayi + sayiDouble);  // 32.34
		System.out.println(sayi + ilkHarf);  //27 + 104 
		// eger bir toplamada char degiskeni kullanilirsa ascii degerini toplar
		
		
		
		
	}
	
}
