
public class Main {

    public static void main(String[] args) {
           int ilk=1 , ikinci=1;
           System.out.print(" "+ilk+ " ");
           System.out.print(" "+ikinci+ " ");
           for(int don=0 ; don<11 ; don++){
               ilk=ilk+ikinci;
               ikinci=ilk+ikinci;
               System.out.print(" "+ilk+ " ");
               System.out.print(" "+ikinci+ " ");
               don = don +1 ;
           }

        }
    }
