package day07_ifelsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullan�c�dan yas�n� al�n 65 den buyuk  es�itse emekl� olabilirsin yoksa olamazs�n

		Scanner scan = new Scanner(System.in);
		 
		System.out.println("yas�n�z� girin");
		
		double yas = scan.nextDouble();
		
		if(yas>=65) {
			System.out.println("emeklisiniz");
			
			}else {
				System.out.println("cal�smaya devam");
			}
		
		
		scan.close();
	}

}
