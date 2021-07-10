package day03;

public class C4_DataCastingDaralma {
	public static void main(String[] args) {
		// double de�i�ken olu�tural�m int a ve sonrada byte a �evirelim
		
		double numDouble = 400.56;  // 15.23de�eri virg�ll� atasayd�k inte �evirseydik . dan �ncesini al�rd�
		// double dan int e gecerken say�da ondal�kl� de�er varsa java ondal�kl� b�l�m� yok sayar tam b�l�m� al�r
		//byte �n s�n�rlar� d���nda bir de�er girersek 131.56 -125 yazar 
		//��nk� byte -128 ile 127 de�erlerini al�r 131 e kadar sayaca��z 127 dden sonras�na ula�amad�k 4 say� gitmek laz�m
		// 127 den sonras� olmad��� i�in en ba�a yani -128 e gelir ve +4 yapar(tam +4 de�il ��yle: 1 tane gelir -127 bir daha gelir -126 bir daha gelir-125 ama 3 tane geldi? hay�r bir tanede 127 den -128e gelmi�ti ve sonu�ta -125 yazar
		// 400.56 yazsayd�k -112 verirdi ��nk� 127 e do�ru tur at�yor
		int numInt = (int)numDouble;
		// direk numDouble a e�itleyince hata verdi ��nk� double int den b�y�k
		
		System.out.println("integer degisken degeri :" + numInt);
		
		byte numByte = (byte)numInt;
		// daha dar(narrow) bir data tipine �evirirken data tipinin s�n�r�ndan b�y�kse saymaya negatif 
		// en k���k say�dan devam eder(en son s�n�rdan en k���k s�n�ra ge�ince de 1 ad�m say�l�r) istenen say�ya gelinceye kadar tekrar en k���k negatif say�ya gider tur atar yani
		
		
		System.out.println("byte degisken degeri : " + numByte);
		
		
	}

}
