package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// kullan�c�dan sayi al�n tek mi �ift mi yazd�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen bir tamsay� giriniz");
		int sayi = scan.nextInt();
		
		System.out.println(sayi%2==0 ? "c�ft" : "tek");
		// �art� yaz 
		// soru i�areti koy
		// dogruysa ��kacak sonucu yaz 
		// sonuc dgerse t�rnaks�z mesajsa t�rnalar aras�na
		// : koy yanl��sa verilecek sonucu yaz 
		
		// girilen sayinin mutlak de�erini yazd�r�n�z
		// x pozitifse |x| =x negatifse |x|= -x
		
		System.out.println(sayi>0 ? sayi : -sayi);
		
		
		
		
scan.close();
	}

}
