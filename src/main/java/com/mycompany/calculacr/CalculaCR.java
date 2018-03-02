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
import java.text.DecimalFormat;

/**
 *
 * @author edil
 */
public class CalculaCR {

    CSVService cSVService;    
    
    public CalculaCR() throws IOException {
        this(new CSVService("12345678.csv"));
    }

    public CalculaCR(CSVService cSVService) {
        this.cSVService = cSVService;
    }    
     
    public String calcularCoeficienteDeRendimento() throws IOException {
        int somatorioPonderado = 0;
        int somaCargaHoraria = 0;
        for (Disciplina d : cSVService.getRegistros()) {
            somatorioPonderado += d.getNumeroHoras() * calcularNotaFinal(d);
            somaCargaHoraria += d.getNumeroHoras();
        }
        return formatarDecimal(Math.round((float) somatorioPonderado / somaCargaHoraria));
    }
    
    private int calcularNotaFinal(Disciplina d) {
        if (d.getNota() >= 60) {
            return d.getNota();
        }
        return d.getNotaVS() >= 60 
                ? 60
                : (d.getNota() + d.getNotaVS()) / 2;
    }
    
    private String formatarDecimal(int valor){
        return new DecimalFormat("0.0").format(valor/10.0);
    }
}