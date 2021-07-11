package day10_switchcase;

import java.util.Scanner;

public class C2_TernaryTekrar {

	public static void main(String[] args) {
		// kullanýcýdan bir sayi alýn 
		// sayi çiftse cift deðilse sayinin karesini yazdýrýn
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir tam sayý girin");
		int sayi = scan.nextInt();
		
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi+"");
		// degere atamadýk çünkü body de hem sayi hem kelime var  o yüzden direk yazdýrdýk
		// yada sayi*sayi nýn sonuna "" hiçlik boþluk deðil koyarsak sayi + boþluk string gibi algýnalýr ve sonucu string tanýmlayabiliriz
		
		System.out.println("baskabir yontem");
		
	String sonuc = sayi%2==0 ? "cift" : sayi*sayi+"";
	System.out.println(sonuc);
		
		
		
scan.close();
	}

}
