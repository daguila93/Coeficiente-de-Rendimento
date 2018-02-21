/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

/**
 *
 * @author edil
 */
public class Disciplina {
    
    private int nota;
    private int numeroHoras;
    private int notaVS;

    public int getNotaVS() {
        return notaVS;
    }

    public void setNotaVS(int notaVS) {
        this.notaVS = notaVS;
    }

    public int getNota() {
        return nota;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
}