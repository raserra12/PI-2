/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Telas;

import javax.swing.JFrame;

/**
 *
 * @author evie.scarmo
 */


public class JVendas extends javax.swing.JFrame {
    JIncluirCliente ic = null;
    JIncluirProduto ip = null;
    /**
     * Creates new form JVendas
     */
    public JVendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        telaVendas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProdutos = new javax.swing.JTable();
        removerItem = new javax.swing.JButton();
        adicionarItem = new javax.swing.JButton();
        jValor = new javax.swing.JLabel();
        valorTotal = new javax.swing.JLabel();
        concuirVenda = new javax.swing.JButton();
        cancelarVenda = new javax.swing.JButton();
        codigoProduto = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        buscarProduto = new javax.swing.JButton();
        descricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descricaoProduto = new javax.swing.JTextArea();
        jPONumber = new javax.swing.JLabel();
        numeroPedido = new javax.swing.JTextField();
        NomeCliente = new javax.swing.JLabel();
        pesquisarCliente = new javax.swing.JButton();
        nomeBuscado = new javax.swing.JTextField();
        clienteID = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        buscaEndereço = new javax.swing.JLabel();
        buscaNumero = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        buscaCidade = new javax.swing.JLabel();
        buscaEstado = new javax.swing.JLabel();
        buscaCEP = new javax.swing.JLabel();
        buscaComplemento = new javax.swing.JLabel();
        buscaBairro = new javax.swing.JLabel();
        endereço = new javax.swing.JTextField();
        complemento = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        bQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vender produtos");

        telaVendas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        TableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Valor R$", "Quantidade", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(TableProdutos);

        removerItem.setForeground(new java.awt.Color(255, 0, 0));
        removerItem.setText("Remover Item");

        adicionarItem.setText("Adicionar Item");
        adicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarItemActionPerformed(evt);
            }
        });

        jValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jValor.setText("Valor Total: R$");

        valorTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valorTotal.setText("Total");

        concuirVenda.setText("Finalizar Venda");

        cancelarVenda.setForeground(new java.awt.Color(255, 0, 0));
        cancelarVenda.setText("Cancelar Venda");
        cancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVendaActionPerformed(evt);
            }
        });

        codigoProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codigoProduto.setText("Código: ");

        jTextField1.setText("2528");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buscarProduto.setText("Buscar");
        buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdutoActionPerformed(evt);
            }
        });

        descricao.setText("Descrição");

        descricaoProduto.setColumns(20);
        descricaoProduto.setRows(5);
        jScrollPane2.setViewportView(descricaoProduto);

        jPONumber.setText("N° PEDIDO");

        numeroPedido.setText("12345");

        NomeCliente.setText("Cliente :");

        pesquisarCliente.setText("Pesquisar");
        pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarClienteActionPerformed(evt);
            }
        });

        nomeBuscado.setText("João Bezerra da Silva Ferraz");

        clienteID.setText("Codigo do cliente:");

        ID.setText("450054789");

        buscaEndereço.setText("Endereço:");

        buscaNumero.setText("N° :");

        numero.setText("2300");
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        buscaCidade.setText("Cidade:");

        buscaEstado.setText("Estado:");

        buscaCEP.setText("CEP:");

        buscaComplemento.setText("Complemento:");

        buscaBairro.setText("Bairro:");

        endereço.setText("Avenida Paulista");

        complemento.setText("20° andar");

        bairro.setText("Consolação");

        cidade.setText("Pernambuco");

        estado.setText("SP");

        cep.setText("01310-300");

        quantidade.setText("Quantidade:");

        bQuantidade.setText("10");

        javax.swing.GroupLayout telaVendasLayout = new javax.swing.GroupLayout(telaVendas);
        telaVendas.setLayout(telaVendasLayout);
        telaVendasLayout.setHorizontalGroup(
            telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaVendasLayout.createSequentialGroup()
                        .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(telaVendasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPONumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(telaVendasLayout.createSequentialGroup()
                                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adicionarItem)
                                    .addComponent(removerItem))
                                .addGap(11, 11, 11))))
                    .addGroup(telaVendasLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(NomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(clienteID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descricao)
                    .addGroup(telaVendasLayout.createSequentialGroup()
                        .addComponent(cancelarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(concuirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVendasLayout.createSequentialGroup()
                        .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaVendasLayout.createSequentialGroup()
                                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVendasLayout.createSequentialGroup()
                                        .addComponent(codigoProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buscarProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quantidade))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, telaVendasLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(buscaCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(buscaEstado)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscaCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaVendasLayout.createSequentialGroup()
                                .addComponent(buscaEndereço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(endereço, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscaNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscaComplemento)
                                .addGap(10, 10, 10)
                                .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscaBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        telaVendasLayout.setVerticalGroup(
            telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeCliente)
                    .addComponent(pesquisarCliente)
                    .addComponent(nomeBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteID)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscaNumero)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscaComplemento)
                        .addComponent(buscaBairro)
                        .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscaEndereço)
                        .addComponent(endereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaCidade)
                    .addComponent(buscaEstado)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaCEP)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoProduto)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProduto)
                    .addComponent(quantidade)
                    .addComponent(bQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaVendasLayout.createSequentialGroup()
                        .addComponent(adicionarItem)
                        .addGap(18, 18, 18)
                        .addComponent(removerItem)
                        .addGap(18, 18, 18)
                        .addComponent(jValor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPONumber)
                    .addComponent(numeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(telaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarVenda)
                    .addComponent(concuirVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(telaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(telaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarItemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void pesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarClienteActionPerformed
        if(ic == null || !ic.isDisplayable()){
            ic = new JIncluirCliente();
            ic.pack();
            ic.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ic.setLocationRelativeTo(null);
            ic.setVisible(true);
        }
        ic.toFront();
    }//GEN-LAST:event_pesquisarClienteActionPerformed

    private void buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdutoActionPerformed
        if(ip==null || ip.isDisplayable()){
            ip = new JIncluirProduto();
            ip.pack();
            ip.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ip.setLocationRelativeTo(null);
            ip.setVisible(true);
        }
        ip.toFront();
    }//GEN-LAST:event_buscarProdutoActionPerformed

    private void cancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarVendaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JTable TableProdutos;
    private javax.swing.JButton adicionarItem;
    private javax.swing.JTextField bQuantidade;
    private javax.swing.JTextField bairro;
    private javax.swing.JLabel buscaBairro;
    private javax.swing.JLabel buscaCEP;
    private javax.swing.JLabel buscaCidade;
    private javax.swing.JLabel buscaComplemento;
    private javax.swing.JLabel buscaEndereço;
    private javax.swing.JLabel buscaEstado;
    private javax.swing.JLabel buscaNumero;
    private javax.swing.JButton buscarProduto;
    private javax.swing.JButton cancelarVenda;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JLabel clienteID;
    private javax.swing.JLabel codigoProduto;
    private javax.swing.JTextField complemento;
    private javax.swing.JButton concuirVenda;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextArea descricaoProduto;
    private javax.swing.JTextField endereço;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jPONumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jValor;
    private javax.swing.JTextField nomeBuscado;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField numeroPedido;
    private javax.swing.JButton pesquisarCliente;
    private javax.swing.JLabel quantidade;
    private javax.swing.JButton removerItem;
    private javax.swing.JPanel telaVendas;
    private javax.swing.JLabel valorTotal;
    // End of variables declaration//GEN-END:variables
}
