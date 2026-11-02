Calculator BMI

Aplikasi kalkulator Body Mass Index (BMI) berbasis Java dengan antarmuka grafis (GUI) menggunakan JavaFX dan Scene Builder.

Deskripsi

Calculator BMI merupakan aplikasi sederhana untuk menghitung indeks massa tubuh berdasarkan berat badan dan tinggi badan pengguna. Hasil perhitungan menampilkan nilai BMI beserta kategori berat badan.

Fitur

- Input berat badan dalam kilogram (kg).
- Input tinggi badan dalam sentimeter (cm).
- Menghitung nilai BMI secara otomatis.
- Menampilkan kategori BMI.
- Validasi input agar nilai yang dimasukkan lebih dari 0.

Teknologi yang Digunakan

- Java
- JavaFX
- Scene Builder
- Apache Maven
- NetBeans IDE

Rumus BMI

BMI dihitung menggunakan rumus:

BMI = Berat Badan (kg) / Tinggi Badan (m)²

Kategori BMI

Nilai BMI| Kategori
Kurang dari 18,5| Berat badan kurang
18,5 – kurang dari 25| Normal
25 – kurang dari 30| Gemuk
30 atau lebih| Obesitas

Cara Menjalankan Aplikasi

1. Clone repository ini ke komputer:
   git clone URL_REPOSITORY
2. Buka proyek menggunakan NetBeans IDE.
3. Pastikan JDK dan Maven sudah terpasang.
4. Jalankan aplikasi melalui NetBeans atau menggunakan perintah:
   mvn javafx:run

Pengembang

Dibuat sebagai proyek pembelajaran pemrograman Java.

## Screenshot Aplikasi

![Tampilan Aplikasi BMI](screenshots/bmi-app.png)
