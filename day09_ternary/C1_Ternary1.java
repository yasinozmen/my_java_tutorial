package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		int sayi =10;
		// if else in teksat�rda 
		// ternary i�lemi bir sonuc dondurdugunden bir variable olu�turup 
		// ona assign etmeliyiz
		String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi";
		
		System.out.println(sonuc);

		// bir variableye asign etmek istemessem 
		// ve sonucuda g�rmek istersek
		// o zman syso i�ine yazar�m
		
		System.out.println( sayi%2==0 ? "cift sayi" : "tek sayi");
		
		// bas��na a��klama yazmak istersek ternary yi paranteze al ��nk� javan�n kafas� kar���r
		
		System.out.println("islem sonucu : " + ( sayi%2==0 ? "cift sayi" : "tek sayi"));
	}

}
