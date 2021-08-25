/*
 * Jframe utilizada como menu
 */
package gestaoescolar.Geral;

import gestaoescolar.Materias.GradeAluno;
import gestaoescolar.Materias.TelaMateriaProfessor;
import gestaoescolar.Materias.TelaCadMaterias;
import gestaoescolar.Materias.TelaInscricaoTurma;
import gestaoescolar.CadastroUsuarios.TelaCadAlunos;
import gestaoescolar.CadastroUsuarios.TelaCadProfessores;
import gestaoescolar.CadastroUsuarios.Login;
import Modelos.Usuarios.Aluno;
import Modelos.Materias.Turma;
import Modelos.Usuarios.Pessoa;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Pedro Lucas
 */
public class TelaInicio extends javax.swing.JFrame {



    /**
     * Creates new form TelaInicio
     */

    public TelaInicio() {
        initComponents();

        Pessoa pp = Login.aa();
        if ("Aluno".equals(pp.getFunção())) {
            btnGrade.setVisible(false);
            btnMaterias.setVisible(false);
            btnProfs.setVisible(false);
            btnAlunos.setVisible(false);
            btnIAMP.setVisible(false);
            btnApagar.setVisible(false);

        }
        if ("Professor".equals(pp.getFunção())) {
            btnMaterias.setVisible(false);
            btnProfs.setVisible(false);
            btnAlunos.setVisible(false);
            btnIAM.setVisible(false);
            btnApagar.setVisible(false);
            
        }
        if ("Admin".equals(pp.getFunção())) {
            System.out.println("ok");
        }
        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        btnAlunos = new javax.swing.JButton();
        btnProfs = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();
        btnIAM = new javax.swing.JButton();
        btnIAMP = new javax.swing.JButton();
        btnGrade = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlunos.setBackground(new java.awt.Color(255, 204, 204));
        btnAlunos.setText("Cadastro de Alunos");
        btnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunosActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 202, 32));

        btnProfs.setBackground(new java.awt.Color(255, 204, 204));
        btnProfs.setText("Cadastro de Professores");
        btnProfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfsActionPerformed(evt);
            }
        });
        jPanel2.add(btnProfs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 202, 33));

        btnMaterias.setBackground(new java.awt.Color(255, 204, 204));
        btnMaterias.setText("Cadastro de Materias");
        btnMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMateriasActionPerformed(evt);
            }
        });
        jPanel2.add(btnMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 202, 32));

        btnIAM.setBackground(new java.awt.Color(255, 204, 204));
        btnIAM.setText("Inscricao do Aluno em Materias");
        btnIAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIAMActionPerformed(evt);
            }
        });
        jPanel2.add(btnIAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 202, 31));

        btnIAMP.setBackground(new java.awt.Color(255, 204, 204));
        btnIAMP.setText("Inscricao do Professor-Materia");
        btnIAMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIAMPActionPerformed(evt);
            }
        });
        jPanel2.add(btnIAMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 202, 31));

        btnGrade.setBackground(new java.awt.Color(255, 204, 204));
        btnGrade.setText("Grade Aluno");
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });
        jPanel2.add(btnGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 202, 32));

        btnApagar.setBackground(new java.awt.Color(255, 204, 204));
        btnApagar.setText("Remover/Editar Itens");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel2.add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 202, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeActionPerformed
        // TODO add your handling code here:
        GradeAluno tl = new GradeAluno();
        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnGradeActionPerformed

    private void btnIAMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAMPActionPerformed
        // TODO add your handling code here:
        TelaMateriaProfessor tl = new TelaMateriaProfessor();
        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnIAMPActionPerformed

    private void btnIAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAMActionPerformed
        TelaInscricaoTurma tl = new TelaInscricaoTurma();
        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnIAMActionPerformed

    private void btnMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMateriasActionPerformed
        // TODO add your handling code here:
        TelaCadMaterias tl = new TelaCadMaterias();
        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnMateriasActionPerformed

    private void btnProfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfsActionPerformed
        TelaCadProfessores tl = new TelaCadProfessores();
        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnProfsActionPerformed

    private void btnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunosActionPerformed

        TelaCadAlunos tl = null;
        try {
            tl = new TelaCadAlunos();
        } catch (IOException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnAlunosActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        TelaApagarEditar tl;
        tl = new TelaApagarEditar();

        tl.setResizable(false);
        tl.setVisible(true);
    }//GEN-LAST:event_btnApagarActionPerformed

    /**
     * Metodo que ao fechar o programa ele ira escrever todos as materias e alunos matriculado nelas no arquivo txt
     * @param evt evento de fechar o programa
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            File h = new File(".\\txt\\AlunosMatriculados\\atual.txt");
            h.createNewFile();
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(".\\txt\\AlunosMatriculados\\atual.txt"));
            for (Turma iam : Turma.listaDeTurmasPInscrever()) {
                buffWrite.write(iam + System.getProperty("line.separator"));
                for (Aluno aa : iam.listaDeAlunosNaTurma()) {
                    buffWrite.write("\t" + aa + System.getProperty("line.separator"));
                }
            }
            buffWrite.close();
        } catch (IOException ex) {
            Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu nao");
        }

    }//GEN-LAST:event_formWindowClosing
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlunos;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnGrade;
    private javax.swing.JButton btnIAM;
    private javax.swing.JButton btnIAMP;
    private javax.swing.JButton btnMaterias;
    private javax.swing.JButton btnProfs;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}