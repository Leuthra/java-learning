package.basic.task;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] data = new String[5][6];
        String[] prompts = {"NPM", "Nama", "Nilai UTS", "Nilai UAS", "Nilai Praktikum"};

        System.out.println("=== Program Input Data Mahasiswa ===");

        // input data mahasiswa
        for (int i = 0; i < 5; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-16s: ", prompts[j]);
                data[i][j] = input.nextLine();
            }
            
            // Hitung nilai akhir (UTS 35%, UAS 45%, Praktikum 20%)
            double akhir = Double.parseDouble(data[i][2]) * 0.35 + 
                           Double.parseDouble(data[i][3]) * 0.45 + 
                           Double.parseDouble(data[i][4]) * 0.2;
            data[i][5] = String.valueOf(akhir);
        }

        // output data mahasiswa
        System.out.println("\nOutput:\n");
        System.out.println("+------+------+------+------+------+-------------+");
        System.out.println("I NPM  I Nama I UTS  I UAS  I PRAK I NILAI AKHIR I");
        System.out.println("+------+------+------+------+------+-------------+");
        
        for (String[] m : data) {
            System.out.printf("I %-4s I %-4s I %-4s I %-4s I %-4s I %-11s I\n", 
                              m[0], m[1], m[2], m[3], m[4], m[5]);
        }
        System.out.println("+------+------+------+------+------+-------------+");
        
        input.close();
    }
}
