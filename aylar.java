import java.util.*;

public class aylar {
    public static void main(String[] args) {
        System.out.print("12 aydan birinin rakamini yaz :");
        Scanner ay = new Scanner(System.in);
        int deger = ay.nextInt();
        switch (deger) {
        case 1: {
            System.out.println("Ocak ayindasin...");
            break;
        }
        case 2: {
            System.out.println("Subat ayindasin...");
            break;
        }
        case 3: {
            System.out.println("Mart ayindasin...");
            break;
        }
        case 4: {
            System.out.println("Nisan ayindasin...");
            break;
        }
        case 5: {
            System.out.println("Mayis ayindasin...");
            break;
        }
        case 6: {
            System.out.println("Haziran ayindasin...");
            break;
        }
        case 7: {
            System.out.println("Temmuz ayindasin...");
            break;
        }
        case 8: {
            System.out.println("Agustos ayindasin...");
            break;
        }
        case 9: {
            System.out.println("Eylul ayindasin...");
            break;
        }
        case 10: {
            System.out.println("Ekim ayindasin...");
            break;
        }
        case 11: {
            System.out.println("Kasim ayindasin...");
            break;
        }
        case 12: {
            System.out.println("Aralik ayindasin...");
            break;
        }
        default: {
            System.out.println("Boyle bir ay yok. Kusura bakma");
        }

        }

    }
}
