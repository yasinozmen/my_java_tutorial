package day03;

import java.util.Scanner;

public class C1_Scanner1 {
     public static void main(String[] args) {
	
    	 //kullan�c�dan isim ve soyismini isteyip isim : mehmet 
    	// soyisim :bulutluoz kursumuza kayd�n�z al�nm��t�r te�ekk�r ederiz.
    	 // scanner: kullan�c�dan bilgi almak i�in kullan�l�r
    	 // 3 ad�mda i�lemi tamaml�yoruz
    	 // 1.ad�m scanner objesi olu�turuyoruz
    	 // Scanner �n �al��mas� i�in java.util(utilities) k�t�phanesinden ilgili k�sm� class�m�za import etmeliyiz
    	 
    	
    	 Scanner scan = new Scanner(System.in); // e�itli�in sol taraf� scanner dan scan objesi olu�tur sa� taraf�ndaki de�eri sola ata
	
    	 
    	 //kullan�c�ya ne istedi�imizi belirten bir mesaj yazmal�y�z
    	 
    	 System.out.println(" l�tfen sadece isminizi giriniz: ");
    	 
    	 // 3.ad�m bir variable olu��turup kullan�c�n�n girdi�i de�eri atayaca��z
    	 
    	 String name = scan.nextLine();
    	 
    	 System.out.println(" l�tfen sadece soyisminizi giriniz: ");
    	 
    	// String surname = scan.nextLine(); bu �ekilde yazarsak sadece ilk kelimeyi al�r sonrakileri almaz
    	 
    	 String surname = scan.nextLine();
    	 
    	 
    	 
    	 // benden istenen �ekilde ��kt�yt� yazd�rabilirim
    	 // e�er yazd�raca��m�z yaz� sabir bir yaz� ise " " aras�nda yazd�r�yoruz e�er bir variableye atanm�� de�eri yazd�rmak istersek "" olmadan sadece variable ismini yaz�yoruz
    	 
    	System.out.println("isminiz: " + name);
    	System.out.println("soyisminiz: " + surname);
    	System.out.println("kursumuza kayd�n�z al�nm��t�r te�ekk�r ederiz");
    	 
    	 
    	 scan.close();
     }

}
