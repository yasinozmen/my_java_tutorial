package day09_ternary;

import java.util.Scanner;



public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// dikdortgeb uzunluk geilkik al
		// kare mi değilmi yazdır
		
		Scanner scan =new Scanner (System.in);
		System.out.println("dikdortgen kenarlarını girin");
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		
		// 0 0  veya negatifte çalışmaz System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz kenarlar");
		
		scan.close();

	}

}
