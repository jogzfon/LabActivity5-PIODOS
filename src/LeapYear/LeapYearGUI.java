package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.panel1);
        app.setSize(500, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");

        app.btnCheckYear.addActionListener(e -> {
            if(app.btnCheckYear.isEnabled()){
                String userInput = app.tfYear.getText();
                int year = Integer.parseInt(userInput);
                if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                    JOptionPane.showMessageDialog(new JFrame(),"Leap year");
                }
                else{
                    JOptionPane.showMessageDialog(new JFrame(),"Not a leap year");
                }
            }
        });
    }
}
