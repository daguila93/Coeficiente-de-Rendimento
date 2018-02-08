/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author edil
 */
public class Main {
    static String caminho;
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a matrícula de um aluno: ");
        int matricula = sc.nextInt();
        
        Main.caminho = "./" + matricula + ".csv";
        CalculaCR cR = new CalculaCR();
        
        System.out.println("Calculo de Coeficiente de Rendimentos do Aluno: " + cR.coeficienteDeRendimento());
    }
}