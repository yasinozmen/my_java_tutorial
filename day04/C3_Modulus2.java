package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// kullanýcýdan 4 bas bir sayý alalým ve sayinin bas larýný ters sýrada yazdýralým
		
		// basamaklarý al ters yazýr
		
		// bir sayýnýn basamakalrýný elde etmekmiçin 
		// 2 iþlemi tekrar tekrar yaparýz
		// birinci iþlem en sondaki basaaðý elde etmek 
		// 2. islem en sondaki basamaðý yok etmek
		// istenen bas sayýsý kadar yaparýz
		// sonuncuda tek bas kalýr bidaha yapmayýz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("basamaklarýný bulmak icin 4 baslý sayý girin");
		
		int sayi = scan.nextInt(); // bu satýrdan itibaren elimizde 4 bas lý bir sayý var
		// 4 basamaðý elde etmek için yukarýda yazdýðýmýz iþlemi 3 ýkere yapýyoruz
		// 1.tekrar
		int birlerBas = sayi % 10 ;
		sayi /= 10;
		
		//bu satýrdan itibaren sayý 3 basamaklý 
		
		// onlar bas ýný elde etmek için ikinci kez % 10
		
		int onlarBas =  sayi % 10;
		
		sayi/=10;
		// kurtulmamýzýn nedeni bir sonraki bas ý elde etmek
		// bu stýrdan itibaren sayimiz 2 bas
		
		// 3 .tekrar 
		
		int yuzlerBas= sayi % 10;
		
		sayi/=10;
		
		// bu satýrdan itibaren sayý tek bas
		int binlerBas=sayi % 10;// bunda zorunluluk yok zaten tek bas
				
			// tüm basamaklar var ve yazdýralaým
				
				System.out.println("birler bas: " + birlerBas);
				System.out.println("onalr bas: " + onlarBas);
				System.out.println("yuzler bas: " + yuzlerBas);
				System.out.println("binler bas: " + binlerBas);// direk sayi da yazdýrabilirdik
				
				// ayný staýrda
				System.out.print(birlerBas);
				System.out.print(onlarBas);
				System.out.print(yuzlerBas);
				System.out.print(binlerBas);
				
				System.out.println();// üstte print olduðu için 
				
				
		// sayinin rak toplamý
				System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
			// rak top deðil yanyana yaz tek tek syso yapma	
				System.out.println("" +birlerBas+onlarBas+yuzlerBas+binlerBas);
				
				
		// örneði 
		//		System.out.println(sayi/10);
			//	System.out.println(sayi/10);
				// System.out.println(sayi/10); yazarsak hep ayný sayýyý görürüz çünkü sayinin 10 bölünmüþ halini atamadýk
				// ama syso lar arasýna sayi/=10; yazsaydýk basamaklarýn yok edilmiþ halini verirdi
				
				
				
				
				scan.close();
				
	}

}
