package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// kullan�c�dan 4 bas bir say� alal�m ve sayinin bas lar�n� ters s�rada yazd�ral�m
		
		// basamaklar� al ters yaz�r
		
		// bir say�n�n basamakalr�n� elde etmekmi�in 
		// 2 i�lemi tekrar tekrar yapar�z
		// birinci i�lem en sondaki basaa�� elde etmek 
		// 2. islem en sondaki basama�� yok etmek
		// istenen bas say�s� kadar yapar�z
		// sonuncuda tek bas kal�r bidaha yapmay�z
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("basamaklar�n� bulmak icin 4 basl� say� girin");
		
		int sayi = scan.nextInt(); // bu sat�rdan itibaren elimizde 4 bas l� bir say� var
		// 4 basama�� elde etmek i�in yukar�da yazd���m�z i�lemi 3 �kere yap�yoruz
		// 1.tekrar
		int birlerBas = sayi % 10 ;
		sayi /= 10;
		
		//bu sat�rdan itibaren say� 3 basamakl� 
		
		// onlar bas �n� elde etmek i�in ikinci kez % 10
		
		int onlarBas =  sayi % 10;
		
		sayi/=10;
		// kurtulmam�z�n nedeni bir sonraki bas � elde etmek
		// bu st�rdan itibaren sayimiz 2 bas
		
		// 3 .tekrar 
		
		int yuzlerBas= sayi % 10;
		
		sayi/=10;
		
		// bu sat�rdan itibaren say� tek bas
		int binlerBas=sayi % 10;// bunda zorunluluk yok zaten tek bas
				
			// t�m basamaklar var ve yazd�rala�m
				
				System.out.println("birler bas: " + birlerBas);
				System.out.println("onalr bas: " + onlarBas);
				System.out.println("yuzler bas: " + yuzlerBas);
				System.out.println("binler bas: " + binlerBas);// direk sayi da yazd�rabilirdik
				
				// ayn� sta�rda
				System.out.print(birlerBas);
				System.out.print(onlarBas);
				System.out.print(yuzlerBas);
				System.out.print(binlerBas);
				
				System.out.println();// �stte print oldu�u i�in 
				
				
		// sayinin rak toplam�
				System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
			// rak top de�il yanyana yaz tek tek syso yapma	
				System.out.println("" +birlerBas+onlarBas+yuzlerBas+binlerBas);
				
				
		// �rne�i 
		//		System.out.println(sayi/10);
			//	System.out.println(sayi/10);
				// System.out.println(sayi/10); yazarsak hep ayn� say�y� g�r�r�z ��nk� sayinin 10 b�l�nm�� halini atamad�k
				// ama syso lar aras�na sayi/=10; yazsayd�k basamaklar�n yok edilmi� halini verirdi
				
				
				
				
				scan.close();
				
	}

}
