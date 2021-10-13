/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4.relasi;

import modul4.entitas.Mahasiswa;
import modul4.entitas.Matakuliah;

/**
 *
 * @author Ajar
 */
public class AmbilMK {
    private Matakuliah matakuliah;
    private Mahasiswa mahasiswa;
    private String nilai, tahun_ajaran;

    public AmbilMK(Mahasiswa mahasiswa, Matakuliah matakuliah, String nilai, String tahun_ajaran){
        setMahasiswa(mahasiswa);
        setMatakuliah(matakuliah);
        setNilai(nilai);
        setTahun_ajaran(tahun_ajaran);
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getTahun_ajaran() {
        return tahun_ajaran;
    }

    public void setTahun_ajaran(String tahun_ajaran) {
        this.tahun_ajaran = tahun_ajaran;
    }
}
