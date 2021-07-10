package day03;

public class C4_DataCastingDaralma {
	public static void main(String[] args) {
		// double deðiþken oluþturalým int a ve sonrada byte a çevirelim
		
		double numDouble = 400.56;  // 15.23deðeri virgüllü atasaydýk inte çevirseydik . dan öncesini alýrdý
		// double dan int e gecerken sayýda ondalýklý deðer varsa java ondalýklý bölümü yok sayar tam bölümü alýr
		//byte ýn sýnýrlarý dýþýnda bir deðer girersek 131.56 -125 yazar 
		//çünkü byte -128 ile 127 deðerlerini alýr 131 e kadar sayacaðýz 127 dden sonrasýna ulaþamadýk 4 sayý gitmek lazým
		// 127 den sonrasý olmadýðý için en baþa yani -128 e gelir ve +4 yapar(tam +4 deðil þöyle: 1 tane gelir -127 bir daha gelir -126 bir daha gelir-125 ama 3 tane geldi? hayýr bir tanede 127 den -128e gelmiþti ve sonuçta -125 yazar
		// 400.56 yazsaydýk -112 verirdi çünkü 127 e doðru tur atýyor
		int numInt = (int)numDouble;
		// direk numDouble a eþitleyince hata verdi çünkü double int den büyük
		
		System.out.println("integer degisken degeri :" + numInt);
		
		byte numByte = (byte)numInt;
		// daha dar(narrow) bir data tipine çevirirken data tipinin sýnýrýndan büyükse saymaya negatif 
		// en küçük sayýdan devam eder(en son sýnýrdan en küçük sýnýra geçince de 1 adým sayýlýr) istenen sayýya gelinceye kadar tekrar en küçük negatif sayýya gider tur atar yani
		
		
		System.out.println("byte degisken degeri : " + numByte);
		
		
	}

}
