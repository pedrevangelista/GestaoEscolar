/**
 * Classe utilizada para a leitura de dados
 */
package Modelos;

import Modelos.Usuarios.Semestre;
import Modelos.Universidade.Curso;
import Modelos.Materias.MateriaemGrade;
import Modelos.Materias.Turma;
import Modelos.Materias.Materia;
import Modelos.Usuarios.Professor;
import Modelos.Usuarios.Aluno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Pedro Lucas
 */
public class Arquivos {

/*
 * Metodo utilizado para a leitura de dados dos Alunos ja matriculados no sistema, que estao guardados no arquivo: "txt/Pessoas/alunos.txt"
 */
    public static void lerAlunosArquivo() throws IOException {
        String linha;
        
        String arquivo = "";
        int i, k, h, c, g;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Pessoas\\alunos.txt"));
            while ((linha = buffRead.readLine()) != null) {

                i = linha.indexOf("Nome:");
                k = linha.indexOf("Matricula:");
                h = linha.indexOf("Curso:");
                c = linha.indexOf("CPF:");
                g = linha.indexOf("Idade:");
                Curso curso = null;
                String nome = "", matricula, curso1, cpf;
                int idade;

                nome = linha.substring(i + 6, k - 1);
                matricula = linha.substring(k + 11, h - 1);
                curso1 = linha.substring(h + 7, c - 1);
                cpf = linha.substring(c + 5, g - 1);
                idade = Integer.valueOf(linha.substring(g + 7));
                for (Curso cursin : Curso.getListadeCursos()) {
                    if (curso1.equals(cursin.getNome())) {
                        curso = cursin;
                    }
                }
 
                Aluno a1 = new Aluno(nome, matricula, curso, cpf, String.valueOf((20190000 - idade) / 10000), idade, "Aluno");

                Aluno.verAlunos().add(a1);

            }
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Criando arquivo para guardar os alunos");
            File f = new File(".\\txt\\Pessoas\\alunos.txt");
            f.createNewFile();
        }
    }

/*
 * Metodo utilizado para a leitura de dados dos Professores ja matriculados no sistema, que estao guardados no arquivo: "txt/Pessoas/professores.txt"
 */    
    public static void lerProfessoresArquivo() throws IOException {
        String linha;
        String arquivo = "";
        int i, k, h, c, g;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Pessoas\\professores.txt"));
            while ((linha = buffRead.readLine()) != null) {

                i = linha.indexOf("Nome:");
                k = linha.indexOf("Matricula:");
                c = linha.indexOf("CPF:");
                g = linha.indexOf("Idade:");
                Curso curso = null;
                String nome = "", matricula, curso1, cpf;
                int idade;

                nome = linha.substring(i + 6, k - 1);
                matricula = linha.substring(k + 11, c - 1);
                cpf = linha.substring(c + 5, g - 1);
                idade = Integer.valueOf(linha.substring(g + 7));

                Professor p1 = new Professor(nome, matricula, cpf, String.valueOf((2019 - idade)), idade, "Professor");

                Professor.verProfessores().add(p1);

            }
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Criando arquivo para guardar os professores");
            File f = new File(".\\txt\\Pessoas\\professores.txt");
            f.createNewFile();
        }
    }
    
/*
 * Metodo utilizado para a leitura de dados das materias ja inscritas no sistema, que estao guardados no arquivo: "txt/Materias/materias.txt"
 */   
    public static void lerMateriasArquivo() throws IOException {
        String linha;
        String arquivo = "";
        int i, k, h, c, g;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Materias\\materias.txt"));
            while ((linha = buffRead.readLine()) != null) {

                i = linha.indexOf("Nome:");
                k = linha.indexOf("ID:");
                c = linha.indexOf("Pre requisito:");
                g = linha.indexOf("Curso:");
                Curso curso = null;
                String nome = "", id, curso1, prerequisito;

                nome = linha.substring(i + 6, k - 1);
                id = linha.substring(k + 4, c - 1);
                prerequisito = linha.substring(c + 15);
                Materia m1 = new Materia(nome, id, prerequisito);

                Materia.verMateria().add(m1);

            }
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Criando arquivo para guardar as materias");
            File f = new File(".\\txt\\Materias\\materias.txt");
            f.createNewFile();
        }
    }

/*
 * Metodo utilizado para a leitura de dados das materias ofertadas pelos professores, que estao guardados no arquivo: "txt/Materias/materiasInscritas.txt"
 */   
    public static void lerMateriasIAMArquivo() throws IOException {
        String linha;
        String arquivo = "";
        int i, k, h, c, g, j, l;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Materias\\materiasInscritas.txt"));
            while ((linha = buffRead.readLine()) != null) {
                i = linha.indexOf("Nome:");
                k = linha.indexOf("ID:");
                c = linha.indexOf("Pre requisito:");
                g = linha.indexOf("Curso:");
                j = linha.indexOf("Semestre:");
                l = linha.indexOf("Professor:");
                Curso curso = null;
                String nome = "", id, curso1, prerequisito, prof;
                int sem;
                Professor pp = null;

                nome = linha.substring(i + 6, k - 1);
                id = linha.substring(k + 4, c - 1);
                prerequisito = linha.substring(c + 15, g - 1);
                curso1 = linha.substring(g + 7, j - 1);
                sem = Integer.valueOf(linha.substring(j + 10, l - 1));
                prof = linha.substring(l + 11);
                for (Curso cursin : Curso.getListadeCursos()) {
                    if (curso1.equals(cursin.getNome())) {
                        curso = cursin;
                    }
                }
                for (Professor p : Professor.verProfessores()) {
                    if (p.getNome().equals(prof)) {
                        pp = p;
                    }
                }

                Turma mm = new Turma(sem, pp, nome, id, prerequisito, curso);
                Turma.listaDeTurmasPInscrever().add(mm);

            }
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Criando arquivo para guardar as materias");
            File f = new File(".\\txt\\Materias\\materiasInscritas.txt");
            f.createNewFile();
        }
    }
    
