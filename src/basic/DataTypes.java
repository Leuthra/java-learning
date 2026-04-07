package basic;

/**
 * Kelas DataTypes mendemonstrasikan penggunaan tipe data primitif,
 * String (Non-Primitif), Casting, dan Konstanta di Java.
 */
public class DataTypes {
    public static void main(String[] args) {
        // --- 1. Bilangan Bulat (Integer) ---
        byte nilaiByte = 127;           // 8-bit: -128 s/d 127
        short nilaiShort = 32767;       // 16-bit: -32.768 s/d 32.767
        int nilaiInt = 2147483647;      // 32-bit: -2.1 Miliar s/d 2.1 Miliar
        long nilaiLong = 9223372036854775807L; // 64-bit (Gunakan akhiran 'L')

        System.out.println("=== Bilangan Bulat ===");
        System.out.printf("Byte  : %d%n", nilaiByte);
        System.out.printf("Short : %d%n", nilaiShort);
        System.out.printf("Int   : %d%n", nilaiInt);
        System.out.printf("Long  : %d%n%n", nilaiLong);

        // --- 2. Bilangan Desimal (Floating Point) ---
        float nilaiFloat = 3.14f;       // 32-bit (Gunakan akhiran 'f')
        double nilaiDouble = 3.1415926535; // 64-bit (Default untuk desimal)

        System.out.println("=== Bilangan Desimal ===");
        System.out.printf("Float : %.2f%n", nilaiFloat);
        System.out.printf("Double: %.10f%n%n", nilaiDouble);

        // --- 3. Karakter & Boolean ---
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("=== Karakter & Boolean ===");
        System.out.printf("Grade     : %c%n", grade);
        System.out.printf("Java Seru?: %b%n%n", isJavaFun);

        // --- 4. String (Non-Primitif) ---
        String bahasa = "Java";
        String target = "Java";
        String favorit = new String("Java");

        System.out.println("=== Perbandingan String ===");
        // Menggunakan .equals() adalah cara profesional untuk membandingkan isi teks
        System.out.printf("Literal vs Literal (==)   : %b%n", (bahasa == target));
        System.out.printf("Literal vs Objek (==)     : %b%n", (bahasa == favorit));
        System.out.printf("Literal vs Objek (.equals): %b%n%n", bahasa.equals(favorit));

        // --- 5. Konstanta (Immutable) ---
        final String VERSI = "21.0.1";
        // VERSI = "17"; // Akan error jika di-uncomment
        System.out.printf("Konstanta Versi: %s%n%n", VERSI);

        // --- 6. Casting ---
        // Widening Casting (Otomatis): kecil ke besar
        int myInt = 9;
        double myDouble = myInt; 

        // Narrowing Casting (Manual): besar ke kecil
        double pi = 3.14;
        int piInt = (int) pi;

        System.out.println("=== Casting ===");
        System.out.printf("Widening (int %d -> double %.1f)%n", myInt, myDouble);
        System.out.printf("Narrowing (double %.2f -> int %d)%n", pi, piInt);
    }
}
