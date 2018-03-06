/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.IOException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edil
 */

public class CalculaCRTest {
    
    private CSVService CSVService;
    private CalculaCR cr;       
    
    @Before
    public void setUp() throws IOException {        
        CSVService = new CSVService("12345678.csv");
        cr = new CalculaCR(CSVService);
    }
    
    @After
    public void tearDown() {
        CSVService = null;
        cr = null;
    }

    @Test
    public void testCalcularCoeficienteDeRendimento() throws Exception {        
        assertThat(cr.calcularCoeficienteDeRendimento(), is(equalTo("7,9")));
    }

    @Test
    public void testConstrutorVazio() throws IOException{
        assertThat(cr.cSVService, is(Matchers.notNullValue()));
    }

}