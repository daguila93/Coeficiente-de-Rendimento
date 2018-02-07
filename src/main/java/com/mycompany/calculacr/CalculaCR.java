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

    public CalculaCR() throws IOException {
        this.cSVService = new CSVService();
    }

    public int coeficienteDeRendimento() throws IOException {
        for (int i = 0; i < cSVService.getRegistros().size(); i++) {
            cSVService.getRegistros();
            return 0;
        }
        return 0;
    }

}