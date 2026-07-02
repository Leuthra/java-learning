package basic.task;

/**
 * Program untuk menampilkan pola segitiga rata kanan menggunakan huruf X
 */
public class PolaSegitigaX {

    public static void main(String[] args) {
        int tinggi = 5;

        for (int baris = 1; baris <= tinggi; baris++) {
            for (int spasi = 1; spasi <= tinggi - baris; spasi++) {
                System.out.print(" ");
            }

            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}
