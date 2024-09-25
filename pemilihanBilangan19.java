import java.util.Scanner;

public class pemilihanBilangan19{

   public static void main(String [] args){  
   int angka;
    Scanner pemilihan = new   Scanner(System.in);
    

    System.out.println("masukkan angka");
    angka= pemilihan.nextInt( );

   if (angka % 2 == 0)
   {
      System.out.println("angka " + angka + " termasuk bilangan genap");
   }
   else
   {
      System.out.println("angka " + angka + " termasuk bilangan ganjil");
   }
   }
}

   
   