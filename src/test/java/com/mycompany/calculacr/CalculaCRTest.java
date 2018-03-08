/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.IOException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
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
    private CSVService CSVService2;
    private CSVService CSVService3;
    private CSVService CSVService4;
    private CSVService CSVService5;
    
    private CalculaCR cr;
    private CalculaCR crAC;
    private CalculaCR crACVSNula;
    private CalculaCR crACVS0;
    private CalculaCR crACVSMaiorQue0;
        
    @Before
    public void setUp() throws IOException {        
        CSVService = new CSVService("12345678.csv"); // Normal
        CSVService2 = new CSVService("87654321.csv"); // Aval. Cont. Sem VS
        CSVService3 = new CSVService("00000001.csv"); // Aval. Cont. Com VS Null
        CSVService4 = new CSVService("00000002.csv"); // Aval. Cont Com VS 0
        CSVService5 = new CSVService("00000003.csv"); // Aval. Cont Com VS > 0
        
        cr = new CalculaCR(CSVService);
        crAC = new CalculaCR(CSVService2);
        crACVSNula = new CalculaCR(CSVService3);
        crACVS0 = new CalculaCR(CSVService4);
        crACVSMaiorQue0 = new CalculaCR(CSVService5);
        
    }
    
    @After
    public void tearDown() {
        CSVService = null;
        crAC = null;
        cr = null;
    }

    @Test
    public void testCalcularCoeficienteDeRendimento() throws Exception {        
        assertThat(cr.calcularCoeficienteDeRendimento(), is(equalTo("8,0")));
    }
    
    @Test
    public void testCalcularCoeficienteRendimentoComAtividadeContinuada() throws IOException {
        assertThat(crAC.calcularCoeficienteDeRendimento(), is(equalTo("7,9")));
    }

    @Test
    public void testCalcularCoeficienteRendimentoComAtividadeContinuadaVSNull() throws IOException {
        assertThat(crACVSNula.calcularCoeficienteDeRendimento(), is(equalTo("5,8")));
    }

    @Test
    public void testCalcularCoeficienteRendimentoComAtividadeContinuadaVS0() throws IOException {
        assertThat(crACVS0.calcularCoeficienteDeRendimento(), is(equalTo("2,9")));
    }

    @Test
    public void testCalcularCoeficienteRendimentoComAtividadeContinuadaVSMaiorQue0() throws IOException {
        assertThat(crACVSMaiorQue0.calcularCoeficienteDeRendimento(), is(equalTo("6,0")));
    }

    @Test
    public void testConstrutorVazio() throws IOException {
        assertThat(cr.getcSVService(), is(notNullValue()));
    }
}
