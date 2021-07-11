package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase5 {

	public static void main(String[] args) {
		// hangi gunde olduhunu iste yazýyla 
		// hafta içi veya hafta sonu old yazdýrýn
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("gun giriniz");
		String gun = scan.next().toLowerCase(); // pAzar PAZAR hepsini pazar a çevirmek girilen degere hata almamak için
		
		switch (gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":	
			System.out.println("haftaici");
			break;
		case "cumartesi":	
		case "pazar":	
			System.out.println("haftasonu");
			break;
		default :
			System.out.println("gecerli gun gir");
		}
		
		
		
scan.close();
	}

}
