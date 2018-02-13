package com.example.jose.practicaparcelable1;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Jose on 12/02/2018.
 */

public class Usuario implements Parcelable{
    private String nombre;
    private String contra;

    public Usuario(String nombre, String contra){
        this.nombre = nombre;
        this.contra = contra;
    }

    protected Usuario(Parcel in) {
        nombre = in.readString();
        contra = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public String getNombre(){
        return nombre;
    }

    public String getContra(){
        return contra;
    }

    public String toString(){
        return "Usuario: " + nombre + "\nContraseña: " + contra;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(contra);
    }
}
