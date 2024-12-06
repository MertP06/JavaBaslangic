package javacalisma;
import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int sayi1, sayi2;
        int islemsecimi;
        int sonuc = 0;

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Birinci sayıyı girin: ");
			sayi1 = scanner.nextInt();

			System.out.print("İkinci sayıyı girin: ");
			sayi2 = scanner.nextInt();

			System.out.println("İşlem seçin: ");
			System.out.println("1: Toplama");
			System.out.println("2: Çıkarma");
			System.out.println("3: Çarpma");
			System.out.println("4: Bölme");
			islemsecimi = scanner.nextInt();
		}

        switch (islemsecimi) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;

            case 2:
                sonuc = Math.abs(sayi1 - sayi2);
                break;

            case 3:
                sonuc = sayi1 * sayi2;
                break;

            case 4:
                if (sayi2 == 0 || sayi1 == 0) {
                    System.out.println("Hata: Sıfıra bölme işlemi yapılamaz!");
                    return;
                }
                sonuc = Math.max(sayi1, sayi2) / Math.min(sayi1, sayi2);
                break;

            default:
                System.out.println("Hata: Geçersiz işlem seçimi!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
