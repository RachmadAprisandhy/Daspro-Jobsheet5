import java.util.Scanner;

public class PemilihanHariDenganIf19{

    public static void main ( String [] args){
        Scanner hariangka = new Scanner(System.in);

        int hari ;
        String tipeHari;

        System.out.println("Masukkan Angka untuk menentukan tipe hari ");
        hari = hariangka.nextInt();

        if (hari >= 1 && hari <=5)
        {
            System.out.println("angka " + hari + " hari tersebut termasuk weekday");
        }
        else if (hari == 6 || hari == 7)
        {
            System.out.println("angka " + hari + " hari tersebut termasuk weekend");
        }
        else
        {
            System.out.println("invalid number");
        }
    }
}