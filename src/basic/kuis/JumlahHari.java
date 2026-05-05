import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumlahHari {

    // throws IO Exception sebagai pengendali ketika input terputus
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        // input
        System.out.print("Input nomor bulan : ");
        int bulan = Integer.parseInt(reader.readLine());

        System.out.print("Input tahun : ");
        int tahun = Integer.parseInt(reader.readLine());

        int jumlahHari = 0;
        boolean inputValid = true;

        switch (bulan) {
            // bulan yang memiliki 31 hari
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                break;
            // bulan yang memiliki 30 hari
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                break;
            // bulan yang perlu di cek dengan tahun kabisat
            case 2:
                // logika kabisat itu habis dibagi 4 dan tidak habis dibagi 100
                if (
                    (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)
                ) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                System.out.println(
                    "Nomor bulan tidak valid! Masukkan angka 1-12."
                );
                inputValid = false;
                break;
        }

        if (inputValid) {
            // output
            System.out.println("Output:");
            System.out.println(
                "Bulan ke-" +
                    bulan +
                    " di tahun " +
                    tahun +
                    " memiliki " +
                    jumlahHari +
                    " hari"
            );
        }
    }
}
