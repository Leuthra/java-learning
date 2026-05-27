public class DataBarang {

    public static void main(String[] args) {
        // untuk deklarasi variable
        String namaBarang = "Laptop Asus";
        double hargaBarang = 5000000.0;
        int stokBarang = 10;
        boolean statusTersedia = stokBarang > 0;

        // deklarasi konstanta pajak
        final double PAJAK = 0.10;

        // Menghitung harga setelah pajak
        double totalHargaTermasukPajak = hargaBarang + (hargaBarang * PAJAK);

        // Menampilkan data
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Barang   : Rp " + hargaBarang);
        System.out.println("Stok Barang    : " + stokBarang);
        System.out.println("Status Tersedia: " + statusTersedia);
        System.out.println("Harga + Pajak  : Rp " + totalHargaTermasukPajak);
    }
}
