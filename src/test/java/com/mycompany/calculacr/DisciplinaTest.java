/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author edil
 */
public class DisciplinaTest {

    private Disciplina disciplina;
    
    @Before
    public void setUp() throws IOException {
        CSVRecord record = getFakeRecords().get(0);
        disciplina = new Disciplina();
        disciplina.setNota(Integer.valueOf(record.get("NOTA")));
        disciplina.setNumeroHoras(Integer.valueOf(record.get("NUMHORASDISC")));
        disciplina.setNotaVS(Integer.valueOf(record.get("NOTAVS")));
    
    }
    
    @After
    public void tearDown() {
        disciplina = null;
    }

    
    private List<CSVRecord> getFakeRecords() throws FileNotFoundException, IOException {
        return CSVFormat.EXCEL
                .withFirstRecordAsHeader()
                .withHeader(CSVService.HEADER)
                .parse(new FileReader("./src/test/test.csv"))
                .getRecords();
    }
    
    
    
}