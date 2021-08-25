/*
 * Classe utilizada para a modelagem de semestres
 */
package Modelos.Usuarios;

import Modelos.Materias.MateriaemGrade;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pedro Lucas
 */
public class Semestre {

    private int periodo;
    private ArrayList<MateriaemGrade> listaMateriaemGrade = new ArrayList<MateriaemGrade>();

    public ArrayList<MateriaemGrade> getListaMateriaemGrade() {
        return listaMateriaemGrade;
    }

    public void addMateriaemGrade(MateriaemGrade materia) {
        getListaMateriaemGrade().add(materia);
    }

    public Semestre(int periodo) {
        this.periodo = periodo;
    }

    public void setListaMateriaemGrade(ArrayList<MateriaemGrade> listaMateriaemGrade) {
        this.listaMateriaemGrade = listaMateriaemGrade;
    }

    public Semestre() {
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        String i = "";
        for (MateriaemGrade a : listaMateriaemGrade) {
            i = i + a.toString() + "\n";
        }
        return i;
    }

    public int getPeriodo() {
        return periodo;
    }

}
