package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation(birle�tirme) 
		// javada birden fazla stringi toplama i�aretiyle toplarsan�z java bu stringleri yan yana ayzar
		
		String str1 = "Java";// "JAVA" YYazarsak iki string aras�na bo�luk koyar
		String str2 = "Guzeldir"; // G den �nce bo�luk koyarsak yine iki string aras�na bo�luk kouat
		
		System.out.println(str1+str2); //JavaGuzeldir 
		
		// yukardakiler acemi e�er araya bo�luk b�rakmak istersek
		System.out.println(str1+" "+str2); // daha g�zel ama bence char bolsuk tan�mlamak daha iyi
		
		System.out.println(str1+' '+str2);// bu da olur ama bir tehlikesi var
		
		// GuzeldirJava yazala�m
		System.out.println(str2+str1);
		
		
		int sayi1 = 5;
		int sayi2 = 4;
		// verilen de�i�kenler kullanarak konsolda 9  yazd�r�n
		System.out.println(sayi1+sayi2);
		 
		// e�er ikiside say�ysa toplama i�lemi yapar ikiside stringse ekleme
		
		
		System.out.println(sayi1+sayi2+str1+str2); // java yukardan a�a��ya ve soldan sa�a �al���r 
		// ilk toplama i�aretini g�r�r �nce ilk 2 de�i�keni toplar sonraki toplama i�aretini g�r�r 9 un yan�na yaz�y� ekler onun yan�na da di�er yaz�y� ekler
		// bir tarafta bile string varsa di�eri int de olsa birle�tiir
		
		System.out.println(str1+str2+sayi1+sayi2); // Javag�zeldir + 5		
													// javaguzeldir5
													// javaguzeldir5+4
													// javaguzeldir5 art�k string oldu ve string +4 oldu e�er bir tane string varsa birle�tit javaguzeldir54
		
		// verilen de�i�kenlerle javag�zeldir1 yazd�r
		
		System.out.println(str1+str2+(sayi1-sayi2)); //i�lem �nceli�i parantez olmadan direk sayi1-sayi2 yazsayd�k javag�zeldir5 stringinden - 4 yani stringten sayi ��karm�� olururz java hata verir sen ne yap�yprsun karde�im der
		
		// verilen de�i�kenlerle 9 javaGuzeldir
		
		System.out.println((sayi1+sayi2) + ' ' + str1+str2 ); // 17.sat�rdaki tehlike char la bo�luk verirsen java bakar iki tarafda sayiysa toplar iki tarafta stringse birle�tirir biri string biri int se java9 yazar biri sttinge biri intken yintin yan�na int ekleyip toplamak istersen parantezle ayzd�r ama biri string bri cahrsa asc� de�eriyle o say�y� toplar
		
		System.out.println(sayi1+sayi2+str1+' '+str2); // char bo�luk stringten sonra olursa bo�luk koyar iki say� aras�na yada say�dan hemen sonra olursa asc� de�erini yazar
		
		System.out.println(str1+str2+sayi1*sayi2); 
		
		
		
		// e�er toplanan degerlerden biri stringse java toplmama de�il concatenation birle�tirme yapar
		// e�er de�erlerin ikiside mat i�lemse java toplar
		// e�er sayi ve string de�i�kenler birlikte kullan�lacaksa �ncelikler belirlenip o i�leme parantez kullan�lablir( bir tane bile string varsa hepsini string gibi birle�tirir bunun �n�ne ge�mek i�in �nce yap�lmas� istenen i�leme parantez)
		// e�er mat i�lemde char de�i�ken kullan�l�rsa java char �n asc� de�erini al�r
		// e�er char de�i�kenle string de�i�ken toplan�rsa concatenation yapar
		
		
		
		
		
		
		
		
	}

}
