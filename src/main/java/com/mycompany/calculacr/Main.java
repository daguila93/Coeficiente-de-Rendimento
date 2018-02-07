/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.IOException;

/**
 *
 * @author edil
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        CalculaCR cR = new CalculaCR();
        System.out.println("Registros: " + cR.coeficienteDeRendimento());
    }
}