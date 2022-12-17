package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

class Nochoices extends Exception {
    public Nochoices(String s) {
        super(s);
    }
}
public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderGUI() {

        ButtonGroup rb = new ButtonGroup();
        rb.add(rbNone);
        rb.add(rb5);
        rb.add(rb10);
        rb.add(rb15);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try{
                    float res = 0;
                    int y = 0;

                    if (cPizza.isSelected() == true) {
                        res += 100;
                        y++;
                    }  if (cSoftDrinks.isSelected() == true) {
                        res += 55;
                        y++;
                    }  if (cFries.isSelected() == true) {
                        res += 65;
                        y++;
                    }  if (cBurger.isSelected() == true) {
                        res += 80;
                        y++;
                    }  if (cTea.isSelected() == true) {
                        res += 50;
                        y++;
                    }  if (cSundae.isSelected() == true) {
                        res += 40;
                        y++;
                    }

                    int z = 0;

                    if(rb5.isSelected() == true){
                        res *= 0.95;
                        z++;
                        JOptionPane.showMessageDialog(btnOrder,"The total price is Php " + String.format("%.2f", res));
                    } else if (rb10.isSelected() == true) {
                        res *= 0.90;
                        z++;
                        JOptionPane.showMessageDialog(btnOrder, "The total price is Php " + String.format("%.2f",res));
                    } else if (rb15.isSelected() == true) {
                        res *= 0.85;
                        z++;
                        JOptionPane.showMessageDialog(btnOrder, "The total price is Php " + String.format("%.2f",res));
                    } else if (rbNone.isSelected() == true) {
                        z++;
                        JOptionPane.showMessageDialog(btnOrder, "The total price is Php " + String.format("%.2f",res));
                    }

                if(y == 0 && z == 1){
                    throw (new Nochoices("Please pick an order/discount."));
                } else if(y > 0 && z == 0){
                    throw (new Nochoices("Please pick a discount."));
                } else if (y == 0 && z == 0) {
                    throw (new Nochoices("Please choose from the choices."));
                }

            } catch (Exception c){
                JOptionPane.showMessageDialog(null, c.getMessage());
            }
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderGUI fdo = new FoodOrderGUI();
        fdo.setTitle("Food Ordering System");
        fdo.setContentPane(fdo.panel1);
        fdo.setSize(700,700);
        fdo.setVisible(true);
        fdo.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
