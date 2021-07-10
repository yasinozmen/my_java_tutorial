package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		// byte veri türünden bir deðiþken oluþturup deðer atayýn
		// oluþturulan variable ý adým adým AUTO WIDENING ÝLE geniþletip yazdýrýn

		byte numByte= 34;
		System.out.println("byte degisken degeri : " + numByte);
		
		// short yapalým
		
		short numShort = numByte; 
		
		System.out.println("short degisken degeri : " + numShort);// short byte dan buyuk oldugu için java þikayet etmiyor auto wid. ile deðeri short variableye atýyor
		
		int numInt = numShort;
		
		System.out.println("int degisken degeri :" + numInt);
		
		float numFloat= numInt; // floatýn sonuna f yok çünkü saðdaki deðiþken
		
		System.out.println(" float degisken degeri :" + numFloat);
		
		double numDouble = numFloat;
		System.out.println("double degisken degeri : " + numDouble);
		
		// auto widening primitivelerde daha dardan daha geniþe geçerken java geçiþi saðlar
		
		// data casting küçük bir dataq ile baþlayýp daha büyük deðerler lazým olablkir bu yüzden geçiþ yaparýz
		// bazende iki farklý deðiþken olur ve birini diðerine atamak gerekir data castinge dikkat ederek yapýlýr
		//büyüðü küçüðün içine koymayýz
		
	}

}
