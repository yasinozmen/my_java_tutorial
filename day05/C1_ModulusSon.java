package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir int in birler basamaðýndaki rakamý yazdýrýn
		
		int sayi = 1469;
		
		System.out.println("verilen sayinin birlerbas " + sayi%10);
		
		// verilen sayýnýn birler basamagý hariç geriye kalan bas yazdýrýn
		
		System.out.println(sayi/10); //146
		System.out.println(sayi); //1469
		
		System.out.println(sayi/=10); //146
		System.out.println(sayi); //146
		
		// sayi/10; ile sayi/=10; arasýndaki fark
		// = atama assignment demektir
		// bir iþlemde = varsa orada deðer kalýcý olarak deðiþir
		// yoksa sadece o anlýk iþlem yapar
		// sayi/10 yazýlýrsa sayinin deðeri deðiþmez sadece o anlýk iþlemin sonucunu yazdýrýr
		// sayi/=10 yazýlýrsa artýks sayi artýk 10 a bölünmüþtür yeni deðer 10 a bölünmüþ hali olarak sayi deðiþkenine atanýr
		
		
		
	}

}
