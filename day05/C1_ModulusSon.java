package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir int in birler basama��ndaki rakam� yazd�r�n
		
		int sayi = 1469;
		
		System.out.println("verilen sayinin birlerbas " + sayi%10);
		
		// verilen say�n�n birler basamag� hari� geriye kalan bas yazd�r�n
		
		System.out.println(sayi/10); //146
		System.out.println(sayi); //1469
		
		System.out.println(sayi/=10); //146
		System.out.println(sayi); //146
		
		// sayi/10; ile sayi/=10; aras�ndaki fark
		// = atama assignment demektir
		// bir i�lemde = varsa orada de�er kal�c� olarak de�i�ir
		// yoksa sadece o anl�k i�lem yapar
		// sayi/10 yaz�l�rsa sayinin de�eri de�i�mez sadece o anl�k i�lemin sonucunu yazd�r�r
		// sayi/=10 yaz�l�rsa art�ks sayi art�k 10 a b�l�nm��t�r yeni de�er 10 a b�l�nm�� hali olarak sayi de�i�kenine atan�r
		
		
		
	}

}
