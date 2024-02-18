import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        //Declarar elementos visuais
        Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20); // 10 pixels of padding on the left
        JLabel label = new JLabel("Calculadora de média de 50 números.");
        JButton button = new JButton("Calcular");

        //Declarar + configurar JFrame
        JFrame frame = new JFrame("Média - Atividade Descomplica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        //Adicionar elementos ao JFrame
        label.setBorder(emptyBorder);
        frame.add(label, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Calculado");
            }
        });

    }





}