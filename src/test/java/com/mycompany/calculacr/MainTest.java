/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;

/**
 *
 * @author edil
 */
@RunWith(MockitoJUnitRunner.class)
public class MainTest {
    
    public MainTest() {
    }
    
    @Mock
    private Logger logger;
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() throws Exception {
    }
    
    @Test
    public void testNomeDeArquivoValido() {
        if(Main.caminho == "test."){
            
        }
    }
    
    
    
}
