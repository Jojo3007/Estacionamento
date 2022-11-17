/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Vaga;
import model.dao.VagaDAO;

/**
 *
 * @author 01825773092
 */
public class JFListarVagas extends javax.swing.JFrame {

    /**
     * Creates new form JFListarVagas
     */
    public JFListarVagas() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVaga = new javax.swing.JTable();
        jBtnCadastrarVaga = new javax.swing.JButton();
        jBtnEditarVaga = new javax.swing.JButton();
        jBtnExcluirVaga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listar Vagas");

        jTVaga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id da Vaga", "Número", "Rua", "Oblíqua"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTVaga);

        jBtnCadastrarVaga.setText("Cadastrar Vaga");
        jBtnCadastrarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarVagaActionPerformed(evt);
            }
        });

        jBtnEditarVaga.setText("Editar Vaga");
        jBtnEditarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarVagaActionPerformed(evt);
            }
        });

        jBtnExcluirVaga.setText("Excluir Vaga");
        jBtnExcluirVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirVagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnCadastrarVaga)
                .addGap(18, 18, 18)
                .addComponent(jBtnEditarVaga)
                .addGap(18, 18, 18)
                .addComponent(jBtnExcluirVaga)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrarVaga)
                    .addComponent(jBtnEditarVaga)
                    .addComponent(jBtnExcluirVaga))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCadastrarVagaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       readJTable();
       
    }//GEN-LAST:event_formWindowOpened

    private void jBtnExcluirVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirVagaActionPerformed
        
        if(jTVaga.getSelectedRow() != -1){
            
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir a vaga selecionada?", "Exclusão", JOptionPane.YES_NO_OPTION);
                if(opcao == 0){
                    
                    VagaDAO dao = new VagaDAO();
                    Vaga v = new Vaga();
                    
                    v.setIdVaga ((int) jTVaga.getValueAt(jTVaga.getSelectedRow(), 0));
                    dao.delete(v);
                }
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
            
        }
                readJTable();
    }//GEN-LAST:event_jBtnExcluirVagaActionPerformed

    private void jBtnEditarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarVagaActionPerformed
      
        if(jTVaga.getSelectedRow() != -1){
            
            int vagaSelecionada = (int)jTVaga.getValueAt (jTVaga.getSelectedRow(), 0);
            JFAtualizarVaga av= new JFAtualizarVaga(vagaSelecionada);
            av.setVisible(true);
                    
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma vaga!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        readJTable();
    }//GEN-LAST:event_jBtnEditarVagaActionPerformed

        public void readJTable(){
            DefaultTableModel modelo = (DefaultTableModel) jTVaga.getModel();
            
            modelo.setNumRows(0);
            VagaDAO dao = new VagaDAO();
            for(Vaga v: dao.read()){
                modelo.addRow (new Object[]{
                    v.getIdVaga(),
                    v.getNumero(),
                    v.getRua(),
                    v.isObliqua()
                
                });
            }
             
        }
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
            java.util.logging.Logger.getLogger(JFListarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFListarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFListarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFListarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFListarVagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrarVaga;
    private javax.swing.JButton jBtnEditarVaga;
    private javax.swing.JButton jBtnExcluirVaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVaga;
    // End of variables declaration//GEN-END:variables
}
