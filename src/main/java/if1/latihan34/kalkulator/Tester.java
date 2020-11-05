/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan34.kalkulator;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi kalkulator dengan konsep pendekatan
 *                     berbasis objek
 * 
 */

import java.util.Scanner; // import kelas scanner
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalkulator calc = new Kalkulator();
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukkan angka ke-1 : ");
        calc.value1 = sc.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        calc.value2 = sc.nextDouble();
        
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + calc.tambahBilangan());
        System.out.println("Hasil Perkurangan : " + calc.kurangBilangan());
        System.out.println("Hasil Perkalian   : " + calc.kaliBilangan());
        System.out.println("Hasil Pembagian   : " + calc.bagiBilangan());
        System.out.println("Hasil Sisa Bagi   : " + calc.sisaBilangan());
    }
}