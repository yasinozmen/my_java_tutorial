package day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		int y = 1;
		int z = 1;
		
		int a = y<10 ? y++ : z++; // y++ �al���r int a = y++
								// �nce i�lem sonra art�r demek 
								// �nce i�lem dedi�imiz k�s�m int a = y;
								// �nce y nin de�erini a ya atar sonra y yi 2 yapar
		System.out.println(y + "," + z + "," +a);// z zaten 1 y de �st sat�rda 2 olmu�tu a ��nk� �nce y yi a aya atad� sonra artt�rd� ve bu artt�rma a ya etki etmedi
												
		System.out.println(y++); // y 2 idi �nce 2 yi yazd�r�r yani yukardaki y yi a ya atama gibi �nce i�inde bulundugu i�lemi yapar sonra art�t�t art�trma bu sat�r� etkilemez
		
		System.out.println(++y); // yukarda y yi 3 yazm��t� burda ++y yani �nce art�r sonra yazd�r y 4 yazd�r�r
		System.out.println(y); // y 4 d� direk 4 yazarv

	}

}
