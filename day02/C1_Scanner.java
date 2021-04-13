package day02;

import java.util.Scanner;

public class C1_Scanner {
	
	public static void main(String[] args) {
		
		//scanner ile kullanicidan bilgi alabiliriz
		
		// 3 adimla scanner islemini gerceklestiriyoruz
		
		// 1. adım: scanner olusturacagız
		
		Scanner scan = new Scanner(System.in); 
		
		// new: javada ne zaman new kelimesini gorseniz yeni bir object olusturuluyor demektir.
		
		// parantezin icine yazılan degerlere parametre denir ve scanner icin System.in yazmamız gerekir
		
		//Bir kod yazdıgımızda kodun altında kırmızı cizgi olusuyorsa veya satır numarası 
		//olan kısımda kırmızı x isareti olusuyorsa birseyler yanlıs demektir
		// scanner da kırmızı vardı cunku util scanner import etmemistik.
		// java.util javanın bizim icin hazırladıgı bir kutuphanedir ihtiyacımız olan kodları class'a import etmemiz yeterlidir
		// scan olusturdugumuz Scanner objesine verdigimiz isimdir farklı isimlerde verebiliriz ancak scan ismi tum programcılar tarafından kullanılan bir isimdir kodumuzun anlasılabilir ve rahat okunabilir olması icin scan ismini kullanmamız tavsiye edilir
		// new scanner yeni bir scanner olustur parametre olarak system in girdik in yani sisteme al gibi kendini java gibi dusun
		// Scanner bir class scan bir obje daha sonra bakacagız
		
		//2.adım kullanıcıya bir mesaj yazan 
		System.out.println("Karenin bir kenar uzunlugunu girin");
		
		// 3. adım kullanıcının konsola gridigi degeri programımıza alacagız
		// ve bir variable olusturup bu degeri atayacagız
		// kullanıcıdan bir kenar uzunlugu istedigim icin kullanaca kucuk bir sayı da girebilir buyuk bir sayı da girebilir
		//tamsayıda yazabilir virgullu sayıda yazabilir kullanıcıyı kontrol edebiliriz yada mesaj olarak tamsayı giriniz yazabiliriz ancak kullanıcıyı kontrol etmek istemiyorssak en toleranslıyı seceriz double
		// scan bir obje ve non primitive ve non primitiveler method da alabilir
		double kenar=scan.nextDouble();
		// nextdouble gelen bilgiyi demek stringse nextint bte ise nextbyte
		// bir dahaki satır calıstıgında sayıyı al demek
		// double kenar yazarak aldıgımız degeri bir variableyeye atadık
		
		
	System.out.println("girdiginiz kenar uzunluguna sahip karenin alanı="+kenar*kenar);
	//5.2*5.2 = 27.04
	
		
		
		
		scan.close();
		
	}

}
