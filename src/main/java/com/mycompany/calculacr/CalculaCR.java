//CR = (Ch 1 x N  1) + ( Ch 2 x N 2) + .......(Ch n x N n),
//Ch 1 + Ch 2 + .... + Ch n
//Sendo:
//Ch n = carga horária da disciplina n
//N n= Nota final obtida na disciplina n

package com.mycompany.calculacr;

/**
 *
 * @author edil
 */
public class CalculaCR {
       CSVService cSVService = new CSVService();
    
    public int cr(){
        int cr = cSVService.run();
        return cr;
    }
    
}
