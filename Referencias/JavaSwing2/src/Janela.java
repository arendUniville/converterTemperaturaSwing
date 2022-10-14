import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {

    private  JLabel bandeiraLabel;

    public Janela(){
        setSize(500,500);
        setTitle("Meu Aplicativo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    private void configurarJanela(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello Swing");
        ImageIcon i = new ImageIcon();
        bandeiraLabel = new JLabel(ImagemUtil.getImage("resources/imagens/img.png",200,50));
        panel.add(label);
        JRadioButton argentinaRB = new JRadioButton("Argentina");
        argentinaRB.setSelected(true);
        argentinaRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trocarBandeira("resources/imagens/img.png");
            }
        });
        JRadioButton brasilRB = new JRadioButton("Brasil");
        brasilRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trocarBandeira("resources/imagens/brasil.png");
            }
        });
        JRadioButton uruguaiRB = new JRadioButton("Uruguai");
        uruguaiRB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trocarBandeira("resources/imagens/uruguai.jpg");
            }
        });

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(argentinaRB);
        buttonGroup.add(brasilRB);
        buttonGroup.add(uruguaiRB);

        panel.add(argentinaRB);
        panel.add(brasilRB);
        panel.add(uruguaiRB);
        panel.add(bandeiraLabel);
        add(panel);
    }

    private void trocarBandeira(String caminhoDaImagem) {
        bandeiraLabel.setIcon(ImagemUtil.getImage(caminhoDaImagem,200,50));
    }


}
