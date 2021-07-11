package day07_ifelsestatements;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//kullanýcýdan bir tamsayý isteyin sayi pozitif ise sayi pozitif yazdýrýn 
		// sayi 100 den küçükse küçük sayý yazdýrýn 
		// sayi 100 den büyükse büyük sayi yazdýrýn 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayý giriniz: ");
		
		int sayi = scan.nextInt();
		
		if(sayi>0) {
			
			System.out.println("sayi pozitif");}
			
			
		
		if (sayi<100) {
			
			System.out.println("kuvuk sayý");
		}
		
		 if(sayi>100) {
				System.out.println("buyuk sayi");
				
			}
		
		
		 
		 
		
   scan.close();
	}

}
