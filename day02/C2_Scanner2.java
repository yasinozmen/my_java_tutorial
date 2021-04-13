package day02;

import java.util.Scanner;

public class C2_Scanner2 {
	public static void main(String[] args) {
		// kullanıcıdan yarı capını isteyin ve dairenin alanını yazdırın
		
				// 3 adımı kullan
				// 1)bir deger alıp kullancaksak once scanner objesi olustur 
				// 2)kullanıcıya ne istedigini yazdır
				// 3) girilen degeri alacagın bir variable olustur variable i yaz scani al icine koy
				// 4) aldıgın degeri hesapla yazdır
		Scanner scan = new Scanner(System.in);//1.adım
		System.out.println("Alanını hesaplamak icin dairenin yarıcapını girin");//2.adım
		double yaricap= scan.nextDouble();//3.adım bu olmazsa alanı hesaplayamassın sadece girer
		// kullanıcıdan yarıcap istedim
		//once kullanıcının girdigi yarıcapı icine koyacagım bir degisken olusturmalıyız
		
		System.out.println("dairenin alanı= " + 3.14*yaricap*yaricap); //4.adım
		
		// java yukarıdan asagı calısır 
		//once scanner objemizi olusturur 
		// sonra mesajı yazar 
		// yarıcap isminde bir variable olusturur esittir sayesinde girilen degeri alır variable atar
		//sonra mesaj yazıp alanı hesaplatır yazdırır
	// kendime bir not bir kutum var bunun icine yarıcapı atarsan alttan sana  dairenin alanını verecek 
	
	scan.close();
	}

}
