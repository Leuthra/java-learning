package basic.task;

import java.util.Scanner;

/**
 * Program sederhana untuk menampilkan nama hari berdasarkan nomor hari.
 */
public class DoSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor hari (1-7): ");
        int nomorHari = input.nextInt();

        String namaHari;

        switch (nomorHari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Nomor hari tidak valid";
                break;
        }

        System.out.println(namaHari);

        input.close();
    }
}
