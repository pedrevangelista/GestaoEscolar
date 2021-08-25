/**
 * Classe utilizada para modelar as turmas de materias
 */
package Modelos.Materias;

import Modelos.Universidade.Curso;
import Modelos.Usuarios.Professor;
import Modelos.Usuarios.Aluno;
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
public class Turma extends Materia {

    private Professor professor;
    private int semestre;
    private Curso curso;
    private ArrayList<Aluno> listaDeAlunoNaTurma = new ArrayList<Aluno>();
    private static ArrayList<Turma> listaDeTurmasPInscrever = new ArrayList<Turma>();
    
    /**
     * Construtor que recebe uma materia que algum professor ira dar em algum semestre escolhido de algum curso
     * @param semestre semestre da Turma
     * @param professor professor da Turma
     * @param nome nome da Turma
     * @param id id da Turma
     * @param pre_requisito pre_requisito da Turma
     * @param curso curso da Turma
     */
    public Turma(int semestre, Professor professor, String nome, String id, String pre_requisito, Curso curso) {

        super(nome, id, pre_requisito);
        this.curso=curso;
        this.professor = professor;
        this.semestre = semestre;

    }
    
    /**
     * Construtor sem parametros
     */
    public Turma() {
        
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " ID: " + getId() + " Pre requisito: " + getPre_requisito() + " Curso: " + getCurso() + " Semestre: " + getSemestre() + " Professor: " + getProfessor().getNome();
    }

    /**
     * Metodo para retorno da lista de Alunos que fazem alguma turma especifica
     * @return listaDeAlunoNaTurma
     */
    public ArrayList<Aluno> listaDeAlunosNaTurma() {
        return listaDeAlunoNaTurma;
    }
    
    /**
     * Metodo static para retorno da lista de turmas ofertadas
     * @return listaDeTurmasPInscrever
     */
    public static ArrayList<Turma> listaDeTurmasPInscrever() {
        return listaDeTurmasPInscrever;
    }

    /**
     * Metodo para retorno do professor
     * @return professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Metodo para 'setar' o professor do objeto
     * @param professor é o professor que sera dado ao objeto
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    /**
     * Metodo equals sobreescrito comparando alguns parametros
     * @param mm Turma
     * @return um inteiro que representara a procedencia ou nao do caso
     */
    public int equals(Turma mm) {
        int x = 0;
        if (mm.getSemestre() == this.getSemestre() && mm.getId() == this.getId() && mm.getProfessor() == this.getProfessor()) {
            x = 1;

        }
        return x;
    }
    
    /**
     * Metodo para a gravação dos alunos matriculados em materias ofertadas por professores
     */
    public void gravarMateriaIAMTxt() {
        String linha;
        String arquivo = "";
        try {

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\Materias\\materiasInscritas.txt"));
                    for (Turma iam: Turma.listaDeTurmasPInscrever()){
                        buffWrite.write(iam.toString() + System.getProperty("line.separator"));
            }
        
            buffWrite.close();
        } catch (IOException ex) {
            System.out.println("Deu ruim no txt");
        }
    }
    
    /**
     * Metodo para retorno do semestre
     * @return semestre
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Metodo para 'setar' o curso do objeto
     * @param curso é o curso que sera dado ao objeto
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * Metodo para retorno do semestre
     * @return semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Metodo para 'setar' o semestre do objeto
     * @param semestre é o semestre que sera dado ao objeto
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
