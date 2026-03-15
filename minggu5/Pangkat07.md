1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan
   pangkatDC()! 
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan
   dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah
   ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter? 
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!

Jawab:
1. Method pangkatBF() menggunakan algoritma Brute Force dengan cara melakukan
   perulangan untuk mengalikan nilai basis sebanyak jumlah pangkat yang diberikan. Proses perhitungannya dilakukan secara iteratif menggunakan loop sampai pangkat terpenuhi.
   Sedangkan method pangkatDC() menggunakan algoritma Divide and Conquer dengan cara rekursif, yaitu fungsi memanggil dirinya sendiri dengan nilai pangkat yang lebih kecil hingga mencapai kondisi dasar.
2. Ya, tahap combine sudah ada dalam kode, yaitu pada bagian:
   return a * pangkatDC(a, n-1);
   Pada bagian ini, hasil dari pemanggilan fungsi rekursif pangkatDC(a, n-1) dikombinasikan dengan nilai a melalui operasi perkalian untuk menghasilkan hasil pangkat yang benar.
3. parameter tidak selalu diperlukan, karena pada class Pangkat sudah terdapat
   atribut nilai dan pangkat. Oleh karena itu method tersebut tetap bisa dibuat tanpa parameter dengan langsung menggunakan atribut yang ada pada class.
4. Method pangkatBF() menghitung nilai pangkat dengan cara mengalikan nilai
   basis secara berulang menggunakan perulangan sampai mencapai jumlah pangkat yang diinginkan. Sedangkan method pangkatDC() menghitung nilai pangkat dengan cara memecah masalah menjadi pangkat yang lebih kecil menggunakan rekursi sampai mencapai kondisi dasar, kemudian hasilnya digabungkan kembali melalui operasi perkalian.
Sehingga dapat disimpulkan bahwa:
A. Brute Force bekerja secara iteratif
B. Divide and Conquer bekerja secara rekursif dengan memecah masalah menjadi 
   submasalah yang lebih kecil