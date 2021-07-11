package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanýcýdan yasýný alýn 65 den buyuk  esþitse emeklý olabilirsin yoksa olamazsýn

		Scanner scan = new Scanner(System.in);
		 
		System.out.println("yasýnýzý girin");
		
		double yas = scan.nextDouble();
		
		if(yas>=65) {
			System.out.println("emeklisiniz");
			
			}else {
				System.out.println("calýsmaya devam");
			}
		
		
		scan.close();
	}

}
