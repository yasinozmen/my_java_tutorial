package day03;

public class C5_Art�rmaAzaltma {
	public static void main(String[] args) {
		
		
		int num = 15;
		
		// bir say�y� 2 art�rmak istersek sayiyi 2 ile toplar�z
		
		int num2 = num + 2; // toplanm�� yeni de�eri iste5rsek yeni bir var. a istersekde �nceki var a aatayabiliriz
		
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num); // 15 yazar ��nk� num hala 15
		
		num = num + 5 ; // num isminde yeni kutu olu�maz sadece i�indeki de�eri  5 artt�r�r
		                // e�itli�in sonunda num yazd���m�zda e�itli�in sa��ndaki i�lemde olu�an sonuc num var. atan�r bu sat�rdan sonra num 20 dir
		
		System.out.println("17.sat�rdan sonra num = " + num);
		
		
		System.out.println(num + 12); // 32  // bu sadece 12 art�tr�lm�� halini yazar bellekteki num � 32 yapmaz ��nk� 32 yi num a ataamd�k sadece yazd�red�k 12 artm�� halini
		
		
		// bir say�y� art�rmak i�in (increment) o say�ya istedi�imiz say�y� ekler ve sonucu variableye atar�z
		
		//num � 8 arrt�
		
		num = num + 8;  //iki kere num yaz�yoruz javan�n bir kolayl��� var
		
		// num � 5 art�r�n
		
		// num = num + 5; // ikinci num � sil e�ittir ile + n�n yerini de�i�tir
		
		num += 5;
		
		System.out.println("javan�n pratik art���ndan sonra num = " + num);
		
		// num � 10 art�r
		
		num += 10; 
		 System.out.println("yeni num = " + num);
		 
		 // num � 1 art�r�n 
		 
		 num += 1; // num 44
		 
		 // evet javadan bir kolayl�k daha sadece 1 art�rmaya �zel olarak 
		 // num++;
		 
		 num++;
		 
		 System.out.println("num in son hali = " + num);
		 
		
		
		
		
		
	
	}

}

