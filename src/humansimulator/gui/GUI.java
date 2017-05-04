package humansimulator.gui;

import humansimulator.SimulationHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

/**
 * Created by Brian on 5/3/2017.
 */
public class GUI {
    private JButton startSimuationButton;
    private JButton stopSimulationButton;
    private JPanel panel;
    private JTextArea consoleTextArea;

    public GUI() {
        JTextArea txtConsole = new JTextArea();
        PrintStream out = new PrintStream(new TextAreaOutputStream(consoleTextArea));
        System.setOut(out);
        System.setErr(out);
        startSimuationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimulationHandler.initiate();
                System.out.println("Human Simulator started.");
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
        frame.setResizable(false);
        frame.setContentPane(new GUI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(new Dimension(616, 512));
    }
}
