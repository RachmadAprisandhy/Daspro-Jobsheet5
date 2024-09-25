import java.util.Scanner;

public class SIAKAD_19{
    public static void main ( String [] args){
        Scanner akad = new Scanner(System.in);
        String nama, nim, kualifikasi;
        char kelas, nilaiHuruf;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        
        System.out.print("Masukkan nama: ");
        nama = akad.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = akad.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = akad.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = akad.nextByte();

        System.out.print("Masukkan nilai kuis: ");

        nilaiKuis = akad.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = akad.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = akad.nextDouble();
       
        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
       
        System.out.println(" Mahasiswa Bernama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir >80 && nilaiAkhir <=100) {

            System.out.println("Nilai akhir anda : A");
            System.out.println("Kualifikasi : Sangat Baik");
        }
        else if (nilaiAkhir >73 && nilaiAkhir <=80) {

            System.out.println("Nilai akhir anda : B+");
            System.out.println("Kualifikasi : Lebih dari Baik");
        }
        else if (nilaiAkhir >65 && nilaiAkhir <=73) {

            System.out.println("Nilai akhir anda : B");
            System.out.println("Kualifikasi : Baik");
        }
        else if (nilaiAkhir >60 && nilaiAkhir <=65) {

            System.out.println("Nilai akhir anda : C+");
            System.out.println("Kualifikasi : Lebih dari Cukup");
        }
        else if (nilaiAkhir >50 && nilaiAkhir <=60) {

            System.out.println("Nilai akhir anda : C");
            System.out.println("Kualifikasi : Cukup");
        }
        else if (nilaiAkhir >39 && nilaiAkhir <=50) {

            System.out.println("Nilai akhir anda : D");
            System.out.println("Kualifikasi : Kurang");
        }
        else if (nilaiAkhir <=39) {

            System.out.println("Nilai akhir anda : E");
            System.out.println("Kualifikasi : Gagal/mengulang");
        }
    }
}