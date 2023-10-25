package com.example.crecimonstruo;

import java.util.LinkedList;

public class Monster {

    private String nombre;
    private int exp;

    private int nivel;
    private String[] img;

    public Monster(String nombre, String[] img) {
        this.nombre = nombre;
        this.exp = 0;
        this.nivel = 1;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String[] getImg() {
        return img;
    }

    public void setImg(String[] img) {
        this.img = img;
    }

    public void subirNivel(int exp){
        this.exp += exp;

        if(this.exp < 5){
            this.nivel = 1;
        }else if(this.exp <10){
            this.nivel = 2;
        }else if(this.exp <15){
            this.nivel = 3;
        }else {
            this.nivel = 4;
        }
    }
}
