package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// kullanýcýdan sayi alýn tek mi çift mi yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen bir tamsayý giriniz");
		int sayi = scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cýft" : "tek");
		// þartý yaz 
		// soru iþareti koy
		// dogruysa çýkacak sonucu yaz 
		// sonuc dgerse týrnaksýz mesajsa týrnalar arasýna
		// : koy yanlýþsa verilecek sonucu yaz 
		
		// girilen sayinin mutlak deðerini yazdýrýnýz
		// x pozitifse |x| =x negatifse |x|= -x
		
		System.out.println(sayi>0 ? sayi : -sayi);
		
		
		
		
scan.close();
	}

}
