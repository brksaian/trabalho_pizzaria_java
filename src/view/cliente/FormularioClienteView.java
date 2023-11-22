/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.Cliente;

public class FormularioClienteView extends javax.swing.JPanel {

    private Cliente clienteSelecionadoParaAtualizacao;
    /**
     * Creates new form FormularioclienteView
     */
    public FormularioClienteView() {
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

        campoTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoDataNascimento = new javax.swing.JFormattedTextField();
        labelDataNascimento = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();

        labelTelefone.setText("Telefone");

        labelEmail.setText("Email");

        try {
            campoDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelDataNascimento.setText("Data de Nascimento");

        labelNome.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEmail))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTelefone)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataNascimento)
                    .addComponent(campoDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelNome;
    // End of variables declaration//GEN-END:variables

    public void setCliente(Cliente cliente) {
        this.clienteSelecionadoParaAtualizacao = cliente;
        campoDataNascimento.setText(cliente.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        campoEmail.setText(cliente.getEmail());
        campoTelefone.setText(cliente.getTelefone());
        campoNome.setText(cliente.getNome());



    }

    public void limparClienteAtualizar(){
        clienteSelecionadoParaAtualizacao=null;
    }

    public Cliente getClienteParaAtualizar() {
        if(clienteSelecionadoParaAtualizacao==null){
            return null;
        }
        clienteSelecionadoParaAtualizacao.setDataNascimento(LocalDate.parse(campoDataNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        clienteSelecionadoParaAtualizacao.setEmail(campoEmail.getText());
        clienteSelecionadoParaAtualizacao.setTelefone(campoTelefone.getText());
        clienteSelecionadoParaAtualizacao.setNome(campoNome.getText());
        return clienteSelecionadoParaAtualizacao;

    }

    public Cliente getClienteFormulario() {
       String nome = campoNome.getText();
       String Telefone = campoTelefone.getText();
       String email = campoEmail.getText();
       LocalDate dataNascimento = LocalDate.parse(campoDataNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
       return new Cliente(-1, nome, dataNascimento, email, Telefone);
    }
}
