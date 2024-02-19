import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws ParseException {

        //Declarar elementos
        JLabel titleLabel                       = new JLabel("Calculadora de média de 50 números.");
        JTextField fieldTypedNumber    = new JTextField("");
        JLabel infoLabel                        = new JLabel("1/50.");
        JButton buttonCalculateAction           = new JButton("Add. próx número");

        //Declarar + configurar JFrame
        JFrame mainFrame = new JFrame("Média - Atividade Descomplica");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        //Definições de posição dos elementos
        titleLabel.setBounds            (40, 20,    400, 20);
        infoLabel.setBounds             (40, 50,    400, 20);
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

        //Cálculo da média
        int idx = 0;
        ArrayList<Integer> inputNumbers = new ArrayList<>();

        buttonCalculateAction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer typedNumber = Integer.parseInt(fieldTypedNumber.getText());
                System.out.println(typedNumber);
                infoLabel.setText(inputNumbers.size()+2+"/50");
                inputNumbers.add(typedNumber);
                fieldTypedNumber.setText("");
                System.out.println(inputNumbers.size());
                if(inputNumbers.size()>=2){
                    mainFrame.remove(fieldTypedNumber);
                    mainFrame.remove(buttonCalculateAction);
                    mainFrame.revalidate();
                    mainFrame.repaint();

                }
            }
        });




    }
}