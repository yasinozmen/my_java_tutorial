package day06_IfStatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullan�c�dan bir say� isteyin ve sayinin tek veya .ift say� old yazd��en
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam say� giriniz");
		
		int sayi = scan.nextInt();
		
		// sayi % 2 == 0 ise �ft
		// sayi % 2 == 1 ise tek
		
		if(sayi%2==0) {
			
			System.out.println("sayi cift"); // �arta ba�l�
			
		}
		
       if(sayi%2==1 || sayi%2==-1) {
			
			System.out.println("sayi tek"); // �arta ba�l�
			
		}
		
		System.out.println(sayi%2); // kalan -1 old i�in if ler �al��mad� if de b�yle bir �art yok ��nk� 
		System.out.println("te�ekk�rler"); // �arta ba�l� de�il herzaman yazar
	
		
		scan.close();
	}
	
	

}
