/**
 * Classe utilizada para o modelo de Materias
 */
package Modelos.Materias;

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
public class Materia {

    private String nome;
    private String id;
    private String pre_requisito;
    private static ArrayList<Materia> listaDeMateria = new ArrayList<Materia>();

    /**
     * Construtor do objeto 'Materia'
     * @param nome nome da Materia
     * @param id id da Materia
     * @param pre_requisito pre requisito da Materia
     */
    public Materia(String nome, String id, String pre_requisito) {
        this.nome = nome;
        this.id = id;
        this.pre_requisito = pre_requisito;
    }

    /**
     * Construtor sem parametro
     */
    public Materia() {
    }
    /**
     * Metodo estatico que retorna lista de todas as materias
     * @return um arrayList de Materias
     */
    public static ArrayList<Materia> verMateria() {
        return listaDeMateria;
    }

    /**
     * Metodo de verificação de materia pelo id, que retorna a materia que possui tal ID
     * @param a é um ID
     * @return materia
     */   
    public static Materia VerificaMateria(String a) {
        for (Materia materia : Materia.verMateria()) {
            if (a.equals(materia.getId())) {
                return materia;
            }
        }
        return null;
    }
    /**
     * Metodo uasdo para gravar as materias existentes no arquivo txt
     */
    public void gravarMateriaTxt() {
        String linha;
        String arquivo = "";
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(".\\txt\\Materias\\materias.txt"));
            while ((linha = buffRead.readLine()) != null) {
                arquivo = arquivo + linha + System.getProperty("line.separator");
            }

            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\Materias\\materias.txt"));
            for (Materia mm: verMateria()){
                buffWrite.write(mm.toString() + System.getProperty("line.separator"));
            }
            buffWrite.close();
            buffRead.close();
        } catch (IOException ex) {
            System.out.println("Deu ruim no txt");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " ID: " + getId() + " Pre requisito: " + getPre_requisito();

    }
    /**
     * Metodo get
     * @return nome da Materia
     */
    public String getNome() {
        return nome;
    }
    /**
     * Metodo set
     * @param nome nome da materia
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * metodo get
     * @return id da materia
     */
    public String getId() {
        return id;
    }
    /**
     * Metodo set
     * @param id id do curso
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Metodo get
     * @return pre requisito da Materia
     */
    public String getPre_requisito() {
        return pre_requisito;
    }
    /**
     * Metodo set
     * @param pre_requisito pre requisito da Materia
     */
    public void setPre_requisito(String pre_requisito) {
        this.pre_requisito = pre_requisito;
    }


}
