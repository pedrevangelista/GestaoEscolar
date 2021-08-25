/**
 * Classe utilizada para modelar a materia da grade do Aluno
 */
package Modelos.Materias;

import Modelos.Universidade.Curso;
import Modelos.Usuarios.Professor;

/**
 *
 * @author Pedro Lucas
 */
public class MateriaemGrade extends Turma {

    private double nota;
    private int faltas;
    private String status;

/**
 * Construtor do objeto
 * @param semestre semestre da Materia
 * @param professor professor  da Materia
 * @param nome nome  da Materia
 * @param id id da Materia
 * @param pre_requisito pre requisito da Materia
 * @param curso curso da Materia
 * @param faltas faltas que o aluno tem na Materia
 * @param nota nota do aluno na Materia
 */
    public MateriaemGrade(int semestre, Professor professor, String nome, String id, String pre_requisito, Curso curso, int faltas, double nota) {
        super(semestre, professor, nome, id, pre_requisito, curso);
        this.nota = nota;
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " Nota: " + getNota() + " Faltas: " + getFaltas()+ " Professor: "+getNomeProf()+ " Status: "+getStatus();
    }

    public double getNota() {
        return nota;
    }

    public int getFaltas() {
        return faltas;
    }
    public String getNomeProf(){
    return super.getProfessor().getNome();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
