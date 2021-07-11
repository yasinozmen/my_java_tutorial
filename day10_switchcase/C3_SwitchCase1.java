package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {

	public static void main(String[] args) {
		// kullanýcýdan bir rakam isteyin
		// girilen rakamý yazý ile yazdýrýn negatif ve 9 dan buyukse reddet
		// if elseif ile yapýn
		Scanner scan = new Scanner(System.in);
		System.out.println("bir rakam girin");
		byte rakam = scan.nextByte();
		/*	if (rakam < 0 || rakam > 9) {
		System.out.println("lutfen gecerli bir deger girin");
	} else if (rakam == 0) {

		System.out.println("sifir");
	} else if (rakam == 1) {

		System.out.println("bir");
	} else if (rakam == 2) {

		System.out.println("iki");
	} else if (rakam == 3) {

		System.out.println("uc");
	} else if (rakam == 4) {
		System.out.println("dort");
	} else if (rakam == 5) {

		System.out.println("bes");
	} else if (rakam == 6) {
		System.out.println("altý");
	} else if (rakam == 7) {
		System.out.println("yedi");
	} else if (rakam == 8) {

		System.out.println("sekiz");
	} else if (rakam == 9) {
		System.out.println("dokuz");
	}
	*/
	
	// switch case ile çöz

	
		 switch(rakam){
			case 0 :
				System.out.println("sýfýr");
				break;
			case 1 :
				System.out.println("bir");
				break;
			case 2 :
				System.out.println("iki");
				break;
			case 3 :
				System.out.println("uc");
				break;
			case 4 :
				System.out.println("dort");
				break;
			case 5 :
				System.out.println("bes");
				break;
			case 6 :
				System.out.println("altý");
				break;
			case 7 :
				System.out.println("yedi");
				//break; // buradan sonra breaklere // koyarsak 7 8 9 lutfen rakam girin çalýþýr ama sadece 7 ve 8 e koyarsak 7 8 9 yazar rakam girin yazma
			case 8 :
				System.out.println("sekiz");
				//break;
			case 9 :
				System.out.println("dokuz");
				//break;
			default :
				System.out.println("lutfen rakam girin");
		}
				
		scan.close();		
	}
		
		
	}


