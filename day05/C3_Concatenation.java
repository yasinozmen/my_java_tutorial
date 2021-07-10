package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation(birleþtirme) 
		// javada birden fazla stringi toplama iþaretiyle toplarsanýz java bu stringleri yan yana ayzar
		
		String str1 = "Java";// "JAVA" YYazarsak iki string arasýna boþluk koyar
		String str2 = "Guzeldir"; // G den önce boþluk koyarsak yine iki string arasýna boþluk kouat
		
		System.out.println(str1+str2); //JavaGuzeldir 
		
		// yukardakiler acemi eðer araya boþluk býrakmak istersek
		System.out.println(str1+" "+str2); // daha güzel ama bence char bolsuk tanýmlamak daha iyi
		
		System.out.println(str1+' '+str2);// bu da olur ama bir tehlikesi var
		
		// GuzeldirJava yazalaým
		System.out.println(str2+str1);
		
		
		int sayi1 = 5;
		int sayi2 = 4;
		// verilen deðiþkenler kullanarak konsolda 9  yazdýrýn
		System.out.println(sayi1+sayi2);
		 
		// eðer ikiside sayýysa toplama iþlemi yapar ikiside stringse ekleme
		
		
		System.out.println(sayi1+sayi2+str1+str2); // java yukardan aþaðýya ve soldan saða çalýþýr 
		// ilk toplama iþaretini görür önce ilk 2 deðiþkeni toplar sonraki toplama iþaretini görür 9 un yanýna yazýyý ekler onun yanýna da diðer yazýyý ekler
		// bir tarafta bile string varsa diðeri int de olsa birleþtiir
		
		System.out.println(str1+str2+sayi1+sayi2); // Javagüzeldir + 5		
													// javaguzeldir5
													// javaguzeldir5+4
													// javaguzeldir5 artýk string oldu ve string +4 oldu eðer bir tane string varsa birleþtit javaguzeldir54
		
		// verilen deðiþkenlerle javagüzeldir1 yazdýr
		
		System.out.println(str1+str2+(sayi1-sayi2)); //iþlem önceliði parantez olmadan direk sayi1-sayi2 yazsaydýk javagüzeldir5 stringinden - 4 yani stringten sayi çýkarmýþ olururz java hata verir sen ne yapýyprsun kardeþim der
		
		// verilen deðiþkenlerle 9 javaGuzeldir
		
		System.out.println((sayi1+sayi2) + ' ' + str1+str2 ); // 17.satýrdaki tehlike char la boþluk verirsen java bakar iki tarafda sayiysa toplar iki tarafta stringse birleþtirir biri string biri int se java9 yazar biri sttinge biri intken yintin yanýna int ekleyip toplamak istersen parantezle ayzdýr ama biri string bri cahrsa ascý deðeriyle o sayýyý toplar
		
		System.out.println(sayi1+sayi2+str1+' '+str2); // char boþluk stringten sonra olursa boþluk koyar iki sayý arasýna yada sayýdan hemen sonra olursa ascý deðerini yazar
		
		System.out.println(str1+str2+sayi1*sayi2); 
		
		
		
		// eðer toplanan degerlerden biri stringse java toplmama deðil concatenation birleþtirme yapar
		// eðer deðerlerin ikiside mat iþlemse java toplar
		// eðer sayi ve string deðiþkenler birlikte kullanýlacaksa öncelikler belirlenip o iþleme parantez kullanýlablir( bir tane bile string varsa hepsini string gibi birleþtirir bunun önüne geçmek için önce yapýlmasý istenen iþleme parantez)
		// eðer mat iþlemde char deðiþken kullanýlýrsa java char ýn ascý deðerini alýr
		// eðer char deðiþkenle string deðiþken toplanýrsa concatenation yapar
		
		
		
		
		
		
		
		
	}

}
