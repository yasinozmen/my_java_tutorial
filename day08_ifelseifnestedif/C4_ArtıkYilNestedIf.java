package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtýkYilNestedIf {

	public static void main(String[] args) {
		// kullanýcýdan yýl iste 4 bolunmezse artrýk deðil
				// 4 bolunur 100 e bolunmezse artýk
				// 100 e bolunenlerden sadece 400 e  bolunenler artýk

				
				Scanner scan = new Scanner(System.in);
				System.out.println("lutfen yýl giriniz");
				
				int yil = scan.nextInt();
				
				if (yil%100==0) {// 100e bolunuyorsa içine 2 þart koy bolunurse 400e bolunuse artýk bolunmezse artýk deðil
					if (yil%400==0) {
						System.out.println("artik yil");
						
					} else {
						System.out.println("artik deðil");
					}
					
					
				} else{// bolunmuyorsa bir þart o da 4 e bolunurse artýk
					if(yil%4==0) {
						System.out.println("artik");
					}else {
						System.out.println("artýk deðil");
					}
				}
				
				
				
scan.close();
	}

}
