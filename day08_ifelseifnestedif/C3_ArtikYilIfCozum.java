package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYilIfCozum {

	public static void main(String[] args) {
		// kullan�c�dan y�l iste 4 bolunmezse artr�k de�il
		// 4 bolunur 100 e bolunmezse art�k
		// 100 e bolunenlerden sadece 400 e  bolunenler art�k

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yil giriniz");
		
		int yil = scan.nextInt();
		
		if (yil%4==0 && yil%100 != 0) {// 4 e b�l�n�r 100e b�l�nmezse art�k 
			
			System.out.println("art�k yik");
			
		} else if (yil%4==0 && yil%100==0 && yil%400==0){ // 4

			System.out.println("artik yil");
		}else {
			
			System.out.println("art�k de�il");
		}
		
		
		
		System.out.println("nested ifle cozum");
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
