package com.example.projectakhir_risty.Model;

import java.io.Serializable;

public class Masyarakat implements Serializable {
    private int id;
    private String nik, nama;

    public int getId() { // untuk mendapatkan id
        return id;
    }
    public void setId(int id) { // untuk membuat i
        this.id = id;
    }
    public String getNIK() { // untuk mendapatkan NIK
        return nik;
    }
    public void setNIK(String nik) { // untuk membuat NIK this.nik = nik;
    }
    public String getNama() { // untuk mendapatkan Nama
        return nama;
    }
    public void setNama(String nama) { // untuk membuat Nama
        this.nama=nama;
    }
}