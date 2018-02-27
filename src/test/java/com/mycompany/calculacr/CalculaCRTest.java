/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;



/**
 *
 * @author edil
 */
public class CalculaCRTest {
    
    CSVService cSVServiceTest;
    CalculaCR cr;
    
    public CalculaCRTest() {
        
        cSVServiceTest = Mockito.mock(CSVService.class);
    }
    
    @Before
    public void setUp() throws IOException {
        cr = new CalculaCR();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalcularCoeficienteDeRendimento() throws Exception {
        
        assertEquals(8.0, cr.calcularCoeficienteDeRendimento());
        //assertThat(8.0 , cr.calcularCoeficienteDeRendimento());
    }
    
}
