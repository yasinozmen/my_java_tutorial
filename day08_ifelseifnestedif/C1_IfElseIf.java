package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		/*
		 * kullan�c�dan gun ismi al
		 * girilen isim ge�erli bir gun ise 
		 * isminin 1. 2. 3. harflerini ilk harf buyuyk di�er ikisi k���k yazd�r
		 * gun ismi ge�erli de�ilse ge�erli gun gir yaz
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen gun ismini griniz"); // buyuk kucuk girebilir hepsini kucult yada buyult
		// asag�da equalsIgnorecase kullanmak demek buyuk kucuk yok say parametre olarak girdi�im �enmli demek lowercase e gerek yok
		String gunIsmi = scan.nextLine(); // girilen tum yaz�y� kucuk harfe cev�rd�k
		// tum sat�r� al ki ( nextline al next alma) gunden baska bisey yazarsa gecersiz yaz
		// pazartesi cok iyyidir yazsa next yapsan sadece ilk kelimeyi pazartesiyi al�r ve cumleyi dogru syar tamam� al ki ge�ersiz de
		// kullan�c� hatas� yakalamay� max seviyeye getirdik
		// stringklerde == �al��maz if de equal kullan
		if(gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			
			System.out.println("Paz");
		}/*else if(gunIsmi.equalsIgnoreCase("SALI")) // i�indeki parametrenin �nemi yok hereahlde  
		{
			System.out.println("Sal");
		
		}*/
		else if (gunIsmi.equalsIgnoreCase("carsamba")) {
			
			System.out.println("Car");
		}else if(gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
			
		}else if(gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
			
		}else {
			
			System.out.println("gecerli gun ismi giriniz");
		}
		
		// equalsIgnoreCase methodu iki str
		
		
		
scan.close();
	}
}
