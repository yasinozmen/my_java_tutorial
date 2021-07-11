package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// 100 UZERÝNDEN NOT ÝSTE HARF SÝSTEMÝNE ÇEVÝR 50 KÜÇÜKSE D 50-60 ARASI C 60-80 ARASI B 80+ A
		
		Scanner scan = new Scanner(System.in);
		System.out.println("notunu gir");
		
		double not = scan.nextDouble();
		
		if( not<0 || not > 100) {
		System.out.println("GECERLÝ NOT GÝR");
		}// YA BU ÇALIÞIR YADA BUNDA SONRAKÝLER
		
		// birden fazla if çalýþabili o yüzden else if 
		else if (not<50) {
			//System.out.println("D");
			
		}// bu satýr çalýþýyosa not 0-100 arasýnda
		
		else if (not<60) {// 50-100 ARASINDA OLABÝLÝR BU YÜZDEN ELSE DEÐÝL ELSE ÝF LE SORUYA UYGUN YAPTIK
			System.out.println("C");
			
		}
		
		else if (not<80) {// 60-100 ARASINDA OLABÝLÝR BU YÜZDEN ELSE DEÐÝL ELSE ÝF LE SORUYA UYGUN YAPTIK
			System.out.println("B");
			
		}else {
			
			System.out.println("A");
		}
		
		
		
		
		
		
		
		
		
		
scan.close();
	}

}
