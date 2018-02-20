//CR = (Ch 1 x N  1) + ( Ch 2 x N 2) + .......(Ch n x N n),
//Ch 1 + Ch 2 + .... + Ch n
//Sendo:
//Ch n = carga horária da disciplina n
//N n= Nota final obtida na disciplina n
package com.mycompany.calculacr;

import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;

/**
 *
 * @author edil
 */
public class CalculaCR {

    CSVService cSVService;
    private CSVParser parserArquivo;
    private List<Disciplina> registros;

    public CalculaCR() throws IOException {
        this.cSVService = new CSVService();
    }

    public int coeficienteDeRendimento() throws IOException {
        CSVService cSVService = new CSVService();

        int coRen = 0, somaCargaHoraria = 0;

        for (Disciplina d : cSVService.getRegistros()) {
            somaCargaHoraria += d.getNumeroHoras();
            coRen += (d.getNota() * d.getNumeroHoras());
        }
        int coeficienteDeRendimento = coRen / somaCargaHoraria;

        if (coeficienteDeRendimento < 60 && coeficienteDeRendimento >= 40) {
            for (CSVRecord registro : parserArquivo.getRecords()) {
                if (registro.get("NOTAVS") != null) {
                    Disciplina disciplina = new Disciplina();
                    disciplina.getNotaVS();
                    disciplina.setNumeroHoras(Integer.parseInt(registro.get("NOTAVS")));
                    registros.add(disciplina);
                } else {
                    Disciplina disciplina = new Disciplina();
                    disciplina.setNotaVS(0);
                }
//                return coeficienteDeRendimento;
            }
        }
        return coeficienteDeRendimento;        
    }
}
