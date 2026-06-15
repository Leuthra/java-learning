package basic.exam;

import java.util.Scanner;

public class JumlahBarang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan stok awal: ");
        int stok = input.nextInt();

        // barang masuk sebanyak 5 menggunakan operator unary (++)
        for (int i = 0; i < 5; i++) {
            stok++;
        }
        System.out.println("Setelah barang masuk (5), stok: " + stok);

        // barang keluar sebanyak 3 menggunakan operator unary (--)
        for (int i = 0; i < 3; i++) {
            stok--;
        }

        System.out.println("Stok akhir di gudang: " + stok);

        input.close();
    }
}
