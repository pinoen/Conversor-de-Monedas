package Ejemplo;

import javax.swing.*;
import java.awt.*;

public class EjemploSwingUsage {
    public static void main(String[] args) {

        // componente JFrame (ejemplo - java swing)
        JFrame miFrame = new JFrame("Ejemplo - Java Swing");
        miFrame.setSize(500,500);

        // componente JPanel
        JPanel miPanel = new JPanel();
        miPanel.setSize(300,300);

        // centrar componentes de JPnal
        miPanel.setLayout(new GridBagLayout());

        // componenete JTextField
        JLabel miLabel = new JLabel();
        miLabel.setText("Opinion sobre Java Swing: ");

        // componente JTextArea
        JTextArea miTextArea = new JTextArea(5,20);

        // agregar componentes de Label y Text al JPanel
        miPanel.add(miLabel);
        miPanel.add(miTextArea);

        // agregar JPanel a JFrame
        miFrame.add(miPanel);

        miFrame.setVisible(true);

    }
}
