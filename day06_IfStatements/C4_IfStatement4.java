package day06_IfStatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullan�c�dan g�n ismini isteyin girilen g�nin haftai�i veya haftasonu old yazd�rn
		// pazar --> haftasonu sal�--> haftai�i
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen gun ad�n� giriniz");
    String gunAd� = scan.next().toLowerCase(); // if de cumartesi yazd���m�z i�in kullanc�� b�y�k harfe girerse if �al��maz o y�zden ne grerse girsin bizim �ar�m�zda yazana yani cumartesi ye �evirdik
    
    // eger stringlerde e�itlik sorguluyorsak == kullanmamal�y�z
    // stringlerde e�it olma durumunu sprgulamak i�in equal ()
    
    if (gunAd�.equals("cumartesi") || gunAd�.equals("pazar")) {
    	
    	System.out.println("haftasonu");
    	
    }
    
		
		
 if (gunAd�.equals("pazartesi") || gunAd�.equals("sali")  || gunAd�.equals("carsamba")|| gunAd�.equals("persembe")|| gunAd�.equals("cuma")) {
    	
    	System.out.println("haftaici");
    	
    }
    
    
 
 
    
    scan.close();
		
	}


}