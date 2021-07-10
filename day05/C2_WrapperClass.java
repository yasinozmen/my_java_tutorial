package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		// javada 2 tür data vardýr.
		// primitive sadece value içerir 
		// non-primitive data turlerý ise deger ve methodlarý icerir
		// string isim = "mehmet" isimi yazdýrýrkem isim. dersek birsürü metod önerisi çýkar
		// örneðin isim.toUpperCase() yazarsak ilk harf büyük alýr bu da non-prim. lerin method da aldýðýný gösterir
		
		// Wrapper Class :  Javanýn primitive data türleriyle bazý methodlarý kullanabilmemiz için oluþturdugu classlardýr
		
		//boolean, char, byte, short, int, long, float, double
		
		String isim = "mehmet";

	System.out.println(isim.toUpperCase());
		 
		byte sayi= 10;
		 
		Byte sayi2 = 11; // ismen primitive data türüyle ayný olan non primitive datalara wrapper denir
		// Byte = 12 çalýþýr ancak gereksiz primitive bir deðeri wrapper a eþitlemeye bellekte fazla yer kaplamaya gerek yok
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		// wrapper class sayesinde data tipmin max deðer 
		 
         System.out.println(byteMinSayi);
         
         Byte byteMaxSayi = Byte.MAX_VALUE;
         
         System.out.println(byteMaxSayi);
         
         // shortun variable oluþturmadan firek olarak en küçük ve en büyük deðerlierni yazdýralaým
         System.out.println(Short.MIN_VALUE);
         System.out.println(Short.MIN_VALUE);
         
         
         // integer veri türünün wrapper classý Integer
         
         // int en büyük en küçük yazdýr
         
         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
         
         // Boolean Character, Byte, Short, Integer, Long, Float, Double
         
         
         
         System.out.println(sayi);
         // neden yaptým çünlü 20.satýrda oluþturdum kullanmassam java neden kullanmadýn diyor
         
         
         
         
         
         
         
         
         
	}

}
