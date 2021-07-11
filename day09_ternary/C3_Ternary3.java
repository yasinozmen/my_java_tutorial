package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// 2 sayi al buyuk olaný yazdýr
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci sayýyý gir");
		double sayi1 = scan.nextDouble();
		System.out.println("ikinci sayýyý gir");
		double sayi2 = scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? "buyuk sayi" + (sayi1) : "kucuk sayý" + (sayi2) );
		// direk yazdýrýnca bir degiþkene atamaya gerek yok
		
		
		
		
		
		
scan.close();
	}

}
