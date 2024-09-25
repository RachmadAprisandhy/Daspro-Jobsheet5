import java.util.Scanner;

public class kafeJB5_19{

    public static void main ( String [] args) {
        Scanner kafe = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.println("Masukkan Menu : ");
        menu = kafe.nextLine();
        System.out.println("Masukkan Ukuran Cup : ");
        ukuranCup = kafe.nextLine().charAt(0);
        System.out.println("Masukkan Jumlah : ");
        jumlah = kafe.nextInt();
        System.out.println("Masukkan Keanggotaan (True/False): ");
        keanggotaan=kafe.nextBoolean();

        double HargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi" :
                HargaMenu= 12000;
                break;
            case "teh":
                HargaMenu = 7000;
                break;
            case "coklat":
                HargaMenu = 20000;
                break;


        }    

        double totalharga = HargaMenu * jumlah;
        String  ukuranLain = Character.toString(ukuranCup);
        switch (ukuranCup){

            case 'S':
            break;

            case 'M':
            totalharga += 0.25 * totalharga;
            break;

            case 'L':
            totalharga += 0.4 * totalharga;
            break;

            default:
            ukuranLain = ("Ukuran Cup Tidak ada/tidak tersedia");
        }

        double diskon = keanggotaan ? 0.1 : 0 ;
        double nominalbayar = totalharga - (diskon * totalharga);

        System.out.println("item pembelian: " + jumlah+ "" + menu + " dengan ukuran cup " + ukuranLain);
        System.out.println("nominal bayar: " + nominalbayar);

    }
}