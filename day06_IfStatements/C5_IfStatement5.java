package day06_IfStatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullan�c�dan bir dikd�rtgenin iki kenar uzunlu�unu al�n e�itse kare de�ilse dikd�rtgen yazd�r�n
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("1.kenar uzunlugu girin");
		
		
		double kenar1 = scan.nextInt();
		System.out.println("2.kenar uzunlugu girin");
		double kenar2 = scan.nextInt();
		
		if (kenar1>0 && kenar2>0 && kenar1==kenar2) {
			System.out.println("kare");
			
		}

		if(kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			
			System.out.println("dikdortgen");
			
			
		}
		
		
		if(kenar1<=0 || kenar2<=0) {
			System.out.println("ge�erli uzunluk gir");
			
		}
		
		// 0 girerse onu i� i�e if de g�rece�iz
		
		scan.close();
	}

}
