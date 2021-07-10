package day03;

import java.util.Scanner;

public class C2_Scanner2 {
   public static void main(String[] args) {
	
	   // kullanýcýdan ismini isteyip ilk harfini büyük harf olarak yazdýrýn
	   // mehmet==> bas harfiniz : M
	   
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("lutfen isminizi giriniz");
	   
	   char ilkHarf = scan.next().toUpperCase().charAt(0); // Önce büyük harfe çevirdik sonra ilk harfi aldýk çünkü önce ilk harfi alsak artýk tip char olacak char primitivie ve method almak ve büyük harfe çevirme methodunu yazamayýz
	   // eðer charAt(0) yazdýktan sonra . koyarsak methodlar gelmez
	   // çünkü charAt(0) methodu kullanýnca variableimizi char yapmýþ oluruz
	   // char primitive dir ve methodu yoktur
	   // upper case parametre alamz
	   // baþta eþitliðin saðýna string yazdýk hata verdi çünkü string chardan buyuk 
	   // stringle baþlayýp auto wid. yapmadýk çünkü string non pri
	   // Stringde harflerin indexi 0 dan baþlar
	   // biz ilk harfi almak istediðimiz için index olarak 0 girmeliyiz
	   System.out.println("basharfiniz : " + ilkHarf);
	   
	   scan.close();
	   
	   
}
}
