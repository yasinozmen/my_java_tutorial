package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		// 2 sayi al buyuk olan� yazd�r
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci say�y� gir");
		double sayi1 = scan.nextDouble();
		System.out.println("ikinci say�y� gir");
		double sayi2 = scan.nextDouble();
		
		System.out.println(sayi1>sayi2 ? "buyuk sayi" + (sayi1) : "kucuk say�" + (sayi2) );
		// direk yazd�r�nca bir degi�kene atamaya gerek yok
		
		
		
		
		
		
scan.close();
	}

}
