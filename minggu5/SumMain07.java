package minggu5;

import java.util.Scanner;

public class SumMain07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah elemen: ");
    int elm = sc.nextInt();

    Sum07 sm = new Sum07(elm);

    for (int i = 0; i < elm; i++) {
      System.out.print("Masukkan keuntungan ke-" + (i + 1) + ": ");
      sm.keuntungan[i] = sc.nextDouble();
    }

    System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
    System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(0, elm - 1));
  }
}
