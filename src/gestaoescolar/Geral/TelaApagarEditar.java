/*
 * Jframe utilizada para apagar ou editar uma materia, aluno ou professor
 */
package gestaoescolar.Geral;

import Modelos.Usuarios.Aluno;
import Modelos.Universidade.Curso;
import Modelos.Materias.Materia;
import Modelos.Usuarios.Professor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro Lucas
 */
public class TelaApagarEditar extends javax.swing.JFrame {
        Curso engComp = new Curso("Engenharia de Computação", "CJM");
        Curso engEletrica = new Curso("Engenharia Eletrica", "CJM");
        Curso engProd = new Curso("Engenharia de Produção", "CJM");
        Curso engSistemas = new Curso("Sistema da Informação", "CJM");
    /**
     * Creates new form TelaApagar
     */
    public TelaApagarEditar() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        TablePessoa.setFillsViewportHeight(true);
        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setVisible(false);
        edtId.setVisible(false);
        edtNome.setVisible(false);
        edtAdd.setVisible(false);
        edtFinal.setVisible(false);
        Label1.setVisible(false);
        Label2.setVisible(false);
        Label3.setVisible(false);
        Label4.setVisible(false);
        btnApagar.setVisible(false);
        btnEditar.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        edtId3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        radioMat = new javax.swing.JRadioButton();
        radioProf = new javax.swing.JRadioButton();
        radioAluno = new javax.swing.JRadioButton();
        edtId = new javax.swing.JTextField();
        btnApagar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        edtAdd = new javax.swing.JTextField();
        edtFinal = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePessoa = new javax.swing.JTable();