/*
 * Metodo utilizado para a leitura de dados dos historicos dos alunos, que estao guardados na pasta: "txt/Historicos"
 */   
    public static void lerSemestreArquivo() throws IOException {
        for (Aluno aa : Aluno.verAlunos()) {

            String linha;
            String arquivo = "";
            int i, k, h, c, g;
            int sem = 0;
            Semestre sz = null;
            try {
                BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Historicos\\" + aa.getMatricula() + ".txt"));
                //for (int j = 1; j>=10;j++)
                while ((linha = buffRead.readLine()) != null) {
                    int z = 1;
                    if (linha.length() < 2) {
                        sz = new Semestre(Integer.valueOf(linha));
                        sem = Integer.valueOf(linha);

                    } else if (linha.length() > 2) {

                        i = linha.indexOf("ID:");
                        k = linha.indexOf("Nota:");
                        c = linha.indexOf("Faltas:");
                        h = linha.indexOf("Professor:");
                        g = linha.indexOf("Status:");

                        String nome, prof, status;
                        double nota;
                        int faltas;
                        nome = linha.substring(i + 4, k - 1);
                        nota = Double.valueOf(linha.substring(k + 6, c - 1));
                        faltas = Integer.valueOf(linha.substring(c + 8, h - 1));
                        prof = linha.substring(h + 11, g - 1);
                        status = linha.substring(g + 8);

                        for (Turma mm : Turma.listaDeTurmasPInscrever()) {

                            if (mm.getId().equals(nome) && mm.getSemestre() == sem && mm.getProfessor().getNome().equals(prof)) {
                                
                                MateriaemGrade mag = new MateriaemGrade(mm.getSemestre(), mm.getProfessor(), mm.getNome(), mm.getId(), mm.getPre_requisito(), mm.getCurso(), faltas, nota);
                                mag.setStatus(status);
                                Semestre szz = new Semestre(sz.getPeriodo());
                                szz.addMateriaemGrade(mag);

                                for (Semestre f : aa.getHistorico().getListaDeSemestre()) {

                                    if (f.getPeriodo() == szz.getPeriodo()) {
                                        f.addMateriaemGrade(mag);
                                        z = 0;
                                    }

                                }
                                if (z == 1) {
                                    aa.addSemestreHistorico(szz);
                                }
                            }
                        }
                    }
                }
                buffRead.close();
            } catch (IOException ex) {
                System.out.println("Criando arquivo dos Semestres do Aluno");
                File f = new File(".\\txt\\Historicos\\" + aa.getMatricula() + ".txt");
                f.createNewFile();
            }
        }
    }
/*
 * Metodo utilizado para a leitura de dados dos alunos matriculados em materias, que estao guardados no arquivo: "txt/AlunosMatriculados/alunosInscritos.txt"
 */ 
    public static void lerAlunosIAMArquivo() throws IOException {
        String linha;
        String arquivo = "";
        int i, k, h, c, g, j, l;
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\AlunosMatriculados\\alunosInscritos.txt"));
            while ((linha = buffRead.readLine()) != null) {
                i = linha.indexOf("Matricula:");
                k = linha.indexOf("ID:");
                j = linha.indexOf("Semestre:");
                l = linha.indexOf("Professor:");
                String aluno = "", id,  prof;
                int sem;
                Professor pp = null;
                Aluno aa = null;
                
                aluno = linha.substring(i + 11, k - 1);
                id = linha.substring(k + 4, j - 1);
                sem = Integer.valueOf(linha.substring(j + 10, l - 1));
                prof = linha.substring(l + 11);
                aa = Aluno.VerificaAluno(aluno);
                for (Professor ppp: Professor.verProfessores()){
                    if (ppp.getNome().equals(prof))
                        pp=ppp;
                }
                for (Turma iam: Turma.listaDeTurmasPInscrever()){
                    if (iam.getProfessor().getNome().equals(pp.getNome()) && iam.getSemestre()==sem && iam.getId().equals(id)){
                       
                        iam.listaDeAlunosNaTurma().add(aa);
                        aa.getListaDeMateriasFeitas().add(iam);
                    }
                }
                

            }
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Criando arquivo para guardar os Alunos inscritos");
            File f = new File(".\\txt\\AlunosMatriculados\\alunosInscritos.txt");
            f.createNewFile();
        }
    }
}
