package day03;

import java.util.Scanner;

public class C2_Scanner2 {
   public static void main(String[] args) {
	
	   // kullan�c�dan ismini isteyip ilk harfini b�y�k harf olarak yazd�r�n
	   // mehmet==> bas harfiniz : M
	   
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("lutfen isminizi giriniz");
	   
	   char ilkHarf = scan.next().toUpperCase().charAt(0); // �nce b�y�k harfe �evirdik sonra ilk harfi ald�k ��nk� �nce ilk harfi alsak art�k tip char olacak char primitivie ve method almak ve b�y�k harfe �evirme methodunu yazamay�z
	   // e�er charAt(0) yazd�ktan sonra . koyarsak methodlar gelmez
	   // ��nk� charAt(0) methodu kullan�nca variableimizi char yapm�� oluruz
	   // char primitive dir ve methodu yoktur
	   // upper case parametre alamz
	   // ba�ta e�itli�in sa��na string yazd�k hata verdi ��nk� string chardan buyuk 
	   // stringle ba�lay�p auto wid. yapmad�k ��nk� string non pri
	   // Stringde harflerin indexi 0 dan ba�lar
	   // biz ilk harfi almak istedi�imiz i�in index olarak 0 girmeliyiz
	   System.out.println("basharfiniz : " + ilkHarf);
	   
	   scan.close();
	   
	   
}
}
