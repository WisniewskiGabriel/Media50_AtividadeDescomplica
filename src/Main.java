import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.nio.DoubleBuffer;
import java.text.ParseException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws ParseException {

        //CONTROLE DE QUANTOS NÚMEROS PODERÃO SER CALCULADOS:
        int MAX_AMOUNT = 50;

        //Declarar elementos
        Font fontForLabel = new Font("Dialog", Font.PLAIN, 20);
        JLabel titleLabel = new JLabel("Calculadora de média de " + MAX_AMOUNT + " números.");
        JTextField fieldTypedNumber = new JTextField("");
        JLabel infoLabel = new JLabel("1/" + MAX_AMOUNT);
        JButton buttonCalculateAction = new JButton("Add. próx número");

        //Tamanhos da fonte dos labels
        infoLabel.setFont(fontForLabel);
        titleLabel.setFont(fontForLabel);

        //Declarar + configurar JFrame
        JFrame mainFrame = new JFrame("Média - Atividade Descomplica");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        //Definições de posição dos elementos
        titleLabel.setBounds(40, 20, 400, 20);
        infoLabel.setBounds(40, 50, 400, 20);
        buttonCalculateAction.setBounds(40, 150, 100, 30);
        fieldTypedNumber.setBounds(40, 80, 200, 30);

        //Tamanho do JFrame
        mainFrame.setSize(600, 300);
        mainFrame.setLocationRelativeTo(null);


        //Adicionar elementos ao JFrame
        mainFrame.add(titleLabel);
        mainFrame.add(buttonCalculateAction);
        mainFrame.add(fieldTypedNumber);
        mainFrame.add(infoLabel);

        mainFrame.setVisible(true);

        //Cálculo da média

        ArrayList<Double> inputNumbers = new ArrayList<>();

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String strOfTypedNumber = fieldTypedNumber.getText();
                    strOfTypedNumber = strOfTypedNumber.replace(",", ".");
                    Double typedNumber = Double.parseDouble(strOfTypedNumber);
                    infoLabel.setText(inputNumbers.size() + 2 + "/" + MAX_AMOUNT);
                    inputNumbers.add(typedNumber);
                    fieldTypedNumber.setText("");

                    //Checar se a qtd. máxima foi atingida
                    if (inputNumbers.size() >= MAX_AMOUNT) {

                        //Remover elementos de input
                        mainFrame.remove(fieldTypedNumber);
                        mainFrame.remove(buttonCalculateAction);
                        mainFrame.remove(infoLabel);

                        //Somar e calcular valor da média
                        Double finalAverage = 0.0;
                        for (Double number : inputNumbers) {
                            finalAverage = finalAverage + number;
                        }
                        finalAverage = finalAverage / inputNumbers.size();

                        //Exibir resultado
                        JLabel labelResult = new JLabel("A média entre os " + inputNumbers.size() + " números é " + finalAverage);
                        labelResult.setBounds(40, 120, 500, 30);
                        labelResult.setFont(fontForLabel);
                        mainFrame.add(labelResult);

                        //Add botão de fechar
                        JButton buttonCloseWindow = new JButton("Encerrar programa");
                        buttonCloseWindow.setBounds(40, 180, 500, 30);
                        mainFrame.add(buttonCloseWindow);
                        buttonCloseWindow.addActionListener(x -> {
                            mainFrame.dispose();
                        });

                        //Forçar update do frame mudança dos elementos
                        mainFrame.revalidate();
                        mainFrame.repaint();
                    }
                } catch (NumberFormatException | NullPointerException err) {
                    String strMsgErro = fieldTypedNumber.getText().length() > 0 ?
                            "O input '" + fieldTypedNumber.getText() +
                                    "' não é válido.\n\nExemplos de formato correto:" +
                                    "\n1    1,1     1.1     -1      -1,1"
                            :
                            "Input vazio. É necessário inserir algum valor no campo";
                    JOptionPane.showMessageDialog(null, strMsgErro);
                    fieldTypedNumber.setText("");
                }
            }
        };

        buttonCalculateAction.addActionListener(actionListener);

        // Adicionar keypress de enter para confirmar envio de número digitado
        fieldTypedNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Mesma coisa que o click do botão
                    actionListener.actionPerformed(new ActionEvent(fieldTypedNumber, ActionEvent.ACTION_PERFORMED, null));
                }
            }
        });
    }
}
