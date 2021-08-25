/*
 * Classe utilizada para a modelagem de Professores
 */
package Modelos.Usuarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Pedro Lucas
 */
public class Professor extends Pessoa {

    private String matricula;
    private static ArrayList<Professor> listaDeProfessor = new ArrayList<Professor>();

    public Professor(String nome, String matricula, String cpf, String nascimento, int idade, String função) {
        super(nome, cpf, nascimento, idade, função);
        this.matricula = matricula;

    }
    /**
     * Metodo que grava os professores no arquivo txt
     */
    public void gravarPessoaTxt() {
        String linha;
        String arquivo = "";
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Pessoas\\professores.txt"));
            while ((linha = buffRead.readLine()) != null) {
                arquivo = arquivo + linha + System.getProperty("line.separator");
            }
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\Pessoas\\professores.txt"));
            for (Professor prof: verProfessores()){
                buffWrite.write(prof.toString() + System.getProperty("line.separator"));
            }
            buffWrite.close();
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Deu ruim no txt");
        }

    }

    public String getMatricula() {
        return matricula;
    }

    public static ArrayList<Professor> verProfessores() {
        return listaDeProfessor;
    }
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Matricula: " + getMatricula() + " CPF: " + getCpf() + " Idade: " + getIdade();
    }

    public Professor() {
        super(null, null, null, 0, null);
    }

}
