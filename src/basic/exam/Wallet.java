import java.util.Scanner;

public class Wallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 500000.0;
        int pilihan;

        do {
            System.out.println("=============================");
            System.out.println("       MENU E-WALLET");
            System.out.println("=============================");
            System.out.println("1. Top Up Saldo");
            System.out.println("2. Pembayaran");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");

            while (!sc.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka menu (1-4).");
                sc.next();
                System.out.print("Pilih menu : ");
            }
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan nominal top up : Rp");
                    double topUp = sc.nextDouble();

                    if (topUp <= 0) {
                        System.out.println("Top up gagal. Nominal top up harus lebih besar dari nol.");
                    } else {
                        saldo = saldo + topUp;
                        System.out.println("Top up berhasil.");
                        System.out.println("Saldo sekarang : Rp" + saldo);
                    }
                    break;
                }
                case 2: {
                    System.out.print("Masukkan nominal pembayaran : Rp");
                    double bayar = sc.nextDouble();

                    if (bayar <= 0) {
                        System.out.println("Pembayaran gagal. Nominal pembayaran harus lebih besar dari nol.");
                    } else if (bayar > saldo) {
                        System.out.println("Pembayaran gagal. Saldo tidak mencukupi.");
                    } else {
                        saldo = saldo - bayar;
                        System.out.println("Pembayaran berhasil.");
                        System.out.println("Saldo sekarang : Rp" + saldo);
                    }
                    break;
                }
                case 3:
                    System.out.println("Saldo Anda saat ini : Rp" + saldo);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan E-Wallet. Sampai jumpa!");
                    break;

                default:
                    System.out.println("Menu tidak tersedia! Silakan pilih 1-4.");
                    break;
            }
            System.out.println();

        } while (pilihan != 4);

        sc.close();
    }
}
