package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse5 {

	public static void main(String[] args) {
		// ucgen kenarlar�n� al�n hepsi e�itse eskenar yoksa eskenar de�il

		Scanner scan = new Scanner (System.in);
		
		System.out.println("1.ucgen kenar�n� girin ");
		double kenar1 = scan.nextDouble();
		System.out.println("2.ucgen kenar�n� girin ");
		double kenar2 = scan.nextDouble();
		System.out.println("3.ucgen kenar�n� girin ");
		double kenar3 = scan.nextDouble();
		
		if(kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("eskenar");
			
		}else {
			
			System.out.println("eskenar de�il");
		}
		
		scan.close();
	}

}
