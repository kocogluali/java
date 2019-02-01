import java.util.Scanner;

public class asal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int girilenSayi = sc.nextInt();
        boolean sonuc = true;
        for (int sayi = 2; girilenSayi > sayi; sayi++) {
            if (girilenSayi % sayi == 0) {
                sonuc = false;
                break;
            }
        }
        if (sonuc == true) {
            System.out.println("sayi asaldir");
        } else {
            System.out.println("sayi asal degildir");
        }
    }
}
