package day06_IfStatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullanýcýdan gun isminin ilk harfini istyein ve harfe uygun olan günelri yazdýrý
		// c--> cuma cumartesi s--> salý 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("gun isminin ilk  harfini giriniz");
		
		char ilkHarf = scan.next().charAt(0); // 
		
		
		// bu satýr itibariyle girilen stringin ilk karakterini aldk
		
		if (ilkHarf=='p' || ilkHarf == 'P') {
			System.out.println("pazar pazartesi veya pers");
			
			
		}
		
		if(ilkHarf=='s' || ilkHarf == 'S') {
			
			System.out.println("Salý");
			
			
		}
		
		
		if (ilkHarf=='c' || ilkHarf == 'C') {
			
			System.out.println("carsamba cuma veya ctesi");
			
		}
		
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf !='s' && ilkHarf!= 'S' && ilkHarf != 'c' && ilkHarf!='C') {
			
			System.out.println("GEÇERLÝ BÝR DEGER GÝR");
			
		}// ZORU GÖR KOLAYIN KIYMETÝNÝ ANLA
		 

	scan.close();
	
	}

}
