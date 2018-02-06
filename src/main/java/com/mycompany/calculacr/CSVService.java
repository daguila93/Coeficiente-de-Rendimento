package com.mycompany.calculacr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVService {
    
    int nota;
    int numeroHoras;

  public int run() {

    String arquivoCSV = "arquivo.csv";
    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ",";
    
    try {

        br = new BufferedReader(new FileReader(arquivoCSV));
        while ((linha = br.readLine()) != null) {

            this.nota = linha.split(csvDivisor).length-7;
            this.numeroHoras = linha.split(csvDivisor).length-8;
            
//            System.out.println("Nota= " + nota + "\n" + "Quantidade de Horas= " + numeroHoras);

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        return nota * numeroHoras;
  }

}
