package day06_IfStatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullan�c�dan gun isminin ilk harfini istyein ve harfe uygun olan g�nelri yazd�r�
		// c--> cuma cumartesi s--> sal� 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("gun isminin ilk  harfini giriniz");
		
		char ilkHarf = scan.next().charAt(0); // 
		
		
		// bu sat�r itibariyle girilen stringin ilk karakterini aldk
		
		if (ilkHarf=='p' || ilkHarf == 'P') {
			System.out.println("pazar pazartesi veya pers");
			
			
		}
		
		if(ilkHarf=='s' || ilkHarf == 'S') {
			
			System.out.println("Sal�");
			
			
		}
		
		
		if (ilkHarf=='c' || ilkHarf == 'C') {
			
			System.out.println("carsamba cuma veya ctesi");
			
		}
		
		if (ilkHarf!='p' && ilkHarf!='P' && ilkHarf !='s' && ilkHarf!= 'S' && ilkHarf != 'c' && ilkHarf!='C') {
			
			System.out.println("GE�ERL� B�R DEGER G�R");
			
		}// ZORU G�R KOLAYIN KIYMET�N� ANLA
		 

	scan.close();
	
	}

}
