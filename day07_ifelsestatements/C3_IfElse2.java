package day07_ifelsestatements;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanıcıdan karakter alın harf olup olmadığını yazdırın

		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir karakter girin");
		
		char karakter = scan.next().charAt(0);
		// char primitive method almaz next() yaz stringi getirsin sonra charAt(0) de 0 demendeki neden ilk karakteri almak
		// ve lowercase yap ki if de verdiğin şartın dısşında yazarsa çalışşsın A VEYA a farketmesin		
		// LOWER CASE olmassa A harf değil der 
		if (karakter >= 'a' && karakter<='z') // ascı değeriere göre anladı  lowe case kullanmassan && 
											 // ile || birlikte kullanman lazım kafası karışmsaın javanın diye parantez kullan 
			{								// (karakter >= 'a' && karakter<='z' || karakter >='A' && karakter <='Z')
			System.out.println("harf");     // veya nın iki  yanından birisi olursa harf iki yanda && kullanmamın sebei ikisi arasında old kesin bulsun diye küçük adan büyük olup z den büyük olursa direk çalışır çünkü veya biri doğruysa çalışır mesele . yazsa a dan büyük der ama z şartına bakmaz && koydukki ikiside olursa yapsın 
			
		}else {
			System.out.println("harf degil");
		}
		
		
		scan.close();		
	}

}
