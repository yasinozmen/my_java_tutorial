package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//kullanıcıdan ismini ve soyismini alıp aralarında bir bosluk bırakarak
		// isim ve soyismini yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("lutfen isminizi giriniz: ");
		
		String name= scan.nextLine(); // sadece next secilirse kullancı birden fazla kelime girse de ilk kelimeyi alır
		                         // eger tum yazıyı almal istersek nextLine()secmeliyiz
                                 // ismi aldık name e atadık
		System.out.println("lutfen soyisminizi giriniz"); // variable degil sadece sabit yazı o yuzden tırnak
		
		String surname= scan.nextLine(); // butun satırı alacak
		
		
		System.out.println( name +" " +surname); // name sabit yazı degil variable tırnaksız
	scan.close();
	
	}

}
