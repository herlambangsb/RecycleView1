package id.sch.smktelkom_mlg.learn.recycleview2;

import android.graphics.drawable.Drawable;

/**
 * Created by Yess on 30/10/2016.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
