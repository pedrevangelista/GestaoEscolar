/*
 * Jframe utilizada para o cadastro de Alunos
 */
package gestaoescolar.CadastroUsuarios;

import Modelos.Usuarios.Aluno;
import Modelos.Universidade.Curso;
import Modelos.Usuarios.Pessoa;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Lucas
 */
public class TelaCadAlunos extends javax.swing.JFrame {
   
    Curso engComp = new Curso("Engenharia de Computação", "CJM");
    Curso engEletrica = new Curso("Engenharia Eletrica", "CJM");
    Curso engProd = new Curso("Engenharia de Produção", "CJM");
    Curso engSistemas = new Curso("Sistema da Informação", "CJM");
    
        
    public TelaCadAlunos() throws IOException {

        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtMatric = new javax.swing.JTextField();
        edtNascimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrarAluno = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        radioComp = new javax.swing.JRadioButton();
        radioEletrica = new javax.swing.JRadioButton();
        radioSistemas = new javax.swing.JRadioButton();
        radioProd = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel4ComponentHidden(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Matricula");

        edtNascimento.setForeground(new java.awt.Color(204, 204, 204));
        edtNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtNascimento.setText("DD/MM/AAAA");
        edtNascimento.setToolTipText("");
        edtNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtNascimentoFocusGained(evt);
            }
        });

        jLabel4.setText("Data de nascimento");

        btnCadastrarAluno.setBackground(new java.awt.Color(255, 153, 153));
        btnCadastrarAluno.setText("Cadastrar Aluno");
        btnCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlunoActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(255, 153, 153));
        btnPrint.setText("Printar Alunos");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        radioComp.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioComp);
        radioComp.setText("Computação");
        radioComp.setToolTipText("Engenharia de Computação");
        radioComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCompActionPerformed(evt);
            }
        });

        radioEletrica.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioEletrica);
        radioEletrica.setText("Eletrica");
        radioEletrica.setToolTipText("Engenharia Eletrica");

        radioSistemas.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioSistemas);
        radioSistemas.setText("Sistemas");
        radioSistemas.setToolTipText("Sistema da Informação");

        radioProd.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(radioProd);
        radioProd.setText("Produção");
        radioProd.setToolTipText("Engenharia de Produção");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioEletrica)
                    .addComponent(radioSistemas)
                    .addComponent(radioComp)
                    .addComponent(radioProd))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioComp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioEletrica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSistemas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioProd)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(190, 190, 190)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrarAluno)
                            .addComponent(edtMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtMatric, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarAluno)
                    .addComponent(btnPrint))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Esse metodo cadastra o aluno
     * @param evt evento de click no botão
     */
    private void btnCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlunoActionPerformed
        if (Pessoa.isCPF(edtCpf.getText())) {

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String mess = null;
            String ddia = null;
            int ano = calendar.get(Calendar.YEAR);
            int mes = calendar.get(Calendar.MONTH) + 1;
            if (mes < 10) {
                mess = 0 + "" + mes;
            } else {
                mess = "" + mes;
            }
            int dia = calendar.get(Calendar.DAY_OF_WEEK);
            if (dia < 10) {
                ddia = 0 + "" + dia;

            } else {
                ddia = "" + dia;
            }
            int idadeNascimento = 0;
            String nascimento = edtNascimento.getText().replaceAll("/", "");
            if (nascimento.length()>7){
            String dian = nascimento.substring(0,2);
            if(Integer.valueOf(dian)<10 && dian.length()==1)
                dian=0+""+dian;
            String mesn = nascimento.substring(2,4);
            if(Integer.valueOf(mesn)<10 && mesn.length()==1)
                mesn=0+""+mesn;
            String anon = nascimento.substring(4,8);
            idadeNascimento = Integer.parseInt(anon+mesn+dian);
            }
            String dataHojeS = ano + "" + mess + "" + ddia;
            int dataHoje = Integer.parseInt(dataHojeS);
            float idadePTruncar = (dataHoje - idadeNascimento) / 10000;
            int idade = (int) idadePTruncar;
            
            Curso curso = null;
            String j = null;

            if (radioComp.isSelected()) {

                curso = engComp;
            }
            if (radioEletrica.isSelected()) {

                curso = engEletrica;
            }
            if (radioProd.isSelected()) {

                curso = engProd;

            }
            if (radioSistemas.isSelected()) {

                curso = engSistemas;

            } 
            Aluno aa = Aluno.VerificaAluno(edtMatric.getText());
            if (edtNome.getText() != null && edtMatric.getText() != null && curso != null && edtCpf.getText() != null && edtNascimento.getText() != null &&  aa==null){
            Aluno a1 = new Aluno(edtNome.getText(), edtMatric.getText(), curso, edtCpf.getText(), edtNascimento.getText(), idade, "Aluno");
            Aluno.verAlunos().add(a1);
            a1.gravarPessoaTxt();
            JOptionPane.showMessageDialog(this,"Aluno matriculado com sucesso");
            Aluno.verAlunos();
            edtCpf.setText("");
            edtMatric.setText("");
            edtNascimento.setText("");
            edtNome.setText("");
            }else
                JOptionPane.showMessageDialog(this, "Campo invalido ou Ja existe um aluno com essa matricula");
        } else {
            JOptionPane.showMessageDialog(this, "CPF invalido");
        }

    }//GEN-LAST:event_btnCadastrarAlunoActionPerformed

    private void edtNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNascimentoFocusGained
        edtNascimento.setText("");
        edtNascimento.setForeground(Color.BLACK);
        edtNascimento.setHorizontalAlignment(JTextField.LEFT);
    }//GEN-LAST:event_edtNascimentoFocusGained
    /**
     * Esse metodo mostra todos os alunos cadastrados
     * @param evt evento de click no botão
     */
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        String a = "";    
        for (Aluno prof: Aluno.verAlunos()){
            a = a+prof+"\n";
            }
            JOptionPane.showMessageDialog(this,a);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void radioCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCompActionPerformed

    }//GEN-LAST:event_radioCompActionPerformed

    private void jPanel4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel4ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4ComponentHidden

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAluno;
    private javax.swing.JButton btnPrint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JTextField edtCpf;
    private javax.swing.JTextField edtMatric;
    private javax.swing.JTextField edtNascimento;
    private javax.swing.JTextField edtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton radioComp;
    private javax.swing.JRadioButton radioEletrica;
    private javax.swing.JRadioButton radioProd;
    private javax.swing.JRadioButton radioSistemas;
    // End of variables declaration//GEN-END:variables
}
