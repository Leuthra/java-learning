public class MaxSales {
    public static void main(String[] args) {
        int[][] penjualan = {
                {120, 135, 142, 128, 150}, // Minggu 1
                {155, 148, 160, 145, 152}, // Minggu 2
                {165, 170, 168, 158, 162}, // Minggu 3
                {175, 180, 178, 172, 176}  // Minggu 4
        };

        String[] cabang = {"Cabang A", "Cabang B", "Cabang C", "Cabang D", "Cabang E"};

        System.out.println("Data Penjualan (dalam unit produk):");
        System.out.printf("%-10s", "Minggu");
        for (String c : cabang) {
            System.out.printf("%-12s", c);
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-10s", "Minggu " + (i + 1));
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-12d", penjualan[i][j]);
            }
            System.out.println();
        }

        int terbesar = penjualan[0][0];
        int mingguTerbesar = 0;
        int cabangTerbesar = 0;

        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                if (penjualan[i][j] > terbesar) {
                    terbesar = penjualan[i][j];
                    mingguTerbesar = i;
                    cabangTerbesar = j;
                }
            }
        }

        System.out.println("\nHasil Pencarian:");
        System.out.println("Penjualan terbesar : " + terbesar + " unit");
        System.out.println("Ditemukan pada     : Minggu ke-" + (mingguTerbesar + 1));
        System.out.println("Cabang             : " + cabang[cabangTerbesar]);
    }
}
