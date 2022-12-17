package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(tfYear.getText());

                    if (year % 4 != 0) {
                        JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                    } else if (year % 100 != 0) {
                        JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                    } else if (year % 400 != 0) {
                        JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                    } else
                        JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                } catch (Exception c){
                    JOptionPane.showMessageDialog(null, "Please enter a Year");
                }
            }
        });
    }

    public static void main(String[] args) {
            LeapYearGUI lpy = new LeapYearGUI();
            lpy.setTitle("Leap Year");
            lpy.setContentPane(lpy.panel1);
            lpy.setSize(700,400);
            lpy.setVisible(true);
            lpy.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
