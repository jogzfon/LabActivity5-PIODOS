package SimpleCalc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        app.cbOperations.setPrototypeDisplayValue("XXXX");
        app.cbOperations.addItem("*");
        app.cbOperations.addItem("-");
        app.cbOperations.addItem("/");
        app.cbOperations.addItem("+");

        app.tfNumber1.setHorizontalAlignment(JTextField.CENTER);
        app.tfNumber2.setHorizontalAlignment(JTextField.CENTER);
        app.lblResult.setHorizontalAlignment(JTextField.CENTER);
        app.btnCompute.addActionListener(e -> {
            if(app.btnCompute.isEnabled()){
                String num1 = app.tfNumber1.getText();
                String num2 = app.tfNumber2.getText();

                int numerous1 = Integer.parseInt(num1);
                int numerous2 = Integer.parseInt(num2);

                String operation = app.cbOperations.getSelectedItem().toString();
                int total;
                switch (operation){
                    case "*":
                        total = numerous1 * numerous2;
                        app.lblResult.setText(Integer.toString(total));
                        break;
                    case "-":
                        total = numerous1 - numerous2;
                        app.lblResult.setText(Integer.toString(total));
                        break;
                    case "/":
                        total = numerous1 / numerous2;
                        app.lblResult.setText(Integer.toString(total));
                        break;
                    case "+":
                        total = numerous1 + numerous2;
                        app.lblResult.setText(Integer.toString(total));
                        break;
                }
            }
        });
    }
}
