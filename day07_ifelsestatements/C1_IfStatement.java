package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//kullan�c�dan bir tamsay� isteyin sayi pozitif ise sayi pozitif yazd�r�n 
		// sayi 100 den k���kse k���k say� yazd�r�n 
		// sayi 100 den b�y�kse b�y�k sayi yazd�r�n 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsay� giriniz: ");
		
		int sayi = scan.nextInt();
		
		if(sayi>0) {
			
			System.out.println("sayi pozitif");}
			
			
		
		if (sayi<100) {
			
			System.out.println("kuvuk say�");
		}
		
		 if(sayi>100) {
				System.out.println("buyuk sayi");
				
			}
		
		
		 
		 
		
   scan.close();
	}

}
