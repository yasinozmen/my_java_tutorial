package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		// �ifre iste ilk harf buyukse A ise ge�erli �ifre de�ilse ge�ersiz
		//k���kse z ise ge�erli de�ilse ge�ersiz
		
		// birinci i�lem �ifreyi al ilk harfine bak 
		// buyuk mu kucuk mu
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sifre girin");
		
char ilkHarf = scan.next().charAt(0); // ilk harf laz�m girilen �ifrenin ilk karakterini ald�k
		
 if (ilkHarf>='A' && ilkHarf<='Z') { // Girilenin karakterin  harf olup olmad�g�na VE BUYUK HARF OLUP OLAMDIGINA bakt�k ilk harf buyuk ise
			
			if (ilkHarf=='A') {
				System.out.println("GE�ERL� S�FRE");
			} else {
				System.out.println("GECERS�Z BUYUK HARF");
			}
		
} else if(ilkHarf>='a' && ilkHarf<='z'){ //ilk harf kucuk ise
		if (ilkHarf=='z') {
			System.out.println("ge�erli");
		} else {
			System.out.println("gecersiz KUCUK HARF");
		}
		
		
		
}else { // ilk harf buyuk veya kucuk de�ilse
		System.out.println("gecersiz   LUTFEN �LK KARAKTER�  HARF G�R");
	}
		
scan.close();
	}

}
