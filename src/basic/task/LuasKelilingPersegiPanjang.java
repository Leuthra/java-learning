package basic.task;

import java.util.Scanner;

/**
 * Program untuk menghitung Luas dan Keliling Persegi Panjang.
 * Input dibaca dari keyboard menggunakan kelas Scanner.
 */
public class LuasKelilingPersegiPanjang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan panjang persegi = ");
        int panjang = input.nextInt();

        System.out.print("Masukan lebar persegi = ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang = " + luas);
        System.out.println("Keliling Persegi Panjang = " + keliling);

        input.close();
    }
}
