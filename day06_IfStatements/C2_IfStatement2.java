package day06_IfStatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullanýcýdan bir sayý isteyin ve sayinin tek veya .ift sayý old yazdýýen
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayý giriniz");
		
		int sayi = scan.nextInt();
		
		// sayi % 2 == 0 ise çft
		// sayi % 2 == 1 ise tek
		
		if(sayi%2==0) {
			
			System.out.println("sayi cift"); // þarta baðlý
			
		}
		
       if(sayi%2==1 || sayi%2==-1) {
			
			System.out.println("sayi tek"); // þarta baðlý
			
		}
		
		System.out.println(sayi%2); // kalan -1 old için if ler çalýþmadý if de böyle bir þart yok çünkü 
		System.out.println("teþekkürler"); // þarta baðlý deðil herzaman yazar
	
		
		scan.close();
	}
	
	

}
