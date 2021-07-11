package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		int sayi =10;
		// if else in teksatýrda 
		// ternary iþlemi bir sonuc dondurdugunden bir variable oluþturup 
		// ona assign etmeliyiz
		String sonuc = sayi%2==0 ? "cift sayi" : "tek sayi";
		
		System.out.println(sonuc);

		// bir variableye asign etmek istemessem 
		// ve sonucuda görmek istersek
		// o zman syso içine yazarým
		
		System.out.println( sayi%2==0 ? "cift sayi" : "tek sayi");
		
		// basþýna açýklama yazmak istersek ternary yi paranteze al çünkü javanýn kafasý karýþýr
		
		System.out.println("islem sonucu : " + ( sayi%2==0 ? "cift sayi" : "tek sayi"));
	}

}
