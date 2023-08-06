/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

import java.util.Scanner;


    /**
     * @param args the command line arguments
     */
 

public class kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("===================================");

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Penambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();
            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana!");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                    hasil = Penambahan.tambah(angka1, angka2);
                    break;
                case 2:
                    hasil = Pengurangan.kurang(angka1, angka2);
                    break;
                case 3:
                    hasil = Perkalian.kali(angka1, angka2);
                    break;
                case 4:
                    try {
                        hasil = Pembagian.bagi(angka1, angka2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih operasi yang benar.");
                    continue;
            }

            System.out.println("Hasil: " + hasil);
            System.out.println("===================================");
        }

        scanner.close();
    }
}

