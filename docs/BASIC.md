# Dokumentasi Dasar Java

Halaman ini berisi catatan pembelajaran mengenai konsep dasar Java yang telah diimplementasikan dalam repositori ini.

## Hello World

File: `src/basic/Hello.java`

Program pertama yang digunakan untuk memverifikasi instalasi JDK dan struktur proyek.

### Struktur Kode

- `package basic`: Deklarasi paket yang sesuai dengan struktur folder.
- `public class Hello`: Nama kelas harus sama dengan nama file.
- `public static void main(String[] args)`: Titik masuk utama program Java.

---

## Komentar (Comments)

File: `src/basic/Comment.java`

Java mendukung tiga jenis komentar untuk dokumentasi dan catatan kode:

1. **Single-line**: Menggunakan `//`.
2. **Multi-line**: Menggunakan `/* ... */`.
3. **Javadoc**: Menggunakan `/** ... */`. Digunakan untuk men-generate dokumentasi HTML (API Documentation).

---

## Tipe Data dan Variabel

File: `src/basic/DataTypes.java`

Materi ini mencakup penggunaan berbagai tipe data primitif, konstanta, String, dan mekanisme casting.

### Tipe Data Primitif

| Kategori | Tipe Data | Ukuran | Range (Rentang Nilai) |
| :--- | :--- | :--- | :--- |
| **Integer** | `byte` | 8-bit | -128 s/d 127 |
| | `short` | 16-bit | -32.768 s/d 32.767 |
| | `int` | 32-bit | -2^31 s/d 2^31-1 |
| | `long` | 64-bit | -2^63 s/d 2^63-1 |
| **Floating Point** | `float` | 32-bit | Presisi 6-7 digit desimal |
| | `double` | 64-bit | Presisi 15-16 digit desimal |
| **Character** | `char` | 16-bit | Karakter Unicode tunggal |
| **Logical** | `boolean` | 1-bit | `true` atau `false` |

### Konstanta (`final`)

Keyword `final` digunakan untuk membuat variabel yang nilainya tidak dapat diubah (immutable).
```java
final String VERSI = "21.0.1";
```

### String & Perbandingan

String adalah tipe data non-primitif (Objek). 
- **PENTING**: Gunakan `.equals()` untuk membandingkan isi (content) String.
- Operator `==` membandingkan referensi memori, yang bisa memberikan hasil `false` meskipun teksnya sama jika salah satunya adalah objek baru (`new String()`).

### Casting

Proses konversi tipe data:
1. **Widening (Implicit)**: Otomatis dari tipe kecil ke besar (e.g., `int` ke `double`).
2. **Narrowing (Explicit)**: Manual menggunakan tanda kurung karena ada potensi kehilangan data (e.g., `double` ke `int`).

```java
double pi = 3.14;
int piInt = (int) pi; // Explicit casting
```

---

## Formatted Output (`printf`)

Penggunaan `System.out.printf()` memungkinkan kontrol lebih tinggi pada format tampilan output.

**Format Umum:** `%[flags][width][.precision]conversion-character`

| Specifier | Tipe Data | Keterangan |
| :--- | :--- | :--- |
| **`%d`** | `int`, `byte`, `short`, `long` | Bilangan bulat (Decimal) |
| **`%f`** | `float`, `double` | Bilangan desimal |
| **`%.2f`** | `float`, `double` | Desimal dengan 2 angka di belakang koma |
| **`%s`** | `String` | Menampilkan teks |
| **`%c`** | `char` | Menampilkan satu karakter |
| **`%b`** | `boolean` | Menampilkan `true` atau `false` |
| **`%n`** | - | Pindah baris (lebih aman dari `\n`) |

Contoh: `System.out.printf("Nilai: %.2f%n", 3.14159);` menghasilkan `Nilai: 3.14`.

---

## Eksekusi & Kompilasi

Kompilasi semua file ke folder `bin/`:
```powershell
# Kompilasi
javac -d bin src/basic/*.java

# Menjalankan program
java -cp bin basic.DataTypes
java -cp bin basic.Comment
```

## Aturan Penamaan

- **Nama Kelas**: PascalCase (Contoh: `DataTypes`).
- **Nama Method/Variabel**: camelCase (Contoh: `nilaiInt`).
- **Nama Package**: lowercase (Contoh: `basic`).
- **Konstanta**: UPPER_SNAKE_CASE (Contoh: `NILAI_MAX`).
