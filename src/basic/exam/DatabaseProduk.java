import java.sql.*;
import java.util.Scanner;

public class DatabaseProduk {

    static final String URL = "jdbc:mysql://localhost:3306/db_toko?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection koneksi = null;

        try {
            koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal!");
            System.out.println("Detail error: " + e.getMessage());
            return;
        }

        int pilihan;

        do {
            System.out.println("\n===== MENU DATABASE PRODUK =====");
            System.out.println("1. Buat Tabel Produk");
            System.out.println("2. Hapus Tabel Produk");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");

            while (!sc.hasNextInt()) {
                System.out.println("Input tidak valid! Masukkan angka 1-3.");
                sc.next();
                System.out.print("Pilih Menu : ");
            }
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    buatTabelProduk(koneksi);
                    break;
                case 2:
                    hapusTabelProduk(koneksi, sc);
                    break;
                case 3:
                    System.out.println("Keluar dari aplikasi. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia! Silakan pilih 1-3.");
                    break;
            }

        } while (pilihan != 3);

        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
        sc.close();
    }

    static void buatTabelProduk(Connection koneksi) {
        String sql = "CREATE TABLE IF NOT EXISTS produk (" +
                "id_produk INT PRIMARY KEY AUTO_INCREMENT, " +
                "nama_produk VARCHAR(100) NOT NULL, " +
                "harga DOUBLE NOT NULL, " +
                "stok INT NOT NULL" +
                ")";

        try (Statement stmt = koneksi.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabel 'produk' berhasil dibuat atau sudah tersedia.");
        } catch (SQLException e) {
            System.out.println("Gagal membuat tabel: " + e.getMessage());
        }
    }

    static void hapusTabelProduk(Connection koneksi, Scanner sc) {
        System.out.print("Apakah Anda yakin ingin menghapus tabel produk? (ya/tidak): ");
        String konfirmasi = sc.next().trim().toLowerCase();

        if (konfirmasi.equals("ya")) {
            String sql = "DROP TABLE IF EXISTS produk";
            try (Statement stmt = koneksi.createStatement()) {
                stmt.executeUpdate(sql);
                System.out.println("Tabel 'produk' berhasil dihapus.");
            } catch (SQLException e) {
                System.out.println("Gagal menghapus tabel: " + e.getMessage());
            }
        } else {
            System.out.println("Penghapusan tabel dibatalkan.");
        }
    }
}
