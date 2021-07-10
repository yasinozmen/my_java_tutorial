package day05;

public class C2_WrapperClass {

	public static void main(String[] args) {
		// javada 2 t�r data vard�r.
		// primitive sadece value i�erir 
		// non-primitive data turler� ise deger ve methodlar� icerir
		// string isim = "mehmet" isimi yazd�r�rkem isim. dersek birs�r� metod �nerisi ��kar
		// �rne�in isim.toUpperCase() yazarsak ilk harf b�y�k al�r bu da non-prim. lerin method da ald���n� g�sterir
		
		// Wrapper Class :  Javan�n primitive data t�rleriyle baz� methodlar� kullanabilmemiz i�in olu�turdugu classlard�r
		
		//boolean, char, byte, short, int, long, float, double
		
		String isim = "mehmet";

	System.out.println(isim.toUpperCase());
		 
		byte sayi= 10;
		 
		Byte sayi2 = 11; // ismen primitive data t�r�yle ayn� olan non primitive datalara wrapper denir
		// Byte = 12 �al���r ancak gereksiz primitive bir de�eri wrapper a e�itlemeye bellekte fazla yer kaplamaya gerek yok
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		// wrapper class sayesinde data tipmin max de�er 
		 
         System.out.println(byteMinSayi);
         
         Byte byteMaxSayi = Byte.MAX_VALUE;
         
         System.out.println(byteMaxSayi);
         
         // shortun variable olu�turmadan firek olarak en k���k ve en b�y�k de�erlierni yazd�rala�m
         System.out.println(Short.MIN_VALUE);
         System.out.println(Short.MIN_VALUE);
         
         
         // integer veri t�r�n�n wrapper class� Integer
         
         // int en b�y�k en k���k yazd�r
         
         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
         
         // Boolean Character, Byte, Short, Integer, Long, Float, Double
         
         
         
         System.out.println(sayi);
         // neden yapt�m ��nl� 20.sat�rda olu�turdum kullanmassam java neden kullanmad�n diyor
         
         
         
         
         
         
         
         
         
	}

}
