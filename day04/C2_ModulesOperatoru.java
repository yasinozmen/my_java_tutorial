package day04;

public class C2_ModulesOperatoru {

	public static void main(String[] args) {
		// modulus operatoru b�lme i�leminde kalan� verir
		
		// 15 tek mi �ift mi? 15/2 kalan 1 ise tektir kalan 0 sa �ifttir
		// 25 uce bolunur mu? 25/3 kalan 1 kalan 0 de�ilse b�l�nemez
		// herhangi bir say�n�n 7 ile b�l�nebildi�ini kontrol etmek i�in 
		// modulus i�lemi kullan�r�z 7 ile b�ld���mde kalan 0 sa b�l�n�r
		
		
		int kalan = 15 % 4 ;
		
		System.out.println(kalan ); //3
		
		System.out.println(26 % 8);
		
		
		//  856 say�s�n�n birler basama�� ka�t�r? 6
		// kullan�c�cn girdi�i sy�n�n birler bas istense?
		// bas bulomak i�in mant�k ayn� bilemem ka� bas l� gird�ini s�rekli 10 a b�lerim
		int sayi = 856;
		int birlerBasamagi = sayi % 10;
		
		System.out.println("sayinin birler basamagi : " + birlerBasamagi); //6
		
		//856 say�s�n�n onlar bas ka�t�r?
		// bunun i�in birler bas dan kutulmamgerek
		// kurtulmak i�in say�y� 10 a b�leriz
		// 3 haneli say�n�n birler basama��ndan kurtulunca iki haneli say�n�n birler basama��
		// 3 haneli say�n�n onlar bas olur ve istenen say�n�n onlar bas n� bulmu� olruuz
		
		// 10 a b�lerek kuruluruz 6 dan ikiside int oldu�u i�in virg�lden sonras�n� alamz
		
		
		sayi/=10;
		System.out.println("10 a bolundukten sonra say�n�n deger :" + sayi);
		
		
		int onlarBasamagi = sayi % 10 ;
		
		System.out.println("onlar bas: " + onlarBasamagi);
		
		// 100 ler basama��n� bulmak i�in birkez daha 10 a b�lersek bu sefer
		sayi/=10;
		
		// 10 lar bas dan kurtulduk
		
		System.out.println("2.defa 10a boldukten sonra : " + sayi); //y�zler bas
		
		int yuzlerBasamagi=sayi;
		System.out.println(yuzlerBasamagi);
		
		
		
 
	}

}
