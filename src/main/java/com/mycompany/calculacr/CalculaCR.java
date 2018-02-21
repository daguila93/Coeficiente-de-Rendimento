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
    Disciplina disciplina;

    public CalculaCR() throws IOException {
        this.cSVService = new CSVService();
        this.disciplina = new Disciplina();

    }

    public int coeficienteDeRendimento() throws IOException {

        int coeficienteDeRendimento = 0;

        for (Disciplina d : cSVService.getRegistros()) {
            int somaCargaHoraria = 0;
            somaCargaHoraria += d.getNumeroHoras();

            coeficienteDeRendimento = d.getNumeroHoras() * notaFinal() / somaCargaHoraria;

        }
        return coeficienteDeRendimento;
    }

    private int notaFinal() {
        int notaFinal;

        if (disciplina.getNota() >= 60) {
            notaFinal = disciplina.getNota();
        }

        if (disciplina.getNotaVS() >= 60) {
            notaFinal = 60;

        } else {
            notaFinal = (disciplina.getNota() + disciplina.getNotaVS()) / 2;

        }
        return notaFinal;
    }
}
