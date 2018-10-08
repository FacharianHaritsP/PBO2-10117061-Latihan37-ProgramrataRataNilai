/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan hasil rata-rata nilai 
 *                    berdasarkan objek orientasi
 * 
 */
public class PBO210117061Latihan37ProgramrataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        rataRata satu = new rataRata();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        satu.banyakMahasiswa = masuk.nextInt();
        satu.tampil();
        
        System.out.println("\nMaka Rata-rata nya Adalah : " + satu.jumlah());
        System.out.println("Developed by -");

    }

}
