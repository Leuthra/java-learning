# Dokumentasi Dasar Java

Halaman ini berisi catatan pembelajaran mengenai konsep dasar Java yang telah diimplementasikan dalam repositori ini.

## Hello World

File: `src/basic/Hello.java`

Program pertama yang digunakan untuk memverifikasi instalasi JDK dan struktur proyek.

### Struktur Kode

- package basic: Deklarasi paket yang sesuai dengan struktur folder.
- public class Hello: Nama kelas harus sama dengan nama file.
- public static void main(String[] args): Titik masuk utama program Java.

### Eksekusi

Kompilasi dan jalankan melalui terminal:

```cmd
javac -d bin src/basic/Hello.java
java -cp bin basic.Hello
```

## Aturan Penamaan

- Nama Kelas: Menggunakan PascalCase (Contoh: MyClass).
- Nama Method/Variabel: Menggunakan camelCase (Contoh: myVariable).
- Nama Package: Menggunakan lowercase (Contoh: mypackage).

## Pengaturan Project

Proyek ini menggunakan struktur manual tanpa build tool (seperti Maven/Gradle) untuk memahami proses kompilasi dasar Java. Output kompilasi diarahkan ke folder `bin/` agar file sumber tetap bersih dari file `.class`.
