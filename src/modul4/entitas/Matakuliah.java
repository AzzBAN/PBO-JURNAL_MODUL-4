/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4.entitas;

/**
 *
 * @author Ajar
 */
public class Matakuliah {
    private String kode, nama;
    private int sks;

    public Matakuliah(String kode, String nama, int sks){
        setKode(kode);
        setNama(nama);
        setSks(sks);
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
