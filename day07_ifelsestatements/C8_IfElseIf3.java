package day07_ifelsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {

	public static void main(String[] args) {
		// maas teklifi iste 80k ustuyse kabul ederim de 60-80 aras� ise  kanosabilriiz 60 alt�ndaysa kabul etme
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("bana y�ll�k ne kadar maas vereceks�n�z");
		
		int maas = scan.nextInt();
		
		if(maas >80000) {
			
			System.out.println("kabul ediyorum ");
		}else if (maas>60000 ) {
			
			System.out.println("konusabiliriz");
		}else {
			System.out.println("maalesef kabul edemem");
		}
		
		
		
		
		
		
		
scan.close();
	}

}
