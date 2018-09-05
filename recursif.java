//faktoriyel hesaplama
public class Main {
    public  static  int fanktoriyel(int deger){
        int toplam = deger ;
        if (deger> 0) {
            return toplam = toplam * fanktoriyel(toplam -1);
        }
        return 1;
    }
    public static void main(String[] args) {

        System.out.println("5 faktoriyel ="+fanktoriyel(5));
    }
}
