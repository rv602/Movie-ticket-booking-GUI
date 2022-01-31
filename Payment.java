package Project_by_Group8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class pay implements ActionListener {
    JFrame f;
    JLabel l1,l2,l3,l4;
    // JTextField t1;
    JButton b1, b2;
    JButton card, upi;
    
    pay()
    {
        f = new JFrame("Payment");
        l1 = new JLabel("MOVIE MANAGMENT SYSTEM");
        l2 = new JLabel("AMOUNT TO BE PAID:-");
        l4 = new JLabel();

        b1 = new JButton("PAY NOW");
        b2 = new JButton("CANCEL");
        //l2.setText();

        card = new JButton("CREDIT/DEBIT (CARD) / NET BANKING");
        upi = new JButton("UPI");

        l1.setFont(new Font("Serif", Font.BOLD, 35));
        l2.setFont(new Font("Serif", Font.PLAIN, 20));
        // l4.setFont(new Font("Serif", Font.BO, 35));

        double cost = ((Math.random() * (500 - 400)) + 400);
        float cs = (float)cost;
        
        String str = String.format("%.02f", cs);

        // String price = Float.toString(str);

        l4 = new JLabel(str);
        l4.setFont(new Font("Serif", Font.PLAIN, 25));

        l1.setBounds(130,30,600,30);
        l2.setBounds(200,150,400,30);
        l4.setBounds(450,150,200,30);


        b1.setBounds(250,240,100,30);
        b2.setBounds(430,240,100,30);

        card.setBounds(210, 340, 380, 30);
        upi.setBounds(210, 380, 380, 30);


        f.add(l1);
        f.add(l2);
        f.add(l4);
        // f.add(t1);

        f.add(b1);
        f.add(b2);

        f.add(card);
        f.add(upi);


        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        card.addActionListener(this);
        upi.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == card)
        {
            Bank bank = new Bank();
        }

        if (e.getSource() == upi)
        {
            BHIM bhim = new BHIM();
            // f.setVisible(false);
            // bhim.setVisible(true);
            // f.setVisible(false);
        }
    }
}

public class Payment
{
    public static void main(String[] args) {
        pay p = new pay();
    }
}