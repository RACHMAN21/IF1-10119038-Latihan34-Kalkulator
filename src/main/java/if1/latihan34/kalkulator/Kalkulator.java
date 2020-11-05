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
 * Deskripsi Program : program ini berisi class kalkulator
 */

public class Kalkulator {
    public double value1, value2;
    // Method untuk menampilkan hasil tambah
    public double tambahBilangan() {
        return value1 + value2;
    }
    // Method untuk menampilkan hasil kurang
    public double kurangBilangan() {
        return value1 - value2;
    }
    // Method untuk menampilkan hasil kali
    public double kaliBilangan() {
        return value1 * value2;
    }
    // Method untuk menampilkan hasil bagi
    public double bagiBilangan() {
        return value1 / value2;
    }
    // Method untuk menghasilkan hasil sisa bagi
    public double sisaBilangan() {
        return value1 % value2;
    }
}