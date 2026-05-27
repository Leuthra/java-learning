/**
 * Kelas Operator mendemonstrasikan berbagai jenis operator di Java:
 * Aritmatika, Perbandingan, Logika, Penugasan, dan Increment/Decrement.
 */
public class Operator {

    public static void main(String[] args) {
        // --- 1. Operator Aritmatika ---
        int a = 10;
        int b = 3;

        System.out.println("=== Operator Aritmatika ===");
        System.out.printf("%d + %d = %d%n", a, b, (a + b));
        System.out.printf("%d - %d = %d%n", a, b, (a - b));
        System.out.printf("%d * %d = %d%n", a, b, (a * b));
        System.out.printf("%d / %d = %d (Pembagian bulat)%n", a, b, (a / b));
        System.out.printf(
            "%d %% %d = %d (Sisa bagi/Modulus)%n%n",
            a,
            b,
            (a % b)
        );

        // --- 2. Operator Penugasan (Assignment) ---
        int c = 5;
        System.out.println("=== Operator Penugasan ===");
        System.out.printf("Nilai awal c: %d%n", c);
        c += 3; // Sama dengan c = c + 3
        System.out.printf("c += 3 -> %d%n", c);
        c *= 2; // Sama dengan c = c * 2
        System.out.printf("c *= 2 -> %d%n%n", c);

        // --- 3. Operator Perbandingan ---
        System.out.println("=== Operator Perbandingan ===");
        System.out.printf("%d == %d : %b%n", a, b, (a == b));
        System.out.printf("%d != %d : %b%n", a, b, (a != b));
        System.out.printf("%d > %d  : %b%n", a, b, (a > b));
        System.out.printf("%d <= %d : %b%n%n", a, b, (a <= b));

        // --- 4. Operator Logika ---
        boolean x = true;
        boolean y = false;

        System.out.println("=== Operator Logika ===");
        System.out.printf("true && false : %b (AND)%n", (x && y));
        System.out.printf("true || false : %b (OR)%n", (x || y));
        System.out.printf("!true         : %b (NOT)%n%n", (!x));

        // --- 5. Increment & Decrement ---
        int d = 10;
        System.out.println("=== Increment & Decrement ===");
        System.out.printf("Nilai d awal: %d%n", d);
        System.out.printf("d++ (Post-increment): %d%n", d++); // Cetak dulu baru tambah
        System.out.printf("Setelah d++: %d%n", d);
        System.out.printf("++d (Pre-increment): %d%n", ++d); // Tambah dulu baru cetak
    }
}
