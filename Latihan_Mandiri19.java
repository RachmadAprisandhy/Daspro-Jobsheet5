import java.util.Scanner;

public class Latihan_Mandiri19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan usia Anda: ");
    int age = scanner.nextInt();

    if (age < 0) 
    {
      System.out.println("Tidak memenuhi: Usia berupa angka positif.");
    } 
    else if (age <= 12) {
      System.out.println("Anda dikategorikan sebagai usia ANAK-ANAK");
    } 
    else if (age <= 19) {
      System.out.println("Anda dikategorikan sebagai   usia REMAJA");
    } 
    else if (age <= 64) {
      System.out.println("Anda dikategorikan sebagai  usia DEWASA");
    } 
    else {
      System.out.println("Anda dikategorikan sebagai usia LANSIA");
    }
  }
}