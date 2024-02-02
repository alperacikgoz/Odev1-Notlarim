import java.util.Scanner;

public class OgrenciSinifHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        double vizeNotu = scanner.nextDouble();

        System.out.print("Final notunuzu giriniz: ");
        double finalNotu = scanner.nextDouble();

        // Vize notunun %40'ını ve final notunun %60'ını hesapla
        double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);

        // Not kontrolü yap ve sınıf durumunu belirle
        if (ortalama >= 50) {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        } else {
            System.out.println("Üzgünüz, sınıfı geçemediniz.");
        }

        scanner.close();
    }
}
