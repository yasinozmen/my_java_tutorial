package day07_ifelsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {

	public static void main(String[] args) {
		// 100 UZER�NDEN NOT �STE HARF S�STEM�NE �EV�R 50 K���KSE D 50-60 ARASI C 60-80 ARASI B 80+ A
		
		Scanner scan = new Scanner(System.in);
		System.out.println("notunu gir");
		
		double not = scan.nextDouble();
		
		if( not<0 || not > 100) {
		System.out.println("GECERL� NOT G�R");
		}// YA BU �ALI�IR YADA BUNDA SONRAK�LER
		
		// birden fazla if �al��abili o y�zden else if 
		else if (not<50) {
			//System.out.println("D");
			
		}// bu sat�r �al���yosa not 0-100 aras�nda
		
		else if (not<60) {// 50-100 ARASINDA OLAB�L�R BU Y�ZDEN ELSE DE��L ELSE �F LE SORUYA UYGUN YAPTIK
			System.out.println("C");
			
		}
		
		else if (not<80) {// 60-100 ARASINDA OLAB�L�R BU Y�ZDEN ELSE DE��L ELSE �F LE SORUYA UYGUN YAPTIK
			System.out.println("B");
			
		}else {
			
			System.out.println("A");
		}
		
		
		
		
		
		
		
		
		
		
scan.close();
	}

}
