package day09_ternary;

public class C2_Ternary2 {

	public static void main(String[] args) {
		int y = 1;
		int z = 1;
		
		int a = y<10 ? y++ : z++; // y++ çalışır int a = y++
								// önce işlem sonra artır demek 
								// önce işlem dediğimiz kısım int a = y;
								// önce y nin değerini a ya atar sonra y yi 2 yapar
		System.out.println(y + "," + z + "," +a);// z zaten 1 y de üst satırda 2 olmuştu a çünkü önce y yi a aya atadı sonra arttırdı ve bu arttırma a ya etki etmedi
												
		System.out.println(y++); // y 2 idi önce 2 yi yazdırır yani yukardaki y yi a ya atama gibi önce içinde bulundugu işlemi yapar sonra artıtıt artıtrma bu satırı etkilemez
		
		System.out.println(++y); // yukarda y yi 3 yazmıştı burda ++y yani önce artır sonra yazdır y 4 yazdırır
		System.out.println(y); // y 4 dü direk 4 yazarv

	}

}
