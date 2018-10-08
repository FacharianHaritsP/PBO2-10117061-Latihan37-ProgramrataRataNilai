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
public class rataRata {

    public int banyakMahasiswa;
    public double nilai;
    public double jumlah = 0;
    public double hasilRatarata;

    Scanner masuk = new Scanner(System.in);
    
    public void tampil(){
    
    for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = masuk.nextDouble();
            jumlah = jumlah + nilai;
        }
    
    }
    
    double jumlah() {

        hasilRatarata = jumlah / banyakMahasiswa;

        return hasilRatarata;
    }

}
