# Java Learning

Repositori ini berisi kumpulan materi, latihan, dan proyek kecil untuk mempelajari bahasa pemrograman Java dari dasar hingga fitur modern.

## Daftar Isi

1. Basic (Dasar-dasar Java)
2. Object Oriented Programming (OOP)
3. Collections (Struktur Data)
4. Modern Features (Fitur Java Terbaru)

## Persyaratan Sistem

- Java Development Kit (JDK) 17 atau versi yang lebih baru
- IDE (IntelliJ IDEA, VS Code, atau Eclipse)
- Text Editor (Notepad++, Sublime Text)

## Struktur Folder

- `src/basic`: Dasar-dasar sintaksis Java (`package basic`)
- `src/basic/task`: Latihan dasar (`package basic.task`)
- `src/basic/kuis`: Kuis dasar (`package basic.kuis`)
- `src/basic/exam`: Latihan ujian dasar (`package basic.exam`)
- `src/oop`: Konsep Pemrograman Berorientasi Objek
- `src/collections`: Implementasi List, Set, Map, dll
- `src/modern-features`: Fitur modern seperti Record, Pattern Matching, dll

## Cara Menjalankan Program

Untuk menjalankan file Java melalui terminal di Windows:

1. Masuk ke direktori root proyek:
   ```powershell
   cd java-learning
   ```

2. Kompilasi semua program ke folder `bin`:
   ```powershell
   javac -d bin (Get-ChildItem -Recurse -File -Include *.java | ForEach-Object { $_.FullName })
   ```

3. Jalankan program menggunakan nama package lengkap:
   ```powershell
   java -cp bin basic.Hello
   java -cp bin basic.task.PolaBintang
   java -cp bin basic.kuis.JumlahHari
   ```

## Lisensi

Proyek ini dilisensikan di bawah MIT License. Lihat file LICENSE untuk detail lebih lanjut.
