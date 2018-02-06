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
public class Main {
    
    public static void main(String[] args) {
        CalculaCR coeficienteDeRendimento = new CalculaCR();
        System.out.println("Coeficiente de Rendimentos: ");
        System.out.println(coeficienteDeRendimento.cr());
    }
}
