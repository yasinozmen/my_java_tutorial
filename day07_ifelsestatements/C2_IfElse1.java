package day07_ifelsestatements;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullan�c�dan dikdortgenin kenar uzunluklar�n� al�n
		// uzunluklar e�itse kare
		// de�ilse kare de�il yazd�r�n
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. kenar uzunlugu girin : ");
		
		
		double kenar1 = scan.nextDouble();
				
				System.out.println("2.kenar uzunlugu girin : ");
		
		double kenar2 = scan.nextDouble();
		
				
		if(kenar1==kenar2) {
			System.out.println("kare");
			} else {
				
				System.out.println("kare de�il");
				
			}
		
		
		
		
scan.close();
	}

}
