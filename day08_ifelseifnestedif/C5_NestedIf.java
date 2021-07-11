package day08_ifelseifnestedif;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		// þifre iste ilk harf buyukse A ise geçerli þifre deðilse geçersiz
		//küçükse z ise geçerli deðilse geçersiz
		
		// birinci iþlem þifreyi al ilk harfine bak 
		// buyuk mu kucuk mu
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sifre girin");
		
char ilkHarf = scan.next().charAt(0); // ilk harf lazým girilen þifrenin ilk karakterini aldýk
		
 if (ilkHarf>='A' && ilkHarf<='Z') { // Girilenin karakterin  harf olup olmadýgýna VE BUYUK HARF OLUP OLAMDIGINA baktýk ilk harf buyuk ise
			
			if (ilkHarf=='A') {
				System.out.println("GEÇERLÝ SÝFRE");
			} else {
				System.out.println("GECERSÝZ BUYUK HARF");
			}
		
} else if(ilkHarf>='a' && ilkHarf<='z'){ //ilk harf kucuk ise
		if (ilkHarf=='z') {
			System.out.println("geçerli");
		} else {
			System.out.println("gecersiz KUCUK HARF");
		}
		
		
		
}else { // ilk harf buyuk veya kucuk deðilse
		System.out.println("gecersiz   LUTFEN ÝLK KARAKTERÝ  HARF GÝR");
	}
		
scan.close();
	}

}
