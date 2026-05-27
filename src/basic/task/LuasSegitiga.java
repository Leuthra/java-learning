/**
 * Program sederhana untuk menghitung luas segitiga.
 * Rumus: 1/2 * alas * tinggi
 */
public class LuasSegitiga {

    public static void main(String[] args) {
        double alas = 10.0;
        double tinggi = 8.0;

        double luas = 0.5 * alas * tinggi;

        System.out.println("=== Hitung Luas Segitiga ===");
        System.out.printf("Alas  : %.2f%n", alas);
        System.out.printf("Tinggi: %.2f%n", tinggi);
        System.out.printf("Luas Segitiga: %.2f%n", luas);
    }
}
