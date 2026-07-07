package basic.kuis;

import java.util.Scanner;

/**
 * Program untuk menginput barang dan menghitung daftar belanjanya.
 */
public class AplikasiToko {

    public static void main(String[] args) {
        int jumlahData = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang ingin dibeli : ");
        jumlahData = input.nextInt();
        input.nextLine();

        String[] barang = new String[jumlahData];
        int[] harga = new int[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Barang ke - " + (i + 1));
            System.out.print("Masukkan nama barang : ");
            barang[i] = input.nextLine();

            System.out.print("Masukkan harga barang : ");
            harga[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("Daftar Belanja\n");
        System.out.println("=======================================");
        System.out.println("No Nama Barang Harga");
        System.out.println("=======================================");

        for (int i = 0; i < barang.length; i++) {
            System.out.printf("%-4s %-4s Rp%-4s\n", i, barang[i], harga[i]);
        }

        System.out.println("=======================================");

        int totalHarga = 0;
        for (int i = 0; i < harga.length; i++) {
            totalHarga += harga[i];
        }

        System.out.println("Jadi Total Harga yang Harus Dibayar : Rp " + totalHarga);

        input.close();
    }
}
