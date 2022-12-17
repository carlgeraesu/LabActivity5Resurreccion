package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            try{
                    int n1 = Integer.parseInt(tfNumber1.getText());
                    int n2 = Integer.parseInt(tfNumber2.getText());
                    int res;

                    if (cbOperations.getSelectedItem().equals('+')) {
                       res = n1 + n2;
                       lblResult.setText(String.valueOf(res));
                    } else if (cbOperations.getSelectedItem().equals('-')) {
                        res = n1 - n2;
                        lblResult.setText(String.valueOf(res));
                    } else if (cbOperations.getSelectedItem().equals('*')) {
                        res = n1 * n2;
                        lblResult.setText(String.valueOf(res));
                    }  else if (cbOperations.getSelectedItem().equals('/')){
                        res = n1 / n2;
                        lblResult.setText(String.valueOf(res));
                    }

            } catch (Exception c){
                JOptionPane.showMessageDialog(null, "Please enter numbers");
            }

            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI clc = new SimpleCalcGUI();
        clc.cbOperations.addItem('+');
        clc.cbOperations.addItem('-');
        clc.cbOperations.addItem('*');
        clc.cbOperations.addItem('/');
        clc.setTitle("Simple Calculator");
        clc.setContentPane(clc.panel1);
        clc.setSize(700,700);
        clc.setVisible(true);
        clc.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
