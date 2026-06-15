package basic.task;

/**
 * Program sederhana untuk menghitung luas lingkaran.
 * Rumus: PI * r * r
 */
public class LuasLingkaran {

    public static void main(String[] args) {
        final double PI = 3.14159;
        double r = 7.0;

        double luas = PI * r * r;

        System.out.println("=== Hitung Luas Lingkaran ===");
        System.out.printf("Jari-jari: %.2f%n", r);
        System.out.printf("Luas Lingkaran: %.2f%n", luas);
    }
}
