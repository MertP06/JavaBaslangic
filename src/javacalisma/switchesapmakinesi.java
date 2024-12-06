package javacalisma;

import java.util.Scanner;

public class switchesapmakinesi 
{
	
	public static void main(String[] args) 
	{
		float a;
		float b;
		int islemsecimi;
		float sonuc = 0;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("1.sayi: ");
			a = input.nextFloat();
			
			System.out.println("2.sayi: ");
			b = input.nextFloat();
			
			System.out.println("Hangi islemi yapmak istiyorsunuz: ");
			System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
			islemsecimi = input.nextInt();
		}
		
		switch (islemsecimi) {
		case 1:
			sonuc = a+b ;
			break;
		case 2:
			if(a>b) {
				sonuc = a-b ;
				}else{ 
					sonuc = b-a ;
			}
			break;
		case 3:
			sonuc = a*b;
			break;
		case 4:
			if (b != 0) { 
                sonuc = a / b; 
            } else {
                System.out.println("Hata: Sıfıra bölme yapılamaz.");
                return;
            }
            break;
            
        default:
            System.out.println("Geçersiz işlem seçimi.");
            return;
		}
		
		System.out.println("sonuç: " +sonuc);
	}

}
