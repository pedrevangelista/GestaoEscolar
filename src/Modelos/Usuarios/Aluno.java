/*
 * Classe utilizada para modelagem de Alunos
 */
package Modelos.Usuarios;

import Modelos.Universidade.Curso;
import Modelos.Materias.Turma;
import Modelos.Materias.MateriaemGrade;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pedro Lucas
 */
public class Aluno extends Pessoa implements InterfaceGravar {

    private String matricula;
    private Curso curso;
    private static ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
    private ArrayList<Turma> listaDeMateriasFeitas = new ArrayList<Turma>();
    private Historico historico;

    /**
     * Construtor do objeto Aluno
     * @param nome nome do aluno
     * @param matricula matricula do aluno
     * @param curso curso do aluno
     * @param cpf cpf do aluno
     * @param nascimento nascimento do aluno
     * @param idade idade do aluno
     * @param função função do aluno
     */
    public Aluno(String nome, String matricula, Curso curso, String cpf, String nascimento, int idade, String função) {
        super(nome, cpf, nascimento, idade, função);
        this.matricula = matricula;
        this.curso = curso;
        Historico h = new Historico();
        this.historico = h;

    }

    public Aluno() {
        super(null, null, null, 0, null);
    }
    /**
     * Metodo para gravar os alunos no arquivo txt
     */
    @Override
    public void gravarPessoaTxt()  {
        File h = new File(".\\txt\\historicos\\" + getMatricula() + ".txt");
        try {
            h.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\Pessoas\\alunos.txt"));

            for (Aluno aa: verAlunos()){
                buffWrite.write(aa.toString()+ System.getProperty("line.separator"));
            }
            buffWrite.close();
        } catch (IOException ex) {
            System.out.println("Deu ruim no txt");
        }
    }
    /**
     * Metodo para a gravação do historico do aluno no txt
     * @param a a é o historico em string
     * @throws IOException pode dar erro na entrada de dados, ja que esta mexendo com arquivos
     */
    public void escreverHistorico(String a) throws IOException {
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\historicos\\" + getMatricula() + ".txt"));
            buffWrite.write(a);
            buffWrite.close();
        } catch (IOException ex) {
            System.out.println("Deu ruim no txt");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Matricula: " + getMatricula() + " Curso: " + getCurso().getNome() + " CPF: " + getCpf() + " Idade: " + getIdade();

    }

    public static ArrayList<Aluno> verAlunos() {
        return listaDeAluno;
        
    }
    
    public boolean verificarAluno(Aluno novo){
    for (Aluno a: Aluno.verAlunos()){
            if (novo.getNome()==a.getNome())
                return true;
            }
        return false;
}

    public static Aluno VerificaAluno(String a) {
        for (Aluno aa : Aluno.verAlunos()) {
            if (a.equals(aa.getMatricula())) {
                return aa;
            }
        }
        return null;
    }

    
    public String verHistorico(){
        String i = "";
        for (Semestre sem : getHistorico().getListaDeSemestre())
            i=i+sem.getPeriodo()+"\n"+sem.toString();
        return i;
    }
    public void addSemestreHistorico(Semestre s) {
        historico.addSemestre(s);
    }
    /**
     * Verifica se o aluno possui o pre requisito necessario para fazer alguma materia
     * @param a a é o Id do pre requisito que ele deve ter feito
     * @return retorna 1 se ele ja possui e 0 se nao possui o pre requisto
     */
    public int verificarPreRequisito(String a) {
        int x = 0;
        for (Semestre h : getHistorico().getListaDeSemestre()) {
            for (MateriaemGrade mpc : h.getListaMateriaemGrade()) {
                if (mpc.getId().equals(a) && mpc.getStatus().equals("Aprovado")) {
                    x = 1;
                }
            }
        }
        return x;
    }

    public ArrayList<Turma> getListaDeMateriasFeitas() {
        return listaDeMateriasFeitas;
    }

    public void setListaDeMateriasFeitas(ArrayList<Turma> listaDeMateriasFeitas) {
        this.listaDeMateriasFeitas = listaDeMateriasFeitas;
    }

    /**
     * Metodo utilizado para gravar todos os alunos matriculados em alguma materia
     */
    public void gravarAlunoIAMTxt() {
        try {


            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\AlunosMatriculados\\alunosInscritos.txt"));
            for (Turma iaba: Turma.listaDeTurmasPInscrever()){
                for (Aluno aaa: iaba.listaDeAlunosNaTurma()){
                    buffWrite.write("Matricula: " + aaa.getMatricula() + " ID: " + iaba.getId() + " Semestre: " + iaba.getSemestre() + " Professor: " + iaba.getProfessor().getNome() + System.getProperty("line.separator"));
                }
            }
            buffWrite.close();
        } catch (IOException ex) {
            System.out.println("Deu ruim no txt");
        }
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;

    }


}
