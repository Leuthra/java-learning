package basic.task;

import java.util.Scanner;

/**
 * Program untuk menghitung jumlah dan rata-rata dari 10 bilangan bulat.
 */
public class JumlahRataRataArray {

    public static void main(String[] args) {
        final int jumlahData = 10;
        int[] angka = new int[jumlahData];
        int total = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka : ");
            angka[i] = input.nextInt();
            total += angka[i];
        }

        double rataRata = (double) total / angka.length;

        System.out.println("Jumlah seluruh bilangan = " + total);

        if (rataRata == (int) rataRata) {
            System.out.println("Nilai rata-ratanya adalah = " + (int) rataRata);
        } else {
            System.out.printf("Nilai rata-ratanya adalah = %.2f%n", rataRata);
        }

        input.close();
    }
}
