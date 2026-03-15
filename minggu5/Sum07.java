package minggu5;

public class Sum07 {
  int elemen;
  double keuntungan[];

  Sum07(int elemen){
        this.elemen = elemen;
        keuntungan = new double[elemen];
    }

  double totalBF() {
    double total = 0;
    for (int i = 0; i < elemen; i++) {
      total += keuntungan[i];
    }
    return total;
  }

  double totalDC(int l, int r) {
    if (l == r) {
      return keuntungan[l];
    } else {
      int mid = (l + r) / 2;
      double lsum = totalDC(l, mid);
      double rsum = totalDC(mid + 1, r);
      return lsum + rsum;
    }
  }
}
