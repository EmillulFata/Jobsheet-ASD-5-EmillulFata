1. Kenapa dibutuhkan variable mid pada method TotalDC()? 
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()? 
   double lsum = totalDC(l, mid);
   double rsum = totalDC(mid + 1, r);
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini? 
   return lsum+rsum;
4. Apakah base case dari totalDC()? 
5. Tarik Kesimpulan tentang cara kerja totalDC() 

Jawab:
1. Variabel mid digunakan untuk membagi array menjadi dua bagian yaitu bagian
   kiri dan bagian kanan. Pembagian ini merupakan langkah Divide dalam algoritma Divide and Conquer.
   Dengan cara ini, masalah penjumlahan dapat dipecah menjadi dua submasalah yang lebih kecil.
2. Statement tersebut digunakan untuk menghitung total keuntungan pada dua
   bagian array yang sudah dibagi sebelumnya.
    lsum untuk menghitung jumlah pada bagian kiri array
    rsum untuk menghitung jumlah pada bagian kanan array
   Kedua bagian tersebut dihitung menggunakan rekursi dengan method yang sama sampai mencapai kondisi dasar.
3. Penjumlahan ini dilakukan untuk menggabungkan hasil dari dua submasalah
   (bagian kiri dan kanan) sehingga diperoleh total keseluruhan array.
   Langkah ini disebut tahap Combine dalam algoritma Divide and Conquer.
4. Base case pada method ini adalah:
      if(l == r){
          return keuntungan[l];
      }
   Artinya ketika indeks kiri sama dengan indeks kanan, maka hanya ada satu elemen dalam array, sehingga nilai tersebut langsung dikembalikan tanpa perlu dibagi lagi.
5. Method totalDC() bekerja dengan menggunakan algoritma Divide and Conquer
   yaitu dengan cara membagi array menjadi dua bagian menggunakan variabel mid, kemudian menghitung total pada masing-masing bagian menggunakan rekursi. Setelah itu hasil dari kedua bagian tersebut digabungkan dengan penjumlahan untuk mendapatkan total keseluruhan nilai array.