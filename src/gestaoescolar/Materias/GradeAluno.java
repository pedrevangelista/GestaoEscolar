/*
 * Jframe utilizada para o "set" de Grade de Aluno
 */
package gestaoescolar.Materias;

import gestaoescolar.CadastroUsuarios.Login;
import Modelos.Usuarios.Aluno;
import Modelos.Materias.Turma;
import Modelos.Materias.MateriaemGrade;
import Modelos.Usuarios.Pessoa;
import Modelos.Usuarios.Professor;
import Modelos.Usuarios.Semestre;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;import javax.swing.JOptionPane;
/**
 *
 * @author Pedro Lucas
 */
import javax.swing.table.DefaultTableModel;
public class GradeAluno extends javax.swing.JFrame {
    private ArrayList<MateriaemGrade> listaMateriaemGrade = new ArrayList<MateriaemGrade>();
    Semestre ss = null;
    
    String matriculaAdmin;
    Pessoa login = Login.aa();
            
    // Creates new form GradeAluno
    public GradeAluno() {
        initComponents();
        labelMat.setVisible(false);
        labelFaltas.setVisible(false);
        labelNota.setVisible(false);
        btnHist.setVisible(false);
        btnGrade.setVisible(false);
        edtFaltas.setVisible(false);
        edtNota.setVisible(false);
        edtMateria.setVisible(false);
        TableMat.setFillsViewportHeight(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if ("Admin".equals(login.getFunção())) {
            matriculaAdmin = JOptionPane.showInputDialog(this,"Digite a matricula do Professor que voce quer usar");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        edtMatricula = new javax.swing.JTextField();
        btnTabela = new javax.swing.JButton();
        btnGrade = new javax.swing.JButton();
        edtNota = new javax.swing.JTextField();
        edtMateria = new javax.swing.JTextField();
        labelMat = new javax.swing.JLabel();
        labelNota = new javax.swing.JLabel();
        btnHist = new javax.swing.JButton();
        labelFaltas = new javax.swing.JLabel();
        edtFaltas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edtSemestre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        TableMat.setBackground(new java.awt.Color(255, 204, 204));
        TableMat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materia", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableMat);

        jLabel1.setText("Matricula do Aluno");

        btnTabela.setText("Atualizar Tabela");
        btnTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabelaActionPerformed(evt);
            }
        });

