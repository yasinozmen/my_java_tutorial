package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {

	public static void main(String[] args) {
		// bir sayi al 3 bas pozitif ise 3 basamakl� de�ilse 3 bas de�il yaz
		
		Scanner scan = new Scanner (System.in);
		System.out.println("bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		
		System.out.println(sayi>=100 ?  (sayi<1000 ?  "3basamakli" :"3basamakl� degil"): "3bas degil");
		
		
		
	
	 
		
scan.close();
	}

}
