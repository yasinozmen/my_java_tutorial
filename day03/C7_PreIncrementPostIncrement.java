package day03;

public class C7_PreIncrementPostIncrement {
	public static void main(String[] args) {
		
		
		int num = 20;
		
		//post�nc
		num++; // num=21
		System.out.println(num); //  21 burda num++ dersek 20 yazar ��nk� num++ oldu�u sat�rdan sonra de�eri 1 art�r�r
		
		System.out.println(num++); //21 burda hala 21 yazar ��nk� burda num++ sonra art�r demek
		
		System.out.println(num++); //22 burda 22 ��nk� 12.sat�rda numm++ ile bir art�rm��t� art�k 12.sat�rdan sonra num 22
		
		//pre�nc
		System.out.println(++num); //23 num � �nce 1 art�rd� ve yazd�rd�
		System.out.println(num);  // zaten 23 du
				
		
		
	}

}
