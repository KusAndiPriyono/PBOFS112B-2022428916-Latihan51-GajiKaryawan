package com.mycompany.pbofs112b.latihan51.gajikaryawan;

/**
 *
 * @author 
 * Nama     : Kus Andi Priyono
 * Kelas    : FS112B
 * NIM      : 2022428916
 * Deskripsi Program    : Program ini berisi untuk menampilkan Gaji Karyawan
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;
    
    public int getKehadiran() {
        return kehadiran;
    }
    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    public float tunjanganJabatan(String jabatan) {
        if(jabatan.equalsIgnoreCase("Manager")) {
            tunjanganJabatan = 2000000;
            return tunjanganJabatan;
        } else if (jabatan.equalsIgnoreCase("Kabag")) {
            tunjanganJabatan = 1000000;
            return tunjanganJabatan;
        }
        return 0;
    }
    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                return tunjanganGolongan;
            case 2:
                tunjanganGolongan = 1000000;
                return tunjanganGolongan;
            case 3:
                tunjanganGolongan = 1500000;
                return tunjanganGolongan;
            default:
                tunjanganGolongan = 0;
                return tunjanganGolongan;
        }
    }
    public float gajiTotal() {
        return this.tunjanganJabatan + this.tunjanganGolongan + this.tunjanganKehadiran;
    }
}
