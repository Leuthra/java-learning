package basic;

/**
 * Javadoc Comment:
 * Kelas ini menjelaskan tiga jenis komentar di Java.
 * Gunakan Javadoc untuk mendokumentasikan class, method, atau field.
 */
public class Comment {

    /**
     * Method main: Entry point program.
     * @param args argumen terminal (tidak digunakan)
     */
    public static void main(String[] args) {
        // --- 1. Single-line Comment ---
        // Penjelasan: Baris ini tidak akan dieksekusi.
        // Digunakan untuk catatan singkat satu baris.
        System.out.println("Belajar Single-line Comment (//)");

        /*
         * --- 2. Multi-line Comment ---
         * Penjelasan: Memberikan informasi lebih detail yang membutuhkan
         * banyak baris teks. Sering digunakan untuk lisensi atau header file.
         */
        System.out.println("Belajar Multi-line Comment (/* ... */)");

        // Praktik terbaik:
        // Gunakan komentar untuk menjelaskan "Mengapa" (Why), 
        // bukan menjelaskan "Apa" (What) yang sudah jelas dari nama variabel.
    }
}
