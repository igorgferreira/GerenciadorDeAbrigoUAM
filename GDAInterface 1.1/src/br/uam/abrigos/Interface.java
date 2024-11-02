package br.uam.abrigos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {

    public static GerenciadorDeProdutos produtos = new GerenciadorDeProdutos();

    ArrayList<Produto> produtoslist;
    String Header[] = new String[]{"ID", "Nome", "Lugar"};
    DefaultTableModel dtm;
    int row;

    public Interface() {
        initComponents();
        produtoslist = new ArrayList<>();
        dtm = new DefaultTableModel(Header, 0);
        jTable1.setModel(dtm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addAlimento = new javax.swing.JButton();
        addHigiene = new javax.swing.JButton();
        addRoupa = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.background"));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Gerenciador de Abrigos");

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jLabel1.setText("Adicionar Produto");

        addAlimento.setText("Alimento");
        addAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlimentoActionPerformed(evt);
            }
        });

        addHigiene.setText("Higiene");
        addHigiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHigieneActionPerformed(evt);
            }
        });

        addRoupa.setText("Roupa");
        addRoupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoupaActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Lugar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addHigiene)
                        .addGap(18, 18, 18)
                        .addComponent(addRoupa)
                        .addGap(18, 18, 18)
                        .addComponent(addAlimento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addAlimento)
                    .addComponent(addHigiene)
                    .addComponent(addRoupa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(58, 58, 58))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void addHigieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHigieneActionPerformed
        JTextField tfnome = new JTextField();
        JTextField tflugar = new JTextField();
        JTextField tfpeso = new JTextField();
        JTextField tfmarca = new JTextField();
        JTextField tfvalidade = new JTextField();

        Object[] fields = {
            "Nome", tfnome,
            "Lugar de armazenamento", tflugar,
            "Peso (g/ml)", tfpeso,
            "Marca", tfmarca,
            "Validade", tfvalidade
        };

        JOptionPane.showConfirmDialog(null, fields, "Produto de Higiene", JOptionPane.OK_CANCEL_OPTION);
        String nome = tfnome.getText();
        String lugar = tflugar.getText();
        Float peso = Float.parseFloat(tfpeso.getText());
        String marca = tfmarca.getText();
        String validade = tfvalidade.getText();
        Higiene novoHigiene = new Higiene(nome, lugar, peso, marca, validade);
        produtos.addP(novoHigiene, 200);
        JOptionPane.showMessageDialog(null, "Produto registrado com sucesso");
        produtoslist.add(novoHigiene);
        dtm.setRowCount(0);
        for (int i = 0; i < produtoslist.size(); i++) {
            Object[] objs = {produtoslist.get(i).id, produtoslist.get(i).nome, produtoslist.get(i).lugar};
            dtm.addRow(objs);
        }
    }//GEN-LAST:event_addHigieneActionPerformed
    private void addRoupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoupaActionPerformed
        JTextField tfnome = new JTextField();
        JTextField tflugar = new JTextField();
        JTextField tftamanho = new JTextField();
        JTextField tfobs = new JTextField();

        Object[] fields = {
            "Nome", tfnome,
            "Lugar de armazenamento", tflugar,
            "Tamanho (PP/P/M/G/GG)", tftamanho,
            "Observação (Condição)", tfobs
        };

        JOptionPane.showConfirmDialog(null, fields, "Roupa", JOptionPane.OK_CANCEL_OPTION);
        String nome = tfnome.getText();
        String lugar = tflugar.getText();
        String tamanho = tftamanho.getText();
        String obs = tfobs.getText();
        Roupa roupaNova = new Roupa(nome, lugar, tamanho, obs);
        produtos.addP(roupaNova, 300);
        JOptionPane.showMessageDialog(null, "Roupa registrada com sucesso");
        produtoslist.add(roupaNova);
        dtm.setRowCount(0);
        for (int i = 0; i < produtoslist.size(); i++) {
            Object[] objs = {produtoslist.get(i).id, produtoslist.get(i).nome, produtoslist.get(i).lugar};
            dtm.addRow(objs);
        }
    }//GEN-LAST:event_addRoupaActionPerformed
    private void addAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlimentoActionPerformed
        boolean refrigerado = true;
        JTextField tfnome = new JTextField();
        JTextField tflugar = new JTextField();
        JTextField tfpeso = new JTextField();
        JTextField tfmarca = new JTextField();
        JTextField tfvalidade = new JTextField();

        Object[] fields = {
            "Nome", tfnome,
            "Lugar de armazenamento", tflugar,
            "Peso (g/ml)", tfpeso,
            "Marca", tfmarca,
            "Validade", tfvalidade
        };
        JOptionPane.showConfirmDialog(null, fields, "Alimento", JOptionPane.OK_CANCEL_OPTION);
        String nome = tfnome.getText();
        String lugar = tflugar.getText();
        Float peso = Float.parseFloat(tfpeso.getText());
        String marca = tfmarca.getText();
        String validade = tfvalidade.getText();
        int isRefrigerado = JOptionPane.showConfirmDialog(null, "Este alimento precisa de refrigeração?", "Selecione", JOptionPane.YES_NO_OPTION);
        if (isRefrigerado == 1) {
            refrigerado = false;
        } else if (isRefrigerado == 0) {
            refrigerado = true;
        }
        Alimento novoAlimento = new Alimento(nome, lugar, peso, refrigerado, marca, validade);
        produtos.addP(novoAlimento, 100);
        JOptionPane.showMessageDialog(null, "Alimento registrado com sucesso");
        produtoslist.add(novoAlimento);
        dtm.setRowCount(0);
        for (int i = 0; i < produtoslist.size(); i++) {
            Object[] objs = {produtoslist.get(i).id, produtoslist.get(i).nome, produtoslist.get(i).lugar};
            dtm.addRow(objs);
        }
    }//GEN-LAST:event_addAlimentoActionPerformed
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do produto"));
        produtos.buscarProduto(id);
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do produto"));
        produtos.delP(id);
        dtm.removeRow(row);
        for (int i = 0; i < produtoslist.size(); i++) {
            if (produtoslist.get(i).id == id) {
                produtoslist.remove(i);
            }
        }
        dtm.setRowCount(0);
        for (int i = 0; i <= produtoslist.size(); i++) {
            Object[] objs = {produtoslist.get(i).id, produtoslist.get(i).nome, produtoslist.get(i).lugar};
            dtm.addRow(objs);
        }

    }//GEN-LAST:event_jButtonExcluirActionPerformed
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID:"));
        String atributo = JOptionPane.showInputDialog(null, "Digite o atributo que irá editar:");
        String novoValor = JOptionPane.showInputDialog(null, "Digite o novo valor:");
        produtos.editarObj(id, atributo, novoValor);
        for (int i = 0; i < produtoslist.size(); i++) {
            if (produtoslist.get(i).id == id) {
                switch (atributo.toLowerCase()) {
                    case "nome":
                        produtoslist.get(i).setNome(novoValor);
                        break;
                    case "lugar":
                        produtoslist.get(i).setLugar(novoValor);
                        break;
                    default:;
                }
            }
        }
        dtm.removeRow(row);
        dtm.setRowCount(0);
        for (int i = 0; i <= produtoslist.size(); i++) {
            Object[] objs = {produtoslist.get(i).id, produtoslist.get(i).nome, produtoslist.get(i).lugar};
            dtm.addRow(objs);
        }

    }//GEN-LAST:event_jButtonEditarActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAlimento;
    private javax.swing.JButton addHigiene;
    private javax.swing.JButton addRoupa;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
