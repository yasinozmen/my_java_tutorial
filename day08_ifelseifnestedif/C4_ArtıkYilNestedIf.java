package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_Art�kYilNestedIf {

	public static void main(String[] args) {
		// kullan�c�dan y�l iste 4 bolunmezse artr�k de�il
				// 4 bolunur 100 e bolunmezse art�k
				// 100 e bolunenlerden sadece 400 e  bolunenler art�k

				
				Scanner scan = new Scanner(System.in);
				System.out.println("lutfen y�l giriniz");
				
				int yil = scan.nextInt();
				
				if (yil%100==0) {// 100e bolunuyorsa i�ine 2 �art koy bolunurse 400e bolunuse art�k bolunmezse art�k de�il
					if (yil%400==0) {
						System.out.println("artik yil");
						
					} else {
						System.out.println("artik de�il");
					}
					
					
				} else{// bolunmuyorsa bir �art o da 4 e bolunurse art�k
					if(yil%4==0) {
						System.out.println("artik");
					}else {
						System.out.println("art�k de�il");
					}
				}
				
				
				
scan.close();
	}

}
