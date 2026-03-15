package minggu5;

public class Pangkat07 {

    int nilai;
    int pangkat;

    Pangkat07(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * pangkatDC(a, n - 1);
        }
    }
}