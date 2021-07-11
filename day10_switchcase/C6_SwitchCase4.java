package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// KULLANICIDAN VIP(Very Important Person) kýsaltmasýnýnda hangi harfin anlamýný istedgiðini sorun 
		// girilen harfin açýklamsýný ayzýn


		//Scanner scan = new Scanner(System.in);
		//System.out.println("hangi harfin açýlýmýný istiyorsunuz");
		//char harf = scan.next().toUpperCase().charAt(0);
		
		/*switch (harf) {
		case 'V': //buraya bir case ekleyip onada v yazarsak upper case e egerek kalamz case'v' :
		System.out.println("VERY");														//case 'V':
		break;																			// SYSO VERY YAZABÝLÝRÝZ AMA GEREK YOK UPPER CASE YAP BUYUK HARF ÞARTI KOY YADA LOWER YAP KUCUK HARF SARTI KOY		
		case 'I':
			System.out.println("IMPORTANT");
			break;
		case 'P':
			System.out.println("PERSON");
			break;
		}*/
		// bu koddaki sýkýntý su kullanýcý vali yada ýnek gibi v ý p  ile baþlayan kelime girese geçersiz deger vermez çünkü charat ilk harfi alýr yoluna bakar sonrki onemli deðildir
		// boyle girince yada arasýnda boþluk olan iki harf girerse HATA VERSÝN ÝSTERSEK ÞÖYLE ÇÖZMELÝYÝZ
		Scanner scan = new Scanner (System.in);
		System.out.println("hangi harfin açýlýmýný istiyorsunuz");
		String str = scan.next().toUpperCase(); // scan next ilk kelimeyi verir ve vali yazarsa yada ýnek yazarsa geçersiz deriz
		switch (str) {
		case "V": 
		System.out.println("VERY");													
		break;								
		case "I":
			System.out.println("IMPORTANT");
			break;
		case "P":
			System.out.println("PERSON");
			break;
			default :
				System.out.println("geçersiz deger");
		}
		
		
		
		scan.close();
	}

}
