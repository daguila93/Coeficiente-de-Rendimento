//NF = Nota se > 60
//NF = (Nota+VS)/2 Se Nota entre 40 e 60
//NF = 60 se VS >= 60
//CR = (Ch 1 x N  1) + ( Ch 2 x N 2) + .......(Ch n x N n),
//Ch 1 + Ch 2 + .... + Ch n
//Sendo:
//Ch n = carga horária da disciplina n
//N n= Nota final obtida na disciplina n
package com.mycompany.calculacr;

import java.io.IOException;

/**
 *
 * @author edil
 */
public class CalculaCR {

    CSVService cSVService;
    private int somaCargaHoraria;
    int coeficienteDeRendimento;
    public CalculaCR() throws IOException {
        this.cSVService = new CSVService();


    }
      
    public int coeficienteDeRendimento() throws IOException {        
        
        for (Disciplina d : cSVService.getRegistros()) {
            
            coeficienteDeRendimento = d.getNumeroHoras() * calculaNotaFinal(d) / somaCargaHoraria(d);

        }
        return coeficienteDeRendimento;
    }
    
    private int somaCargaHoraria(Disciplina d){
          return somaCargaHoraria += d.getNumeroHoras();          
    }
    
    private int calculaNotaFinal(Disciplina d) {

        if (d.getNota() >= 60) {
            return d.getNota();
        }

        return d.getNotaVS() >= 60 
                ? 60 
                : (d.getNota() + d.getNotaVS()) / 2;
    }
}