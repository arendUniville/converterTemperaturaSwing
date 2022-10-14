package br.com.univille.poo.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField usuarioField;
    private JPasswordField senhaField;
    private JCheckBox lembrarCheckBox;
    private JLabel testeLabel;

    public LoginFrame(){
        setTitle("Meu Aplicativo");
        setSize(300,230);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        configurarLayout();
        setVisible(true);
    }

    private void configurarLayout() {
        JPanel painel = new JPanel();
        usuarioField = new JTextField();
        usuarioField.setColumns(15);
        usuarioField.setToolTipText("Informe o usuário");

        senhaField = new JPasswordField();
        senhaField.setColumns(15);
        senhaField.setToolTipText("Informe a senha");

        lembrarCheckBox = new JCheckBox("Lembrar-me                 ");
        lembrarCheckBox.setSelected(true);


        JButton acessar = new JButton("Acessar");
        // Padrão Observer
        acessar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoAcessar();
            }
        });

        testeLabel = new JLabel();

        painel.add(new JLabel("Usuário"));
        painel.add(usuarioField);
        painel.add(new JLabel("   Senha"));
        painel.add(senhaField);
        painel.add(lembrarCheckBox);
        painel.add(acessar);
        painel.add(testeLabel);

        painel.setBorder(BorderFactory
                 .createCompoundBorder(BorderFactory.createEmptyBorder(20,20,20,20)
                 ,BorderFactory.createTitledBorder("Login")));

        //Adicina o painel no JFrame
        add(painel);
    }

    private void acaoAcessar() {
        testeLabel.setText("Acessar usuario "+usuarioField.getText());
    }

}
