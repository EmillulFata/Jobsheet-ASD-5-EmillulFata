package minggu5;

public class NilaiMahasiswaMain07 {

    public static void main(String[] args) {

        String nama[] = {
                "Ahmad", "Budi", "Cindy", "Dian",
                "Eko", "Fajar", "Gina", "Hadi"
        };

        int uts[] = { 78, 85, 90, 76, 92, 88, 80, 82 };
        int uas[] = { 82, 88, 87, 79, 95, 85, 83, 84 };

        int jumlah = nama.length;

        NilaiMahasiswa07 data = new NilaiMahasiswa07(nama, uts, uas, jumlah);

        int maxIndex = data.utsTertinggiDC(0, jumlah - 1);
        int minIndex = data.utsTerendahDC(0, jumlah - 1);

        System.out.println("Nilai UTS tertinggi : "
                + uts[maxIndex] + " (" + nama[maxIndex] + ")");

        System.out.println("Nilai UTS terendah : "
                + uts[minIndex] + " (" + nama[minIndex] + ")");

        System.out.println("Rata-rata nilai UAS : "
                + data.rataUASBF());
    }
}