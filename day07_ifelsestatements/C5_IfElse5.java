package day07_ifelsestatements;

import java.util.Scanner;

public class C5_IfElse5 {

	public static void main(String[] args) {
		// ucgen kenarlarýný alýn hepsi eþitse eskenar yoksa eskenar deðil

		Scanner scan = new Scanner (System.in);
		
		System.out.println("1.ucgen kenarýný girin ");
		double kenar1 = scan.nextDouble();
		System.out.println("2.ucgen kenarýný girin ");
		double kenar2 = scan.nextDouble();
		System.out.println("3.ucgen kenarýný girin ");
		double kenar3 = scan.nextDouble();
		
		if(kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("eskenar");
			
		}else {
			
			System.out.println("eskenar deðil");
		}
		
		scan.close();
	}

}
