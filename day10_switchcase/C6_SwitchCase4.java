package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// KULLANICIDAN VIP(Very Important Person) k�saltmas�n�nda hangi harfin anlam�n� istedgi�ini sorun 
		// girilen harfin a��klams�n� ayz�n


		//Scanner scan = new Scanner(System.in);
		//System.out.println("hangi harfin a��l�m�n� istiyorsunuz");
		//char harf = scan.next().toUpperCase().charAt(0);
		
		/*switch (harf) {
		case 'V': //buraya bir case ekleyip onada v yazarsak upper case e egerek kalamz case'v' :
		System.out.println("VERY");														//case 'V':
		break;																			// SYSO VERY YAZAB�L�R�Z AMA GEREK YOK UPPER CASE YAP BUYUK HARF �ARTI KOY YADA LOWER YAP KUCUK HARF SARTI KOY		
		case 'I':
			System.out.println("IMPORTANT");
			break;
		case 'P':
			System.out.println("PERSON");
			break;
		}*/
		// bu koddaki s�k�nt� su kullan�c� vali yada �nek gibi v � p  ile ba�layan kelime girese ge�ersiz deger vermez ��nk� charat ilk harfi al�r yoluna bakar sonrki onemli de�ildir
		// boyle girince yada aras�nda bo�luk olan iki harf girerse HATA VERS�N �STERSEK ��YLE ��ZMEL�Y�Z
		Scanner scan = new Scanner (System.in);
		System.out.println("hangi harfin a��l�m�n� istiyorsunuz");
		String str = scan.next().toUpperCase(); // scan next ilk kelimeyi verir ve vali yazarsa yada �nek yazarsa ge�ersiz deriz
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
				System.out.println("ge�ersiz deger");
		}
		
		
		
		scan.close();
	}

}
