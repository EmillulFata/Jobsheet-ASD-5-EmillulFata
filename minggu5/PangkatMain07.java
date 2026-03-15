package minggu5;

import java.util.Scanner;

public class PangkatMain07 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int elemen = sc.nextInt();
    Pangkat07[] pngkt = new Pangkat07[elemen];

    for (int i = 0; i < elemen; i++) {
      System.out.print("Masukan nilai basis elemen ke-" + (i + 1) + ": ");
      int basis = sc.nextInt();

      System.out.print("Masukan nilai pangkat elemen ke-" + (i + 1) + ": ");
      int pangkat = sc.nextInt();
      pngkt[i] = new Pangkat07(basis, pangkat);
    }

    System.out.println("HASIL PANGKAT BRUTEFORCE:");

    for (int i = 0; i < elemen; i++) {
      System.out.println(
          pngkt[i].nilai + "^" + pngkt[i].pangkat + ": " +
              pngkt[i].pangkatBF(pngkt[i].nilai, pngkt[i].pangkat));
    }

    System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
    for (int i = 0; i < elemen; i++) {
      System.out.println(
          pngkt[i].nilai + "^" + pngkt[i].pangkat + ": " +
              pngkt[i].pangkatDC(pngkt[i].nilai, pngkt[i].pangkat));
    }
  }
}
