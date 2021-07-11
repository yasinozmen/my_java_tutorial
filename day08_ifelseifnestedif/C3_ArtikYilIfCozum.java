package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYilIfCozum {

	public static void main(String[] args) {
		// kullanýcýdan yýl iste 4 bolunmezse artrýk deðil
		// 4 bolunur 100 e bolunmezse artýk
		// 100 e bolunenlerden sadece 400 e  bolunenler artýk

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yýl giriniz");
		
		int yil = scan.nextInt();
		
		if (yil%4==0 && yil%100 != 0) {// 4 e bölünür 100e bölünmezse artýk 
			
			System.out.println("artýk yik");
			
		} else if (yil%4==0 && yil%100==0 && yil%400==0){ // 4

			System.out.println("artik yil");
		}else {
			
			System.out.println("artýk deðil");
		}
		
		
		
		System.out.println("nested ifle cozum");
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
