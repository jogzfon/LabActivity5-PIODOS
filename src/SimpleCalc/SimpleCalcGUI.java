package SimpleCalc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.panel1.setBorder(new EmptyBorder(30, 30, 30,30));
        app.setTitle("Simple Calculator");
    }
}
