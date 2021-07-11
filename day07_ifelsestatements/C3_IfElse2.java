package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullan�c�dan karakter al�n harf olup olmad���n� yazd�r�n

		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir karakter girin");
		
		char karakter = scan.next().charAt(0);
		// char primitive method almaz next() yaz stringi getirsin sonra charAt(0) de 0 demendeki neden ilk karakteri almak
		// ve lowercase yap ki if de verdi�in �art�n d�s��nda yazarsa �al���s�n A VEYA a farketmesin		
		// LOWER CASE olmassa A harf de�il der 
		if (karakter >= 'a' && karakter<='z') // asc� de�eriere g�re anlad�  lowe case kullanmassan && 
											 // ile || birlikte kullanman laz�m kafas� kar��msa�n javan�n diye parantez kullan 
			{								// (karakter >= 'a' && karakter<='z' || karakter >='A' && karakter <='Z')
			System.out.println("harf");     // veya n�n iki  yan�ndan birisi olursa harf iki yanda && kullanmam�n sebei ikisi aras�nda old kesin bulsun diye k���k adan b�y�k olup z den b�y�k olursa direk �al���r ��nk� veya biri do�ruysa �al���r mesele . yazsa a dan b�y�k der ama z �art�na bakmaz && koydukki ikiside olursa yaps�n 
			
		}else {
			System.out.println("harf degil");
		}
		
		
		scan.close();		
	}

}
