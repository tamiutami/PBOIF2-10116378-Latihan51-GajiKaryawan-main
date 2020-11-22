/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajikaryawan;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi : program ini berisi program yang menampilkan hasil gaji  karyawan
 */
public class Manager {
    private int kehadiran;    
   private float tunjanganGolongan;
   private float tunjanganJabatan;
   private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
       return kehadiran * 10000;
        
    }
    
    public float tunjanganJabatan(String jabatan) {
       
        if("Manager".equals(jabatan)){
            tunjanganJabatan = 2000000;
        }
        else if("Kabag".equals(jabatan)){
            tunjanganJabatan = 1000000;
        }
        else tunjanganJabatan = 0;  
        
        return tunjanganJabatan;
        
    }
    
    public float tunjanganGolongan(int golongan) {
       
       if( 1 == golongan) {
           tunjanganGolongan = 500000;
       }
       
       else if (2 == golongan) {
           tunjanganGolongan = 1000000;
       }
       else if (3 == golongan) {
           tunjanganGolongan = 1500000;
       } 
       else tunjanganGolongan = 0; 
       
           return tunjanganGolongan;
        
    }
    
   public float gajiTotal() {
   return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran(kehadiran);
        
    }
}
