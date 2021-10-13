/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4.entitas;

import modul4.relasi.AmbilMK;

import java.text.DecimalFormat;

/**
 *
 * @author Ajar
 */
public class Mahasiswa {
    private int nim;
    private String nama, kelas, prodi;

    public Mahasiswa(int nim, String nama, int nokelas){
        setNama(nama);
        setNim(nim);
        String strNim = String.valueOf(getNim());
        String valid = strNim.substring(4, 6);
        int intValid;
        intValid = Integer.parseInt(valid);
        int i;
        int ang = 24;
        for (i=0;i<intValid;i++) {
            ang = ang + 1;
        }
        String strAng = String.valueOf(ang);

        // 1301194353
        valid = strNim.substring(0, 4);

        if (valid.equals("1301")){
            setProdi("IF");
            setKelas(getProdi()+"-"+strAng+"-"+String.format("%02d", nokelas));
        } else if (valid.equals("1302")) {
            setProdi("SE");
            setKelas(getProdi()+"-"+strAng+"-"+String.format("%02d", nokelas));
        } else {
            setProdi("IT");
            setKelas(getProdi()+"-"+strAng+"-"+String.format("%02d", nokelas));
        }

    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public double hitungIPK(AmbilMK[] ambilMk, String thnAjaran){
        int i;
        double jum = 0;
        int totalSks = 0;
        for (i=0;i<7;i++){
            if ((ambilMk[i].getMahasiswa().getNama().equals(this.nama)) && (ambilMk[i].getTahun_ajaran().equals(thnAjaran))) {
                if (ambilMk[i].getNilai().equals("A")){
                    jum = jum + (4 * ambilMk[i].getMatakuliah().getSks());
                } else if (ambilMk[i].getNilai().equals("AB")) {
                    jum = jum + (3.5 * ambilMk[i].getMatakuliah().getSks());
                } else if (ambilMk[i].getNilai().equals("B")) {
                    jum = jum + (3 * ambilMk[i].getMatakuliah().getSks());
                } else if (ambilMk[i].getNilai().equals("BC")) {
                    jum = jum + (2.5 * ambilMk[i].getMatakuliah().getSks());
                } else if (ambilMk[i].getNilai().equals("C")) {
                    jum = jum + (2 * ambilMk[i].getMatakuliah().getSks());
                } else if (ambilMk[i].getNilai().equals("D")) {
                    jum = jum + (1.5 * ambilMk[i].getMatakuliah().getSks());
                } else if (ambilMk[i].getNilai().equals("E")) {
                    jum = jum + 0;
                } else {
                    System.out.println("tidak sesuai indeks");
                }
                totalSks = totalSks + ambilMk[i].getMatakuliah().getSks();
            }
        }
        return jum / totalSks;
    }

    public void displayInfo(AmbilMK[] ambilMk, String thnAjaran){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("IPK "+getNama()+" ("+getKelas()+") TA "+thnAjaran+" "+df.format(hitungIPK(ambilMk, thnAjaran)));
    }
}
