package org.example;

public class Personagem {

    private double nivel;

    private double recurso;

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public double getRecurso() {
        return recurso;
    }

    public void setRecurso(double recurso) {
        this.recurso = recurso;
    }

    public double calcularLvlUp() {return LevelUp.calcularLvlUp(this.nivel+1, this.recurso);}
}