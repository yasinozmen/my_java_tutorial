package day03;

import java.util.Scanner;

public class C1_Scanner1 {
     public static void main(String[] args) {
	
    	 //kullanýcýdan isim ve soyismini isteyip isim : mehmet 
    	// soyisim :bulutluoz kursumuza kaydýnýz alýnmýþtýr teþekkür ederiz.
    	 // scanner: kullanýcýdan bilgi almak için kullanýlýr
    	 // 3 adýmda iþlemi tamamlýyoruz
    	 // 1.adým scanner objesi oluþturuyoruz
    	 // Scanner ýn çalýþmasý için java.util(utilities) kütüphanesinden ilgili kýsmý classýmýza import etmeliyiz
    	 
    	
    	 Scanner scan = new Scanner(System.in); // eþitliðin sol tarafý scanner dan scan objesi oluþtur sað tarafýndaki deðeri sola ata
	
    	 
    	 //kullanýcýya ne istediðimizi belirten bir mesaj yazmalýyýz
    	 
    	 System.out.println(" lütfen sadece isminizi giriniz: ");
    	 
    	 // 3.adým bir variable oluýþturup kullanýcýnýn girdiði deðeri atayacaðýz
    	 
    	 String name = scan.nextLine();
    	 
    	 System.out.println(" lütfen sadece soyisminizi giriniz: ");
    	 
    	// String surname = scan.nextLine(); bu þekilde yazarsak sadece ilk kelimeyi alýr sonrakileri almaz
    	 
    	 String surname = scan.nextLine();
    	 
    	 
    	 
    	 // benden istenen þekilde çýktýytý yazdýrabilirim
    	 // eðer yazdýracaðýmýz yazý sabir bir yazý ise " " arasýnda yazdýrýyoruz eðer bir variableye atanmýþ deðeri yazdýrmak istersek "" olmadan sadece variable ismini yazýyoruz
    	 
    	System.out.println("isminiz: " + name);
    	System.out.println("soyisminiz: " + surname);
    	System.out.println("kursumuza kaydýnýz alýnmýþtýr teþekkür ederiz");
    	 
    	 
    	 scan.close();
     }

}
