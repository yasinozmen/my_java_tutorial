package day10_switchcase;

import java.util.Scanner;

public class C2_TernaryTekrar {

	public static void main(String[] args) {
		// kullan�c�dan bir sayi al�n 
		// sayi �iftse cift de�ilse sayinin karesini yazd�r�n
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir tam say� girin");
		int sayi = scan.nextInt();
		
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi+"");
		// degere atamad�k ��nk� body de hem sayi hem kelime var  o y�zden direk yazd�rd�k
		// yada sayi*sayi n�n sonuna "" hi�lik bo�luk de�il koyarsak sayi + bo�luk string gibi alg�nal�r ve sonucu string tan�mlayabiliriz
		
		System.out.println("baskabir yontem");
		
	String sonuc = sayi%2==0 ? "cift" : sayi*sayi+"";
	System.out.println(sonuc);
		
		
		
scan.close();
	}

}
