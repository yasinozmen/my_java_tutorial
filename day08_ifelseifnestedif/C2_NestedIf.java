package day08_ifelseifnestedif;

public class C2_NestedIf {
  public static void main(String[] args) {
	// nested i� i�e demek 
	  // verilen cinsiyet ve yas i�in ki�inin emekli  olup olmauyacag�n� yazd�r�n
	  // e�er cal�san kad�nsa 60 yas�ndan buyukse mekli olur
	  // erkekse 65 yas�ndan buyuykse emekli olur
	  
	  
	  // i� i�e if olamdan zor hali
	  
	  String cinsiyet = "Kadin";
	  int yas = 10;
	  // soruda verilen derse kendin de�eri de�i�tirip dene d��ardan alma yok
	  if(yas<0) {
		  
		  System.out.println("yas negatif olamaz");
	  }
	  else if(cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
		  System.out.println("emeklisiniz");
		  
	  }else if (cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
		  
		  System.out.println("emekli olamazs�n");
		  
	  }else if (cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
		  System.out.println("emeklisin");
		  
	  }else if (cinsiyet.equalsIgnoreCase("kadin") && yas<60) {
		  System.out.println("emekli olamazs�n");
		  
		  
	  }else {
		  
		  System.out.println("cinsiyet veya yas tan�ms�z");
	  }
	  
	  
	  System.out.println("nested if ile sonu�");
	  
	  if(cinsiyet.equalsIgnoreCase("erkek")) { // erkek se buras�
		  
		      if (yas<0) {
			  System.out.println("yas negatif olamaz");
		      }else if (yas<65){
			  System.out.println("emekli olamzss�n");
		      }else {
			  System.out.println("emekli olabilirsin");
		     }
		  
		  
		  
		  
	  }else if(cinsiyet.equalsIgnoreCase("kadin")){ // kad�nsa buras�
		  
		    if(yas<0) {
			  System.out.println("yas negatif olamaz");
			  
		    }else if(yas<60) {
			  System.out.println("emekli olamz");
		    }else {
			  System.out.println("emekliolablirsiniz");
		    }
		  
	  }else {
		  
		  System.out.println("gecersiz cinsiyet"); // c�nsiyet ge�ersizse 
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
