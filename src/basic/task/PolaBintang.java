/**
 * Program untuk menampilkan pola bintang naik dan turun menggunakan while.
 */
public class PolaBintang {

    public static void main(String[] args) {
        int tinggi = 6;
        int baris = 1;

        while (baris <= tinggi * 2 - 1) {
            int jumlahBintang;

            if (baris <= tinggi) {
                jumlahBintang = baris;
            } else {
                jumlahBintang = tinggi * 2 - baris;
            }

            int kolom = 1;

            while (kolom <= jumlahBintang) {
                System.out.print("* ");
                kolom++;
            }

            System.out.println();
            baris++;
        }
    }
}
