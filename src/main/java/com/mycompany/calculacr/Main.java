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
//        CalculaCR coeficienteDeRendimento = new CalculaCR();
        CSVService cSVService = new CSVService();
        System.out.println("Registros: " + cSVService.lerRegistros());
        
//        System.out.println("Coeficiente de Rendimentos: " + coeficienteDeRendimento.cr());
    }
}