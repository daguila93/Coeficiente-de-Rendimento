/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculacr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author edil
 */
public class CSVService {

    Map<Long, Disciplina> map;
    private Logger LOGGER;

    public static final String[] HEADER = {
        "CODIGO", "NUMHORASDISC", "NOTA", "NOTAVS", "FREQUENCIA", "CODSITDISCIPLINA", "IDCARACTERISTICADISCIPLINA", "DESCRICAO", "ANOSEMESTRE"
    };

    private String nomeDoArquivo;
    private Reader leitorArquivo;
    private CSVParser parserArquivo;
    private List<Disciplina> registros;

    public CSVService() throws IOException {
        this("./arquivo.csv");
    }

    public CSVService(String nomeDoArquivo) throws IOException {
        this(nomeDoArquivo, LoggerFactory.getLogger(CSVService.class));
    }

    public CSVService(String nomeDoArquivo, Logger log) throws IOException {
        this.nomeDoArquivo = nomeDoArquivo;
        this.LOGGER = log;
        this.inicializarServico();
    }

    public CSVService inicializarServico() throws FileNotFoundException, IOException {
        inicializarLeitorArquivo().carregarArquivo();
        return this;
    }

    private CSVService inicializarLeitorArquivo() throws FileNotFoundException {
        this.leitorArquivo = new FileReader(nomeDoArquivo);
        return this;
    }

    private CSVService carregarArquivo() throws IOException {
        this.parserArquivo = CSVFormat.EXCEL
                .withFirstRecordAsHeader()
                .withHeader(HEADER)
                .parse(leitorArquivo);
        return this;
    }

    protected List<Disciplina> lerRegistros() throws IOException {
        this.registros = new ArrayList<>();
        for (CSVRecord registro : parserArquivo.getRecords()) {
            Disciplina disciplina = new Disciplina();
            if (registro.get("DESCRICAO") != "Atividade Complementar") {
                disciplina.setNota(Integer.parseInt(registro.get("NOTA")));
                disciplina.setNumeroHoras(Integer.parseInt(registro.get("NUMHORASDISC")));
                registros.add(disciplina);
            }
            
        }
        return this.registros;
    }

//    public void realizarAlteracoesEmAluno(Aluno aluno, String emailEscolhido){
//        System.out.println("entrou aqui");
//        try {
//            Aluno alunoEncontrado = encontrarAlunoNoArquivoCSV(aluno);
//            alteraRegistroAlunoNoArquivoCSV(alunoEncontrado, emailEscolhido);
//            LOGGER.info(registros.get(registros.indexOf(alunoEncontrado)).toString());
////            this.gravarUffMailNoArquivoCSV();
//        } catch (IOException | IllegalStateException ex) {
//            LOGGER.error("Erro ao realizar alterações no aluno {} - {}",
//                    aluno.getMatricula(), ex.getMessage());
//        }       
//    }
    /**
     * Retorna os registros dos alunos que estão no csv.
     *
     * @return
     * @throws IOException
     */
    public List<Disciplina> getRegistros() throws IOException {
        return this.registros != null
                ? this.registros
                : lerRegistros();
    }

    public void setRegistros(List<Disciplina> registros) {
        this.registros = registros;
    }

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public Logger getLOGGER() {
        return LOGGER;
    }
}
