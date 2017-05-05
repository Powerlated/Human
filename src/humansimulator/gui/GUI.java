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
    private JButton addSomethingButton;

    public GUI() {
        JTextArea txtConsole = new JTextArea();
        PrintStream out = new PrintStream(new TextAreaOutputStream(consoleTextArea));
        System.setOut(out);
        System.setErr(out);
        startSimuationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!SimulationHandler.started) {
                    SimulationHandler.initiate();
                    System.out.println("Human Simulator started.");
                } else {
                    System.out.println("Human Simulator already started!");
                }
            }
        });
        addSomethingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddDialog dialog = new AddDialog();
                dialog.setResizable(false);
                dialog.pack();
                dialog.setVisible(true);
                dialog.setSize(new Dimension(194, 116));
                dialog.revalidate();
                dialog.repaint();
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
