package javacalisma;
import java.util.Scanner;
public class NotOrtalamasi 
{

	public static void main(String[] args) 
	{
	int quiz , vize , sonsinav ;
	double ortalama;
	
	try (Scanner input = new Scanner(System.in)) {
		System.out.println("Quiz notunuzu giriniz: ");
		quiz = input.nextInt();
		System.out.println("Vize notunuzu giriniz: ");
		vize = input.nextInt();	
		System.out.println("Final notunuzu giriniz: ");
		sonsinav = input.nextInt();
	}
	
	ortalama = (quiz * 0.2) + (vize * 0.35) + (sonsinav * 0.45);
	System.out.println("not ortalamaniz: " + ortalama);
	
	String sonuc = (ortalama >= 50 ) ? "Geçtiniz" : "Kaldınız" ;
	System.out.println(sonuc);
	}

}
