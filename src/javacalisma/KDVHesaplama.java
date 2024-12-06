package javacalisma;
import java.util.Scanner;
public class KDVHesaplama {

	public static void main(String[] args) 
	{
		double tutar, kdvlifiyat;
		double kdv = 0.18 ;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Ürünün tutarını giriniz: ");
			tutar = input.nextDouble();
		}
		kdvlifiyat = tutar + (tutar*kdv);
		System.out.println("ürününüzün kdvli fiyatı: " +kdvlifiyat);

	}

}
