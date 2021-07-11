package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullanýcýdan dikdortgenin kenar uzunluklarýný alýn
		// uzunluklar eþitse kare
		// deðilse kare deðil yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. kenar uzunlugu girin : ");
		
		
		double kenar1 = scan.nextDouble();
				
				System.out.println("2.kenar uzunlugu girin : ");
		
		double kenar2 = scan.nextDouble();
		
				
		if(kenar1==kenar2) {
			System.out.println("kare");
			} else {
				
				System.out.println("kare deðil");
				
			}
		
		
		
		
scan.close();
	}

}
