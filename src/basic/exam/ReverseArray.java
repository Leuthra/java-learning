public class ReverseArray {
    public static void main(String[] args) {
        String[] mataKuliah = {
                "Algoritma",
                "Basis Data",
                "Pemrograman Java",
                "Sistem Operasi",
                "Jaringan Komputer",
                "Kecerdasan Buatan"
        };

        System.out.println("Daftar Mata Kuliah SEBELUM dibalik:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }

        int awal = 0;
        int akhir = mataKuliah.length - 1;
        for (int i = 0; i < mataKuliah.length / 2; i++) {
            String temp = mataKuliah[awal];
            mataKuliah[awal] = mataKuliah[akhir];
            mataKuliah[akhir] = temp;
            awal++;
            akhir--;
        }

        System.out.println("\nDaftar Mata Kuliah SETELAH dibalik:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
    }
}
