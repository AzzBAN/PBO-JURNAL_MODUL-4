/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

import modul4.entitas.Mahasiswa;
import modul4.entitas.Matakuliah;
import modul4.relasi.AmbilMK;

/**
 *
 * @author Ajar
 */
public class Driver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("NAMA : AZHAR BAIHAQI NUGRAHA");
        System.out.println("NIM  : 1301194353");
        System.out.println("============================");
        Matakuliah pbo = new Matakuliah( "CII3B4", "Pemrograman Berorientasi Objek", 4);
        Matakuliah aplat = new Matakuliah("CII3H4", "Pemrogaman Berorientasi Objek", 4);
        Matakuliah apb = new Matakuliah("CTI3I3", "Aplikasi Perangkat Bergerak", 3);

        Mahasiswa mhs1, mhs2;
        mhs1 = new Mahasiswa(1302091000, "Bertholdt Hoover", 1);
        mhs2 = new Mahasiswa(1303209999, "Reiner Braun", 12);

        AmbilMK[] arr = new AmbilMK[7];
        arr[0] = new AmbilMK(mhs1, pbo, "A", "20/21");
        arr[1] = new AmbilMK(mhs1, aplat, "C", "20/21");
        arr[2] = new AmbilMK(mhs1, apb, "AB", "20/21");
        arr[3] = new AmbilMK(mhs2, pbo, "B", "20/21");
        arr[4] = new AmbilMK(mhs2, aplat, "A", "20/21");
        arr[5] = new AmbilMK(mhs2, apb, "BC", "19/20");
        arr[6] = new AmbilMK(mhs2, aplat, "D", "19/20");

        mhs1.displayInfo(arr, "20/21");
        mhs2.displayInfo(arr, "20/21");
        mhs2.displayInfo(arr, "19/20");
    }
    
}
