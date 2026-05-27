import java.util.Scanner;

public class TarifParkir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (Motor/Mobil/Truk): ");
        String jenis = input.nextLine();

        System.out.print("Lama parkir (jam): ");
        int lamaParkir = input.nextInt();

        System.out.print("Apakah Anda Member? (true/false): ");
        boolean isMember = input.nextBoolean();

        // menentukan tarif per jam menggunakan ternary
        double tarifPerJam = jenis.equalsIgnoreCase("Motor")
            ? 2000
            : jenis.equalsIgnoreCase("Mobil")
                ? 5000
                : jenis.equalsIgnoreCase("Truk")
                    ? 8000
                    : 0;

        double biayaAwal = tarifPerJam * lamaParkir;

        // menentukan diskon dengan operator ternary bertingkat
        // Jika lama > 5 jam (15%) + member (10%) = 25% (0.25)
        double diskonPersen = (lamaParkir > 5 && isMember)
            ? 0.25
            : (lamaParkir > 5)
                ? 0.15
                : (isMember)
                    ? 0.10
                    : 0.0;

        double nilaiDiskon = biayaAwal * diskonPersen;
        double totalBiayaAkhir = biayaAwal - nilaiDiskon;

        // menentukan bonus menggunakan ternary
        String bonus = (totalBiayaAkhir > 50000)
            ? "Cuci Mobil Gratis"
            : "Tidak ada bonus";

        System.out.println("Biaya Awal        : Rp " + biayaAwal);
        System.out.println("Diskon Didapat    : Rp " + nilaiDiskon);
        System.out.println("Total Biaya Akhir : Rp " + totalBiayaAkhir);
        System.out.println("Bonus             : " + bonus);

        input.close();
    }
}
