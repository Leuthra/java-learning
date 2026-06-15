package basic.task;

import java.util.Scanner;

/**
 * Program untuk menentukan kategori usia.
 * Input dibaca dari keyboard menggunakan kelas Scanner.
 */
public class KategoriUsia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Usia kamu = ");
        int usia = input.nextInt();

        if (usia >= 1 && usia <= 16) {
            System.out.println("Kategori Usia Kamu adalah Anak-anak");
        } else if (usia >= 17 && usia <= 25) {
            System.out.println("Kategori Usia Kamu adalah Remaja");
        } else if (usia > 25 && usia <= 55) {
            System.out.println("Kategori Usia Kamu adalah Dewasa");
        } else {
            System.out.println(
                "Kategori Usia Kamu tidak valid (di luar rentang table)"
            );
        }

        input.close();
    }
}
