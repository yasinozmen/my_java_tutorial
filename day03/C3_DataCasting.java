package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		// byte veri t�r�nden bir de�i�ken olu�turup de�er atay�n
		// olu�turulan variable � ad�m ad�m AUTO WIDENING �LE geni�letip yazd�r�n

		byte numByte= 34;
		System.out.println("byte degisken degeri : " + numByte);
		
		// short yapal�m
		
		short numShort = numByte; 
		
		System.out.println("short degisken degeri : " + numShort);// short byte dan buyuk oldugu i�in java �ikayet etmiyor auto wid. ile de�eri short variableye at�yor
		
		int numInt = numShort;
		
		System.out.println("int degisken degeri :" + numInt);
		
		float numFloat= numInt; // float�n sonuna f yok ��nk� sa�daki de�i�ken
		
		System.out.println(" float degisken degeri :" + numFloat);
		
		double numDouble = numFloat;
		System.out.println("double degisken degeri : " + numDouble);
		
		// auto widening primitivelerde daha dardan daha geni�e ge�erken java ge�i�i sa�lar
		
		// data casting k���k bir dataq ile ba�lay�p daha b�y�k de�erler laz�m olablkir bu y�zden ge�i� yapar�z
		// bazende iki farkl� de�i�ken olur ve birini di�erine atamak gerekir data castinge dikkat ederek yap�l�r
		//b�y��� k�����n i�ine koymay�z
		
	}

}
