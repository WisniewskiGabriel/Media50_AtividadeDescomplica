import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {

        //Declarar elementos
        JLabel titleLabel = new JLabel("Calculadora de média de 50 números.");
        MaskFormatter numberMask = new MaskFormatter("#######");
        JFormattedTextField fieldTypedNumber = new JFormattedTextField(numberMask);
        JLabel infoLabel = new JLabel("1/50.");
        JButton buttonCalculateAction = new JButton("Calcular");

        //Declarar + configurar JFrame
        JFrame mainFrame = new JFrame("Média - Atividade Descomplica");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        //Definições de posição dos elementos
        titleLabel.setBounds            (40, 20,    400, 20);
        infoLabel.setBounds            (40, 50,    400, 20);
        buttonCalculateAction.setBounds (40, 150,   100, 30);
        fieldTypedNumber.setBounds      (40, 80,    200, 30);

        //Tamanho do JFrame
        mainFrame.setSize(400, 300);


        //Adicionar elementos ao JFrame
        mainFrame.add(titleLabel);
        mainFrame.add(buttonCalculateAction);
        mainFrame.add(fieldTypedNumber);
        mainFrame.add(infoLabel);
        mainFrame.setVisible(true);


        //Ações...
        buttonCalculateAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                titleLabel.setText("Calculado");
            }
        });

    }





}