        jLabel5.setText("Id do item");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        radioMat.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioMat);
        radioMat.setText("Materia");
        radioMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMatMouseClicked(evt);
            }
        });

        radioProf.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioProf);
        radioProf.setText("Professor");
        radioProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioProfMouseClicked(evt);
            }
        });

        radioAluno.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioAluno);
        radioAluno.setText("Aluno");
        radioAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioAlunoMouseClicked(evt);
            }
        });

        btnApagar.setBackground(new java.awt.Color(255, 153, 153));
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Escolha uma tabela");

        Label3.setText("AAAAAA");

        Label2.setText("AAAAAA");

        Label1.setText("AAAAAA");

        Label4.setText("AAAAAA");

        btnEditar.setBackground(new java.awt.Color(255, 153, 153));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        TablePessoa.setBackground(new java.awt.Color(255, 204, 204));
        TablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Matricula", "Curso", "CPF"
            }
        ));
        TablePessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePessoa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(radioMat)
                        .addGap(2, 2, 2)
                        .addComponent(radioProf)
                        .addGap(0, 0, 0)
                        .addComponent(radioAluno))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnApagar)
                        .addGap(70, 70, 70)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(Label3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(Label2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioMat)
                            .addComponent(radioProf)
                            .addComponent(radioAluno))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label1)
                            .addComponent(edtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label4)
                            .addComponent(edtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
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
     * Metodo que facilita o uso da tabela
     * @param evt evento de clicar em algum objeto da tabela
     */
    private void TablePessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePessoaMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) TablePessoa.getModel();
        edtId.setText((String) model.getValueAt(TablePessoa.getSelectedRow(), 1));
        edtNome.setText((String) model.getValueAt(TablePessoa.getSelectedRow(), 0));
        edtAdd.setText((String) model.getValueAt(TablePessoa.getSelectedRow(), 2));
        edtFinal.setText((String) model.getValueAt(TablePessoa.getSelectedRow(), 3));
    }//GEN-LAST:event_TablePessoaMouseClicked
    /**
     * Metodo que edita algum objeto da escolha do usuario
     * @param evt evento de clicar no botão editar
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Curso curso = null;
        if (radioAluno.isSelected()) {
            Aluno aa = Aluno.VerificaAluno(edtId.getText());
            if (aa != null) {
                aa.setNome(edtNome.getText());
                for (Curso c: Curso.getListadeCursos()){
                    if (edtAdd.getText().equals(c.getNome())){
                        curso=c;
                    }
                }
                aa.setCurso(curso);
                aa.gravarPessoaTxt();
                 JOptionPane.showMessageDialog(this,"Aluno alterado com sucesso");
            }
        }
        if (radioProf.isSelected()){
            Professor prof=null;
            for (Professor pp: Professor.verProfessores()){
                if (pp.getMatricula().equals(edtId.getText())) {
                    prof = pp;
                }
            }
            prof.setNome(edtNome.getText());
            prof.gravarPessoaTxt();
            JOptionPane.showMessageDialog(this,"Professor alterado com sucesso");
        }
        if (radioMat.isSelected()){
            Materia m=null;
            for (Materia mm: Materia.verMateria()){
                if (mm.getId().equals(edtId.getText())) {
                    System.out.println(mm);
                    m=mm;

                }
            }
            m.setNome(edtNome.getText());
            m.setPre_requisito(edtAdd.getText());
            m.gravarMateriaTxt();
             JOptionPane.showMessageDialog(this,"Materia alterada com sucesso");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    /**
     * Metodo que apaga algum objeto da escolha do usuario
     * @param evt evento de clicar no botão apagar
     */
    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        if (radioAluno.isSelected()){
            Aluno aa = Aluno.VerificaAluno(edtId.getText());
            Aluno.verAlunos().remove(aa);
            aa.gravarPessoaTxt();
            JOptionPane.showMessageDialog(this,"Aluno:"+aa+" excluido com sucesso");
        }
        if (radioProf.isSelected()){
            Professor prof=null;
            for (Professor pp: Professor.verProfessores()){
                if (pp.getMatricula().equals(edtId.getText())) {
                    prof = pp;

                }
            }
            Professor.verProfessores().remove(prof);
            prof.gravarPessoaTxt();
            JOptionPane.showMessageDialog(this,"Professor:"+prof+" excluido com sucesso");
        }
        if (radioMat.isSelected()){
            Materia m=null;
            for (Materia mm: Materia.verMateria()){
                if (mm.getId().equals(edtId.getText())) {
                    System.out.println(mm);
                    m=mm;

                }
            }
            Materia.verMateria().remove(m);
            m.gravarMateriaTxt();
            JOptionPane.showMessageDialog(this,"Materia: "+m+" excluida com sucesso");
        }
    }//GEN-LAST:event_btnApagarActionPerformed
    /**
     * Metodo para mostrar os alunos a serem editados/apagados
     * @param evt evento de click no radioButton
     */
    private void radioAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioAlunoMouseClicked
        jPanel2.setVisible(true);
        DefaultTableModel modelPessoa = (DefaultTableModel) TablePessoa.getModel();
        int r = TablePessoa.getRowCount();

        for (int j = r; j > 0; j--) {
            modelPessoa.removeRow(j-1);
        }
        for (int i = 0; i < Aluno.verAlunos().size(); i++) {

            String nome = Aluno.verAlunos().get(i).getNome();
            String mat = Aluno.verAlunos().get(i).getMatricula();
            String curs = Aluno.verAlunos().get(i).getCurso().getNome();
            String cpf = Aluno.verAlunos().get(i).getCpf();
            modelPessoa.addRow(new Object[]{nome, mat, curs, cpf});

        }
        edtId.setVisible(true);
        edtNome.setVisible(true);
        edtAdd.setVisible(true);
        edtFinal.setVisible(true);
        Label1.setVisible(true);
        Label2.setVisible(true);
        Label3.setVisible(true);
        Label4.setVisible(true);
        btnApagar.setVisible(true);
        btnEditar.setVisible(true);
        Label1.setText("Matricula");
        Label2.setText("Nome");
        Label3.setText("Curso");
        Label4.setText("CPF");
    }//GEN-LAST:event_radioAlunoMouseClicked
    /**
     * Metodo para mostrar os professores a serem editados/apagados
     * @param evt evento de click no radioButton
     */
    private void radioProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioProfMouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        TablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "ID", "Curso","CPF"
            }
        ));
        DefaultTableModel modelPessoa = (DefaultTableModel) TablePessoa.getModel();
        int r = TablePessoa.getRowCount();

        for (int j = r; j > 0; j--) {
            modelPessoa.removeRow(j - 1);
        }
        for (int i = 0; i < Professor.verProfessores().size(); i++) {

            String nome = Professor.verProfessores().get(i).getNome();
            String mat = Professor.verProfessores().get(i).getMatricula();
            String fun = Professor.verProfessores().get(i).getFunção();
            String cpf = Professor.verProfessores().get(i).getCpf();
            modelPessoa.addRow(new Object[]{nome, mat, fun, cpf});

        }
        edtId.setVisible(true);
        edtNome.setVisible(true);
        edtAdd.setVisible(true);
        edtFinal.setVisible(true);
        Label1.setVisible(true);
        Label2.setVisible(true);
        Label3.setVisible(true);
        Label4.setVisible(true);
        btnApagar.setVisible(true);
        btnEditar.setVisible(true);
        Label1.setText("Matricula    ");
        Label2.setText("Nome         ");
        Label3.setText("Curso        ");
        Label4.setText("CPF          ");
    }//GEN-LAST:event_radioProfMouseClicked
    
    /**
     * Metodo para mostrar as materias a serem editados/apagados
     * @param evt evento de click no radioButton
     */
    private void radioMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMatMouseClicked
        jPanel2.setVisible(true);
        TablePessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "ID", "CPF"
            }
        ));
        DefaultTableModel modelPessoa = (DefaultTableModel)TablePessoa.getModel();

        for (int i = 0; i < Materia.verMateria().size(); i++) {

            String nome = Materia.verMateria().get(i).getNome();
            String id = Materia.verMateria().get(i).getId();
            String pre = Materia.verMateria().get(i).getPre_requisito();

            modelPessoa.addRow(new Object[]{nome,id,pre});

        }
        edtId.setVisible(true);
        edtNome.setVisible(true);
        edtAdd.setVisible(true);
        Label1.setVisible(true);
        Label2.setVisible(true);
        Label3.setVisible(true);
        btnApagar.setVisible(true);
        btnEditar.setVisible(true);
        Label1.setText("Identificador");
        Label2.setText("Nome         ");
        Label3.setText("Pre requisito");
        Label4.setVisible(false);
        edtFinal.setVisible(false);
    }//GEN-LAST:event_radioMatMouseClicked
                   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JTable TablePessoa;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edtAdd;
    private javax.swing.JTextField edtFinal;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtId3;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioAluno;
    private javax.swing.JRadioButton radioMat;
    private javax.swing.JRadioButton radioProf;
    // End of variables declaration//GEN-END:variables
}
