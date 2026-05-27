import java.util.Scanner;

public class DiskonMember {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Daftar Kode Member:");
        System.out.println("1. Silver");
        System.out.println("2. Gold");
        System.out.println("3. Platinum");

        System.out.print("Masukkan Kode Member (1/2/3): ");
        int kodeMember = input.nextInt();

        System.out.print("Masukkan Total Belanja: Rp ");
        double totalBelanja = input.nextDouble();

        double diskonPersen = 0.0;

        // untuk menentukan diskon
        switch (kodeMember) {
            case 1:
                diskonPersen = 0.05;
                break;
            case 2:
                diskonPersen = 0.10;
                break;
            case 3:
                diskonPersen = 0.15;
                break;
            default:
                System.out.println("tidak ada diskon member.");
                diskonPersen = 0.0;
                break;
        }

        double nilaiDiskon = totalBelanja * diskonPersen;
        double totalBayar = totalBelanja - nilaiDiskon;

        String bonus = (totalBelanja > 100000)
            ? "Kode Voucher"
            : "Tidak ada bonus";

        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Diskon        : Rp " + nilaiDiskon);
        System.out.println("Total Bayar   : Rp " + totalBayar);
        System.out.println("Bonus Anda    : " + bonus);

        input.close();
    }
}
