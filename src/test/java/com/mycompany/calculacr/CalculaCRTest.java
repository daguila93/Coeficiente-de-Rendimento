/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.IOException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


/**
 *
 * @author edil
 */

public class CalculaCRTest {
    
    CSVService cSVServiceTest;
    CalculaCR cr;       
    
    @Before
    public void setUp() throws IOException {
        cr = new CalculaCR();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcularCoeficienteDeRendimento() throws Exception {
        when(cSVServiceTest.getNomeDoArquivo()).thenReturn("12345678");
        assertThat(cr.calcularCoeficienteDeRendimento(), is(equalTo(8.0)));
    }

}