package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		/*
		 * kullanýcýdan gun ismi al
		 * girilen isim geçerli bir gun ise 
		 * isminin 1. 2. 3. harflerini ilk harf buyuyk diðer ikisi küçük yazdýr
		 * gun ismi geçerli deðilse geçerli gun gir yaz
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen gun ismini griniz"); // buyuk kucuk girebilir hepsini kucult yada buyult
		// asagýda equalsIgnorecase kullanmak demek buyuk kucuk yok say parametre olarak girdiðim öenmli demek lowercase e gerek yok
		String gunIsmi = scan.nextLine(); // girilen tum yazýyý kucuk harfe cevýrdýk
		// tum satýrý al ki ( nextline al next alma) gunden baska bisey yazarsa gecersiz yaz
		// pazartesi cok iyyidir yazsa next yapsan sadece ilk kelimeyi pazartesiyi alýr ve cumleyi dogru syar tamamý al ki geçersiz de
		// kullanýcý hatasý yakalamayý max seviyeye getirdik
		// stringklerde == çalýþmaz if de equal kullan
		if(gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			
			System.out.println("Paz");
		}/*else if(gunIsmi.equalsIgnoreCase("SALI")) // içindeki parametrenin önemi yok hereahlde  
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
