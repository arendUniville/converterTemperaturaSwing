
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField tempCelsius;
    private JLabel testeLabel;


    public LoginFrame(){

        setTitle("Converão de temperatura");
        setSize(300,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        configurarLayout();
        setVisible(true);

    }

    private void configurarLayout() {

        JPanel painel = new JPanel();

        tempCelsius = new JTextField();
        tempCelsius.setColumns(15);
        tempCelsius.setToolTipText("Informe a temperatura");


        JButton botaoKelvin = new JButton("Kelvin");
        JButton botaoFahrenheit  = new JButton("Fahrenheit");

        // Padrão Observer
        botaoKelvin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarKelvin();
            }
        });


        botaoFahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFahrenheit();
            }
        });





        testeLabel = new JLabel();

        painel.add(new JLabel("Indique a temperatura em celsius"));
        painel.add(tempCelsius);
        
        painel.add(botaoKelvin);
        painel.add(botaoFahrenheit);

        painel.add(testeLabel);

        painel.setBorder(BorderFactory
                 .createCompoundBorder(BorderFactory.createEmptyBorder(20,20,20,20)
                 ,BorderFactory.createTitledBorder("Converter Temperatura")));

        add(painel);
    }

    private void mostrarKelvin() {

        Integer intCelsius = Integer.parseInt(tempCelsius.getText());  

        double resultadoKelvin = intCelsius + 273.15;

        testeLabel.setText(resultadoKelvin+tempCelsius.getText());

    }


    private void mostrarFahrenheit() {

        Integer intCelsius = Integer.parseInt(tempCelsius.getText());  

        double resultadoFahrenheit = (intCelsius * 1.8) + 32;


        testeLabel.setText(resultadoFahrenheit+tempCelsius.getText());
    }

}
