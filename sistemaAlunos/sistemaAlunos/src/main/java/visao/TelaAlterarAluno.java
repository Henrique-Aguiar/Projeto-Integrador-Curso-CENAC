/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.AlunoControle;
import controle.EnderecoControle;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Aluno;
import modelo.Endereco;

/**
 *
 * @author Roberto
 */
public class TelaAlterarAluno extends javax.swing.JInternalFrame {

    private Aluno aluno;

    /**
     * Creates new form TelaCadastrarAluno
     */
    public TelaAlterarAluno(Aluno aluno) {
        initComponents();

        this.aluno = aluno;
        setarCamposDaTela();        
    }
    
    public void centralizar() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void setarCamposDaTela() {
        txtNome.setText(aluno.getNome());
        txtTelefone.setText(aluno.getTelefone());

        comboBoxSerie.setSelectedIndex(aluno.getSerie());

        // setar situação
        if (aluno.getSituacao().equals("Em processo")) {
            comboBoxSituacao.setSelectedIndex(
                    Aluno.EM_PROCESSO);
        } else if (aluno.getSituacao().equals("Aprovado")) {
            comboBoxSituacao.setSelectedIndex(
                    Aluno.APROVADO);
        } else if (aluno.getSituacao().equals("Reprovado")) {
            comboBoxSituacao.setSelectedIndex(
                    Aluno.REPROVADO);
        } else {
            comboBoxSituacao.setSelectedIndex(Aluno.RECUPERACAO);
        }
        //

        txtCidade.setText(aluno.getEndereco().getCidade());
        txtBairro.setText(aluno.getEndereco().getBairro());
        txtRua.setText(aluno.getEndereco().getRua());
        txtNumero.setText(
                String.valueOf(aluno.getEndereco().getNumero())
        );
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
        jComboBox1 = new javax.swing.JComboBox<>();
        painelPrincipal = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        labelSituacao = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        labelSerie = new javax.swing.JLabel();
        comboBoxSerie = new javax.swing.JComboBox<>();
        labelCidade = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        labelRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        labelEndereco1 = new javax.swing.JLabel();
        comboBoxSituacao = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setTitle("Alterar dados de aluno ");

        painelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        painelTitulo.setBackground(new java.awt.Color(0, 102, 102));
        painelTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelTitulo.setFont(new java.awt.Font("Euphemia", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Alterar Dados");

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        labelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        labelEndereco.setText("Informações Pessoais:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome:");

        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        labelSituacao.setForeground(new java.awt.Color(255, 255, 255));
        labelSituacao.setText("SItuação:");

        labelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone.setText("Telefone:");

        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(0, 102, 102));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        labelSerie.setForeground(new java.awt.Color(255, 255, 255));
        labelSerie.setText("Série:");

        comboBoxSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3" }));
        comboBoxSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSerieActionPerformed(evt);
            }
        });

        labelCidade.setForeground(new java.awt.Color(255, 255, 255));
        labelCidade.setText("Cidade:");

        labelBairro.setForeground(new java.awt.Color(255, 255, 255));
        labelBairro.setText("Bairro:");

        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setForeground(new java.awt.Color(0, 0, 0));
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        labelRua.setForeground(new java.awt.Color(255, 255, 255));
        labelRua.setText("Rua:");

        txtRua.setBackground(new java.awt.Color(255, 255, 255));
        txtRua.setForeground(new java.awt.Color(0, 0, 0));
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        labelNumero.setForeground(new java.awt.Color(255, 255, 255));
        labelNumero.setText("Número:");

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        labelEndereco1.setForeground(new java.awt.Color(255, 255, 255));
        labelEndereco1.setText("Endereço:");

        comboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em processo", "Aprovado", "Reprovado", "Recuperação" }));
        comboBoxSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSituacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNome)
                                    .addComponent(labelSituacao)
                                    .addComponent(labelTelefone)
                                    .addComponent(labelSerie)
                                    .addComponent(labelCidade)
                                    .addComponent(labelBairro)
                                    .addComponent(labelRua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(comboBoxSerie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboBoxSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelEndereco1)
                                            .addComponent(labelEndereco)
                                            .addComponent(txtCidade)
                                            .addComponent(txtBairro))
                                        .addGap(48, 48, 48)
                                        .addComponent(labelNumero)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(painelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labelEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSituacao)
                    .addComponent(comboBoxSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSerie))
                .addGap(20, 20, 20)
                .addComponent(labelEndereco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            aluno.setNome(txtNome.getText());
            aluno.setTelefone(txtTelefone.getText());
            aluno.setSerie(comboBoxSerie.getSelectedIndex());
            aluno.setSituacao(comboBoxSituacao.getSelectedItem().toString());
            Endereco endereco = aluno.getEndereco();
            endereco.setCidade(txtCidade.getText());
            endereco.setBairro(txtBairro.getText());
            endereco.setRua(txtRua.getText());
            endereco.setNumero(Integer.parseInt(txtNumero.getText()));

            boolean sucesso
                    = AlunoControle.alterar(aluno)
                    && EnderecoControle.alterar(endereco);
            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível alterar! "
                        + " Tente novamente.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um número de endereço válido",
                    "Campo 'Número' inválido", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro de sql",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            this.dispose();
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void comboBoxSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSerieActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void comboBoxSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSituacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JComboBox<String> comboBoxSerie;
    private javax.swing.JComboBox<String> comboBoxSituacao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEndereco1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelSerie;
    private javax.swing.JLabel labelSituacao;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}