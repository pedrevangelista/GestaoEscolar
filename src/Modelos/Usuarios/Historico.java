/*
 * Classe utilizada para a modelagem do historico dos alunos
 */
package Modelos.Usuarios;

import java.util.ArrayList;

/**
 *
 * @author Pedro Lucas
 */
public class Historico {

    private ArrayList<Semestre> listaDeSemestre = new ArrayList<Semestre>();

    public ArrayList<Semestre> getListaDeSemestre() {
        return listaDeSemestre;
    }

    public void addSemestre(Semestre semestre) {
        this.listaDeSemestre.add(semestre);
    }

}
