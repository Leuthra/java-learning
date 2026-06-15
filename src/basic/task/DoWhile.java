package basic.task;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        // System.out.println("Hello World");
        // dasar while
        // int x = 0;

        // do {
        //     System.out.print("Nilai x :" + x + "\n");
        //     x++;
        // } while (x < 10);
        //
        //
        // dasar untuk generate setengah piramid 1 2 3 4 5
        // int i = 1;
        // int j;

        // do {
        //     j = 1;
        //     do {
        //         System.out.print(i + " ");
        //         j++;
        //     } while (j <= i);
        //     System.out.println();
        //     i++;
        // } while (i <= 5);
        //
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/T] = ");

            jawab = scan.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                running = false;
            }

            counter++;
        } while (running);
        System.out.println(
            "Anda sudah melakukan perulangan sebanyak " + counter + " Kali"
        );

        scan.close();
    }
}