        btnGrade.setText("Cadastrar na Grade");
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });

        labelMat.setText("Materia");

        labelNota.setText("Nota");

        btnHist.setText("Salvar Historico");
        btnHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistActionPerformed(evt);
            }
        });

        labelFaltas.setText("Faltas");

        jLabel5.setText("Semestre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(edtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtMatricula)
                            .addComponent(btnTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFaltas)
                            .addComponent(labelNota)
                            .addComponent(labelMat))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHist, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(edtNota)
                                .addComponent(edtFaltas)
                                .addComponent(btnGrade)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(edtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(edtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTabela))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMat))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNota))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFaltas))
                        .addGap(27, 27, 27)
                        .addComponent(btnGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHist)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Esse metodo é para atualizar a tabela das materias que o Aluno selecionado faz com o professor que fez o login
 * @param evt é o evento de clique no mouse no botao
 */
    private void btnTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabelaActionPerformed
        // TODO add your handling code here:
                Professor pp = null;
        if ("Professor".equals(login.getFunção())) {
            pp = (Professor) login;
            
        }
        if ("Admin".equals(login.getFunção())) {
            for (Professor prof : Professor.verProfessores()) {
                if (matriculaAdmin.equals(prof.getMatricula())) {
                    pp = prof;
                }
            }
        }
        int z = 0;
        Aluno aa = new Aluno();
        DefaultTableModel model = (DefaultTableModel)TableMat.getModel();
        int r = TableMat.getRowCount();
        
        for (int j = r; j>0; j--){
            model.removeRow(j-1);
        }
        for (Aluno aluno : Aluno.verAlunos()) {
            if (aluno.getMatricula().equals(edtMatricula.getText())) {
                aa = aluno;

            }
        }
        for (int i = 0; i < aa.getListaDeMateriasFeitas().size(); i++) {

            if (aa.getListaDeMateriasFeitas().get(i).getSemestre() == Integer.valueOf(edtSemestre.getText())) {
                if (aa.getListaDeMateriasFeitas().get(i).getProfessor().getMatricula().equals(pp.getMatricula())) {

                    String nome = aa.getListaDeMateriasFeitas().get(i).getNome();
                    String id = aa.getListaDeMateriasFeitas().get(i).getId();
                    model.addRow(new Object[]{nome,id});
                    

                }
            }
        }
        labelMat.setVisible(true);
        labelFaltas.setVisible(true);
        labelNota.setVisible(true);
        btnHist.setVisible(true);
        btnGrade.setVisible(true);
        edtFaltas.setVisible(true);
        edtNota.setVisible(true);
        edtMateria.setVisible(true);
    }//GEN-LAST:event_btnTabelaActionPerformed

    /**
     * Esse metodo faz com que o aluno receba os parametros nota e faltas que o professor coloca em alguma materia escolhida e salva parcialmente
     * @param evt clique do mouse no botao
     */
    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeActionPerformed
        Semestre ss = null;
        int z = 1, x = 1, i = 0,jj=0;
        String k = edtMateria.getText();
        Turma a = null;
        Aluno aa = Aluno.VerificaAluno(edtMatricula.getText());
        for (Turma y : aa.getListaDeMateriasFeitas()) {
            if (k.equals(y.getId())) {
                a = y;
            }
        }
        MateriaemGrade mat;
        if (a != null) {
            
            mat = new MateriaemGrade(a.getSemestre(), a.getProfessor(), a.getNome(), a.getId(), a.getPre_requisito(), a.getCurso(),
                    Integer.valueOf(edtFaltas.getText()), (int) Double.parseDouble(edtNota.getText()));
            System.out.println(mat);
            if (mat.getNota()>=6 && mat.getFaltas()<=18)
                mat.setStatus("Aprovado");
            else
                mat.setStatus("Não Aprovado");
            
            if (aa.getHistorico().getListaDeSemestre().size() > 0) {
                for (Semestre f : aa.getHistorico().getListaDeSemestre()) {
                    if (f.getPeriodo() == Integer.valueOf(edtSemestre.getText())) {
                        ss = f;
                        x = 0;               }
                }
                if (x == 1) {
                    ss = new Semestre(Integer.valueOf(edtSemestre.getText()));
                }
                
                for (Semestre f : aa.getHistorico().getListaDeSemestre()) {
                    for (MateriaemGrade mlk: f.getListaMateriaemGrade()){
                        if (mat.getId().equals(mlk.getId()) && mlk.getStatus().equals("Aprovado")){
                            JOptionPane.showMessageDialog(this,"Ja passou nessa materia");
                            jj=1;
                        }
                    }
                }
                if (jj==0){
                if (ss.getPeriodo() == mat.getSemestre()) {
                    ss.addMateriaemGrade(mat);
                    
                }
            } else {
                ss = new Semestre(Integer.valueOf(edtSemestre.getText()));
                ss.addMateriaemGrade(mat);
            }
            
        }
        
        for (Semestre f : aa.getHistorico().getListaDeSemestre()) {
            if (f.getPeriodo() == ss.getPeriodo()) {
                z = 0;
            }
        }
        if (z == 1) {
            System.out.println("add");
            aa.addSemestreHistorico(ss);
        }
            System.out.println(aa.getNome() + " - Semestre:" + ss.getPeriodo() + "\n" + ss.toString());
            JOptionPane.showMessageDialog(this,aa.getNome() + " - Semestre:" + ss.getPeriodo() + "\n" + ss.toString());
        }
    }//GEN-LAST:event_btnGradeActionPerformed
    /**
     * Esse metodo faz com que o professor salve o historico do Aluno de acordo com as informações e processos feitos antes
     * @param evt clique do mouse no botao
     */
    private void btnHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistActionPerformed
        String a = "";
        Aluno aa = Aluno.VerificaAluno(edtMatricula.getText());
        for (Semestre f : aa.getHistorico().getListaDeSemestre()) {
            a = a + f.getPeriodo()+"\n" + f.toString();
        }
        JOptionPane.showMessageDialog(this,a);
        try {
            aa.escreverHistorico(a);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"Erro ao salvar o historico do aluno");
        }

    }//GEN-LAST:event_btnHistActionPerformed

/**
 * Esse metodo seleciona a linha com foco na tabela e passa os dados dela para os text fields
 * @param evt clique do mouse na tabela
 */
    private void TableMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMatMouseClicked
        DefaultTableModel model = (DefaultTableModel) TableMat.getModel();
        edtMateria.setText((String) model.getValueAt(TableMat.getSelectedRow(), 1));
    }//GEN-LAST:event_TableMatMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMat;
    private javax.swing.JButton btnGrade;
    private javax.swing.JButton btnHist;
    private javax.swing.JButton btnTabela;
    private javax.swing.JTextField edtFaltas;
    private javax.swing.JTextField edtMateria;
    private javax.swing.JTextField edtMatricula;
    private javax.swing.JTextField edtNota;
    private javax.swing.JTextField edtSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFaltas;
    private javax.swing.JLabel labelMat;
    private javax.swing.JLabel labelNota;
    // End of variables declaration//GEN-END:variables
}