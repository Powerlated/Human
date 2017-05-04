package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Brian on 5/3/2017.
 */
public class GUI {
    private JButton startSimuationButton;
    private JButton stopSimulationButton;
    private JPanel panel1;

    public GUI() {
        startSimuationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimulationHandler.initiate();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Initializing GUI...");
        System.out.println();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("Human Simulator");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
