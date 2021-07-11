package day06_IfStatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// kullanýcýdan gün ismini isteyin girilen günin haftaiçi veya haftasonu old yazdýrn
		// pazar --> haftasonu salý--> haftaiçi
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen gun adýný giriniz");
    String gunAdý = scan.next().toLowerCase(); // if de cumartesi yazdýðýmýz için kullancýý büyük harfe girerse if çalýþmaz o yüzden ne grerse girsin bizim þarýmýzda yazana yani cumartesi ye çevirdik
    
    // eger stringlerde eþitlik sorguluyorsak == kullanmamalýyýz
    // stringlerde eþit olma durumunu sprgulamak için equal ()
    
    if (gunAdý.equals("cumartesi") || gunAdý.equals("pazar")) {
    	
    	System.out.println("haftasonu");
    	
    }
    
		
		
 if (gunAdý.equals("pazartesi") || gunAdý.equals("sali")  || gunAdý.equals("carsamba")|| gunAdý.equals("persembe")|| gunAdý.equals("cuma")) {
    	
    	System.out.println("haftaici");
    	
    }
    
    
 
 
    
    scan.close();
		
	}


}