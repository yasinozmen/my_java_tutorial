package day09_ternary;

import java.util.Scanner;



public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// dikdortgeb uzunluk geilkik al
		// kare mi de�ilmi yazd�r
		
		Scanner scan =new Scanner (System.in);
		System.out.println("dikdortgen kenarlar�n� girin");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		
		// 0 0  veya negatifte �al��maz System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz kenarlar");
		
		scan.close();

	}

}
