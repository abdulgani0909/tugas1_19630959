/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1;

/**
 *
 * @author user
 */
public class Pembagian {
    public static double bagi(double angka1, double angka2) {
        if (angka2 == 0) {
            throw new IllegalArgumentException("Tidak dapat melakukan pembagian dengan angka nol.");
        }
        return angka1 / angka2;
    }
}

    
