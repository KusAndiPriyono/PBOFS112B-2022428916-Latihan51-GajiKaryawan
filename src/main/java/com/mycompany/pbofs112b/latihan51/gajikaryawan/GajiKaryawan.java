package com.mycompany.pbofs112b.latihan51.gajikaryawan;

import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 * Deskripsi Program    : Program ini berisi untuk menampilkan Gaji Karyawan
 */
public class GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Manager m = new Manager();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK \t: ");
        m.setNik(scan.nextLine());
        
        System.out.print("Masukan Nama \t: ");
        m.setNama(scan.nextLine());
        
        System.out.print("Masukan Golongan (1/2/3) \t: ");
        m.setGolongan(scan.nextInt());
        
        System.out.print("Masukan Jabatan (Manager/Kabag) \t: ");
        m.setJabatan(scan.next());
        
        System.out.print("Masukan Jumlah Kehadiran \t: ");
        m.setKehadiran(scan.nextInt());
        
        System.out.println();
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK \t: " + m.getNik());
        System.out.println("NAMA \t: " + m.getNama());
        System.out.println("GOLONGAN \t: " + m.getGolongan());
        System.out.println("JABATAN \t: " + m.getJabatan() + "\n");
        System.out.println("TUNJANGAN GOLONGAN \t: " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t: " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t: " + m.tunjanganKehadiran(m.getKehadiran()) + "\n");
        System.out.println("GAJI TOTAL \t: " + m.gajiTotal());
   
    }
    
}
