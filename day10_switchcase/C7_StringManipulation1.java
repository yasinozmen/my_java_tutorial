package day10_switchcase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// String non-primitive data turundendir
		// non-primitive data turleri value ile birlikte methodlara sahiptirler
		// methodlar� kullanarak Stringi de�i�tirmeye string manipulation denir
		
		String str = "Hello World";
		
		System.out.println(str.toUpperCase()); // HELLO WORLD yazar ama ge�i�i olarak 
		
		System.out.println(str); // Hello World ��nk� atama yapmad�k str hala kucuk harf 
 		
		
		String str2 = str.toUpperCase();
		System.out.println(str); // str hala ayn� ��nk� sadece o sat�rda de�i�ti ama str = str.toUpperCase yap�p yazd�rsak art�k str buyuk olurdu
		System.out.println(str2);
		

	}

}
