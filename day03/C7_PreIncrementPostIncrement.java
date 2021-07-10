package day03;

public class C7_PreIncrementPostIncrement {
	public static void main(String[] args) {
		
		
		int num = 20;
		
		//postınc
		num++; // num=21
		System.out.println(num); //  21 burda num++ dersek 20 yazar çünkü num++ olduğu satırdan sonra değeri 1 artırır
		
		System.out.println(num++); //21 burda hala 21 yazar çünkü burda num++ sonra artır demek
		
		System.out.println(num++); //22 burda 22 çünkü 12.satırda numm++ ile bir artırmıştı artık 12.satırdan sonra num 22
		
		//preınc
		System.out.println(++num); //23 num ı önce 1 artırdı ve yazdırdı
		System.out.println(num);  // zaten 23 du
				
		
		
	}

}
