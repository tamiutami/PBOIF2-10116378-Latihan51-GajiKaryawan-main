/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

import java.util.Scanner;

/**
 *
 *@author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : program ini berisi program yang menampilkan hasil gaji  karyawan
 */
public class GajiKaryawan {
protected static String nik;
    protected static String nama;
    protected static String jabatan;
    protected static int golongan;
    private static int kehadiran;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner baca = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        Manager manager = new Manager();

        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        nik = baca.next();
        karyawan.setNik(nik);
        System.out.print("Masukan Nama : ");
        nama = baca.next();
        karyawan.setNama(nama);
        System.out.print("Masukan Golongan (1/2/3) : ");
        golongan = baca.nextInt();
        karyawan.setGolongan(golongan);
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        jabatan = baca.next();
        karyawan.setJabatan(jabatan);
        System.out.print("Masukan Jumlah Kehadiran : ");
        kehadiran = baca.nextInt();
        manager.setKehadiran(kehadiran);

        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      : " + karyawan.getNik());
        System.out.println("NAMA     : " + karyawan.getNama());
        System.out.println("GOLONGAN : " + karyawan.getGolongan());
        System.out.println("JABATAN  : " + karyawan.getJabatan());

        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN  : "
                + manager.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN   : "
                + manager.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN : "
                + manager.tunjanganKehadiran(kehadiran));
        System.out.println("");

        System.out.println("GAJI TOTAL : " + manager.gajiTotal());
    }
    
}
