package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// 2 sayi iste ikiside pozitifse toplam�n� yazd�r negatifse �arp�m�n� yazd�r ikisi farkl� i�aretlere sahipse farkl� i�aetli say�larla 
		//i�lem yapamazs�n yaz s�f�ra e�it varsa s�f�r �arpmada yutan eleman vard�r yaz
		// �nce algotirmay� yaz kodu yazmak kolay
		// a==0 || b==0
		//a>0 && b>0
		// a<0 && b<0
		// di�er durumlar else
		
	Scanner scan = new Scanner(System.in);
	
		System.out.println("ilk say�y� girin");
			double a = scan.nextDouble();
	
		System.out.println("ikinci say�y� gir");
			double b = scan.nextDouble();
	
		    if(a==0 || b==0) {//ikisinden biri yada ikiside 0 olablir
				System.out.println("0  yutan eleman");
				} //else if(a>0 && b>0) {
					//System.out.println("toplam�" + (a+b)); // parantez kulland�k ��nk� string san�p bir�eltirir bir tane string var di�er a ve b yi de i�ine ekler ama �arpma olsa i�lem �nceli�inden paranteze gerek yok
	//			} 
	else if(a<0 && b<0) {
					System.out.println("carp�m�"+ a*b); // �nce �arpma sonra birle�tirme ne demi�tik birle�tirmede �nceli�imiz varsa i�lem �nceli�ini kullan zaten �arpm�a yap�nca stringden sonraki + den daha �nce yapar �arpar sonra birle�titi(toplar
				} else {
					System.out.println("farkl� i�aretlerel i�lem yok");
				}
			
	
		
		
scan.close();
	}

}
