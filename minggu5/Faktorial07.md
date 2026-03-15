1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai
faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else! 
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan! 
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! 
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF()  dan faktorialDC()!

Jawab:
1.  if (n == 1)
    Merupakan base case atau kondisi dasar.
    Digunakan untuk menghentikan rekursi karena faktorial dari 1 adalah 1.
   else
    Merupakan proses rekursif untuk memecah masalah menjadi masalah yang lebih kecil dengan memanggil fungsi yang sama yaitu faktorialDC(n-1).
    Jadi:
    if → kondisi berhenti
    else → proses perhitungan rekursif
2. Bisa, menggunakan while dan do-while
3. fakto *= i;
    Digunakan pada Brute Force (iteratif).
    Artinya:
    fakto = fakto * i
    Nilai fakto dikalikan secara berulang dalam loop.
    Sedangkan
   int fakto = n * faktorialDC(n-1);
    Digunakan pada Divide and Conquer (rekursif).
    Artinya:
    nilai n dikalikan dengan hasil pemanggilan fungsi faktorial sebelumnya.
4. faktorialBF()
    1. Menggunakan perulangan (loop).
    2. Menghitung faktorial dengan cara mengalikan angka dari 1 sampai n secara
       langsung.
    3. Termasuk algoritma Brute Force.
   faktorialDC()
    1. Menggunakan rekursif.
    2. Memecah masalah faktorial menjadi submasalah yang lebih kecil (n-1)
       sampai mencapai base case.
    3. Termasuk algoritma Divide and Conquer.
    Jadi perbedaannya:
    Brute Force → iteratif (loop)
    Divide and Conquer → rekursif (fungsi memanggil dirinya sendiri)