package day03;

public class C5_ArtırmaAzaltma {
	public static void main(String[] args) {
		
		
		int num = 15;
		
		// bir sayıyı 2 artırmak istersek sayiyi 2 ile toplarız
		
		int num2 = num + 2; // toplanmış yeni değeri iste5rsek yeni bir var. a istersekde önceki var a aatayabiliriz
		
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num); // 15 yazar çünkü num hala 15
		
		num = num + 5 ; // num isminde yeni kutu oluşmaz sadece içindeki değeri  5 arttırır
		                // eşitliğin sonunda num yazdığımızda eşitliğin sağındaki işlemde oluşan sonuc num var. atanır bu satırdan sonra num 20 dir
		
		System.out.println("17.satırdan sonra num = " + num);
		
		
		System.out.println(num + 12); // 32  // bu sadece 12 artıtrılmış halini yazar bellekteki num ı 32 yapmaz çünkü 32 yi num a ataamdık sadece yazdıredık 12 artmış halini
		
		
		// bir sayıyı artırmak için (increment) o sayıya istediğimiz sayıyı ekler ve sonucu variableye atarız
		
		//num ı 8 arrtı
		
		num = num + 8;  //iki kere num yazıyoruz javanın bir kolaylığı var
		
		// num ı 5 artırın
		
		// num = num + 5; // ikinci num ı sil eşittir ile + nın yerini değiştir
		
		num += 5;
		
		System.out.println("javanın pratik artışından sonra num = " + num);
		
		// num ı 10 artır
		
		num += 10; 
		 System.out.println("yeni num = " + num);
		 
		 // num ı 1 artırın 
		 
		 num += 1; // num 44
		 
		 // evet javadan bir kolaylık daha sadece 1 artırmaya özel olarak 
		 // num++;
		 
		 num++;
		 
		 System.out.println("num in son hali = " + num);
		 
		
		
		
		
		
	
	}

}

