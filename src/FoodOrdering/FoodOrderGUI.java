package FoodOrdering;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.text.DecimalFormat;

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

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.panel1.setBorder(new EmptyBorder(50, 50, 50,50));
        app.setTitle("Food Ordering System");
        ButtonGroup discount = new ButtonGroup();
        discount.add(app.rbNone);
        discount.add(app.rb5);
        discount.add(app.rb10);
        discount.add(app.rb15);

        app.btnOrder.addActionListener(e -> {
            if(app.btnOrder.isEnabled()){
                int orders = 0;
                if(app.cPizza.isSelected()){
                    orders += 100;
                }
                if(app.cBurger.isSelected()){
                    orders += 80;
                }
                if(app.cFries.isSelected()){
                    orders += 65;
                }
                if(app.cSoftDrinks.isSelected()){
                    orders += 55;
                }
                if(app.cTea.isSelected()){
                    orders += 50;
                }
                if(app.cSundae.isSelected()){
                    orders += 40;
                }
                float total;
                float deducted;
                //Checks Discount Selected
                if(discount.isSelected(app.rbNone.getModel())){
                    total = orders;
                    JOptionPane.showMessageDialog(new JFrame(),"The total price is Php "+df.format(total));
                }
                if(discount.isSelected(app.rb5.getModel())){
                    deducted = orders * 0.05f;
                    total = orders-deducted;
                    JOptionPane.showMessageDialog(new JFrame(),"The total price is Php "+df.format(total));
                }
                if(discount.isSelected(app.rb10.getModel())){
                    deducted = orders * 0.10f;
                    total = orders-deducted;
                    JOptionPane.showMessageDialog(new JFrame(),"The total price is Php "+df.format(total));
                }
                if(discount.isSelected(app.rb15.getModel())){
                    deducted = orders * 0.15f;
                    total = orders-deducted;
                    JOptionPane.showMessageDialog(new JFrame(),"The total price is Php "+df.format(total));
                }
            }
        });
    }
}
