/**
 * Classe utilizada para a modelagem dos cursos
 */
package Modelos.Universidade;


import java.util.ArrayList;

/**
 *
 * @author Pedro Lucas
 */
public class Curso {
    
    private String nome;
    private String id;
    private static ArrayList<Curso> listadeCursos = new ArrayList<Curso>();

    /**
     *
     * @param nome nome do curso
     * @param id id do curso
     */
    public Curso(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static ArrayList<Curso> getListadeCursos() {
        return listadeCursos;
    }
}
