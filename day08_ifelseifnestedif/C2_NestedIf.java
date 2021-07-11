package day08_ifelseifnestedif;

public class C2_NestedIf {
  public static void main(String[] args) {
	// nested iç içe demek 
	  // verilen cinsiyet ve yas için kiþinin emekli  olup olmauyacagýný yazdýrýn
	  // eðer calýsan kadýnsa 60 yasýndan buyukse mekli olur
	  // erkekse 65 yasýndan buyuykse emekli olur
	  
	  
	  // iç içe if olamdan zor hali
	  
	  String cinsiyet = "Kadin";
	  int yas = 10;
	  // soruda verilen derse kendin deðeri deðiþtirip dene dýþardan alma yok
	  if(yas<0) {
		  
		  System.out.println("yas negatif olamaz");
	  }
	  else if(cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
		  System.out.println("emeklisiniz");
		  
	  }else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
		  
		  System.out.println("emekli olamazsýn");
		  
	  }else if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
		  System.out.println("emeklisin");
		  
	  }else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60) {
		  System.out.println("emekli olamazsýn");
		  
		  
	  }else {
		  
		  System.out.println("cinsiyet veya yas tanýmsýz");
	  }
	  
	  
	  System.out.println("nested if ile sonuç");
	  
	  if(cinsiyet.equalsIgnoreCase("erkek")) { // erkek se burasý
		  
		      if (yas<0) {
			  System.out.println("yas negatif olamaz");
		      }else if (yas<65){
			  System.out.println("emekli olamzssýn");
		      }else {
			  System.out.println("emekli olabilirsin");
		     }
		  
		  
		  
		  
	  }else if(cinsiyet.equalsIgnoreCase("kadin")){ // kadýnsa burasý
		  
		    if(yas<0) {
			  System.out.println("yas negatif olamaz");
			  
		    }else if(yas<60) {
			  System.out.println("emekli olamz");
		    }else {
			  System.out.println("emekliolablirsiniz");
		    }
		  
	  }else {
		  
		  System.out.println("gecersiz cinsiyet"); // cýnsiyet geçersizse 
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
