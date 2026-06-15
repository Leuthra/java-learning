package basic.task;

import java.util.Scanner;

/**
 * Program untuk menampilkan n bilangan prima pertama.
 * Input dibaca dari keyboard menggunakan kelas Scanner.
 */
public class BilanganPrima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah Bilangan Prima pertama = ");
        int jumlah = input.nextInt();

        int hitung = 0;

        for (int angka = 2; hitung < jumlah; angka++) {
            boolean prima = true;
            for (int pembagi = 2; pembagi * pembagi <= angka; pembagi++) {
                if (angka % pembagi == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                if (hitung > 0) {
                    System.out.print(" ");
                }
                System.out.print(angka);
                hitung++;
            }
        }

        System.out.println();

        input.close();
    }
}
