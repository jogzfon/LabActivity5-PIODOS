package FoodOrdering;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.panel1.setBorder(new EmptyBorder(30, 50, 30,50));
    }
}
