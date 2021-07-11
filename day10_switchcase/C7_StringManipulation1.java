package day10_switchcase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// String non-primitive data turundendir
		// non-primitive data turleri value ile birlikte methodlara sahiptirler
		// methodlarý kullanarak Stringi deðiþtirmeye string manipulation denir
		
		String str = "Hello World";
		
		System.out.println(str.toUpperCase()); // HELLO WORLD yazar ama geçiçi olarak 
		
		System.out.println(str); // Hello World çünkü atama yapmadýk str hala kucuk harf 
 		
		
		String str2 = str.toUpperCase();
		System.out.println(str); // str hala ayný çünkü sadece o satýrda deðiþti ama str = str.toUpperCase yapýp yazdýrsak artýk str buyuk olurdu
		System.out.println(str2);
		

	}

}
