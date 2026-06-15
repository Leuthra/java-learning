package basic.exam;

import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan status karyawan (Tetap/Kontrak): ");
        String status = input.nextLine();

        System.out.print("Masukkan gaji dasar: Rp ");
        double gaji = input.nextDouble();

        double bonus = 0;

        if (status.equalsIgnoreCase("Tetap")) {
            if (gaji >= 5000000) {
                bonus = 1000000;
            } else {
                bonus = 500000;
            }
        } else if (status.equalsIgnoreCase("Kontrak")) {
            bonus = 0;
        } else {
            System.out.println("Status karyawan tidak valid.");
        }

        double totalGaji = gaji + bonus;

        System.out.println("Status Karyawan : " + status);
        System.out.println("Bonus Didapat   : Rp " + bonus);
        System.out.println("Total Gaji      : Rp " + totalGaji);

        input.close();
    }
}
