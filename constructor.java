class insanlar{
    int yasi;
    int boyu;
    public insanlar(){
        System.out.println("bu class calistirildi");
    }
    public insanlar(int yas , int boy){
        this(); //default olanı çağırıyor yani public insanlar ' ı isimler aynı olmak zorunda
        this.yasi=yas+1;
        this.boyu=boy+1;
    }
}
public class Main {
   public static void main(String[] args) {
       insanlar veli = new insanlar();
       insanlar ali = new insanlar(10,10);
       veli.boyu=180;
       veli.yasi=170;
       System.out.println(veli.boyu+" " + veli.yasi);
       System.out.println(ali.boyu+" "+ ali.yasi);
    }
}
