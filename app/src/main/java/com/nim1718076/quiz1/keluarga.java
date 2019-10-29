package com.nim1718076.quiz1;

public class keluarga {
    private String mNama,mStatus;
    private int mFoto;
    public keluarga(int foto,String nama, String status) {
        this.mFoto = foto;
        this.mNama = nama;
        this.mStatus = status;
    }

    public int getFoto(){

        return mFoto;
    }

    public String getNama() {

        return mNama;
    }

    public String getmStatus() {

        return mStatus;
    }
}
