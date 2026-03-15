package minggu5;

public class NilaiMahasiswa07 {

  String nama[];
  int uts[];
  int uas[];
  int jumlah;

  NilaiMahasiswa07(String nama[], int uts[], int uas[], int jumlah) {
    this.nama = nama;
    this.uts = uts;
    this.uas = uas;
    this.jumlah = jumlah;
  }

  // mencari index nilai UTS tertinggi (Divide and Conquer)
  int utsTertinggiDC(int l, int r) {
    if (l == r) {
      return l;
    }

    int mid = (l + r) / 2;

    int lmax = utsTertinggiDC(l, mid);
    int rmax = utsTertinggiDC(mid + 1, r);

    if (uts[lmax] > uts[rmax]) {
      return lmax;
    } else {
      return rmax;
    }
  }

  // mencari index nilai UTS terendah (Divide and Conquer)
  int utsTerendahDC(int l, int r) {
    if (l == r) {
      return l;
    }

    int mid = (l + r) / 2;

    int lmin = utsTerendahDC(l, mid);
    int rmin = utsTerendahDC(mid + 1, r);

    if (uts[lmin] < uts[rmin]) {
      return lmin;
    } else {
      return rmin;
    }
  }

  // rata-rata UAS (Brute Force)
  double rataUASBF() {
    int total = 0;

    for (int i = 0; i < jumlah; i++) {
      total += uas[i];
    }

    return (double) total / jumlah;
  }
}