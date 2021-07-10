package day04;

public class C2_ModulesOperatoru {

	public static void main(String[] args) {
		// modulus operatoru bölme iþleminde kalaný verir
		
		// 15 tek mi çift mi? 15/2 kalan 1 ise tektir kalan 0 sa çifttir
		// 25 uce bolunur mu? 25/3 kalan 1 kalan 0 deðilse bölünemez
		// herhangi bir sayýnýn 7 ile bölünebildiðini kontrol etmek için 
		// modulus iþlemi kullanýrýz 7 ile böldüðümde kalan 0 sa bölünür
		
		
		int kalan = 15 % 4 ;
		
		System.out.println(kalan ); //3
		
		System.out.println(26 % 8);
		
		
		//  856 sayýsýnýn birler basamaðý kaçtýr? 6
		// kullanýcýcn girdiði syýnýn birler bas istense?
		// bas bulomak için mantýk ayný bilemem kaç bas lý girdðini sürekli 10 a bölerim
		int sayi = 856;
		int birlerBasamagi = sayi % 10;
		
		System.out.println("sayinin birler basamagi : " + birlerBasamagi); //6
		
		//856 sayýsýnýn onlar bas kaçtýr?
		// bunun için birler bas dan kutulmamgerek
		// kurtulmak için sayýyý 10 a böleriz
		// 3 haneli sayýnýn birler basamaðýndan kurtulunca iki haneli sayýnýn birler basamaðý
		// 3 haneli sayýnýn onlar bas olur ve istenen sayýnýn onlar bas ný bulmuþ olruuz
		
		// 10 a bölerek kuruluruz 6 dan ikiside int olduðu için virgülden sonrasýný alamz
		
		
		sayi/=10;
		System.out.println("10 a bolundukten sonra sayýnýn deger :" + sayi);
		
		
		int onlarBasamagi = sayi % 10 ;
		
		System.out.println("onlar bas: " + onlarBasamagi);
		
		// 100 ler basamaðýný bulmak için birkez daha 10 a bölersek bu sefer
		sayi/=10;
		
		// 10 lar bas dan kurtulduk
		
		System.out.println("2.defa 10a boldukten sonra : " + sayi); //yüzler bas
		
		int yuzlerBasamagi=sayi;
		System.out.println(yuzlerBasamagi);
		
		
		
 
	}

}
