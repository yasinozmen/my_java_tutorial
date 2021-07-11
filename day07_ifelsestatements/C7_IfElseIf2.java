package day07_ifelsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// 2 sayi iste ikiside pozitifse toplamýný yazdýr negatifse çarpýmýný yazdýr ikisi farklý iþaretlere sahipse farklý iþaetli sayýlarla 
		//iþlem yapamazsýn yaz sýfýra eþit varsa sýfýr çarpmada yutan eleman vardýr yaz
		// önce algotirmayý yaz kodu yazmak kolay
		// a==0 || b==0
		//a>0 && b>0
		// a<0 && b<0
		// diðer durumlar else
		
	Scanner scan = new Scanner(System.in);
	
		System.out.println("ilk sayýyý girin");
			double a = scan.nextDouble();
	
		System.out.println("ikinci sayýyý gir");
			double b = scan.nextDouble();
	
		    if(a==0 || b==0) {//ikisinden biri yada ikiside 0 olablir
				System.out.println("0  yutan eleman");
				} //else if(a>0 && b>0) {
					//System.out.println("toplamý" + (a+b)); // parantez kullandýk çünkü string sanýp birþeltirir bir tane string var diðer a ve b yi de içine ekler ama çarpma olsa iþlem önceliðinden paranteze gerek yok
	//			} 
	else if(a<0 && b<0) {
					System.out.println("carpýmý"+ a*b); // önce çarpma sonra birleþtirme ne demiþtik birleþtirmede önceliðimiz varsa iþlem önceliðini kullan zaten çarpmöa yapýnca stringden sonraki + den daha önce yapar çarpar sonra birleþtiti(toplar
				} else {
					System.out.println("farklý iþaretlerel iþlem yok");
				}
			
	
		
		
scan.close();
	}

}
