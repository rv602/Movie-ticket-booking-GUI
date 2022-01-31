package Project_by_Group8;

// package Project_by_Hari;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JFrame f69 = new JFrame();

class BHIM implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField t1, t2, t3;
    JButton b1, b2;
    
    // JButton card, upi;

    BHIM () {

        f = new JFrame("UPI Payment");
        l1 = new JLabel("UPI Id");
        l2 = new JLabel("UPI code");
        l3 = new JLabel("PIN");
        l4 = new JLabel("UPI Payment");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("PAY NOW");
        b2 = new JButton("CANCEL");

        l1.setFont(new Font("Serif", Font.PLAIN, 20));
        l2.setFont(new Font("Serif", Font.PLAIN, 20));
        l3.setFont(new Font("Serif", Font.PLAIN, 20));
        l4.setFont(new Font("Serif", Font.BOLD, 35));

        l1.setBounds(250, 100, 100, 30);
        l2.setBounds(250, 150, 100, 30);
        l3.setBounds(250, 200, 100, 30);
        l4.setBounds(275, 25, 400, 60);
        t1.setBounds(330, 100, 120, 30);
        t2.setBounds(330, 150, 120, 30);
        t3.setBounds(330, 200, 120, 30);

        b1.setBounds(280, 250, 100, 30);
        b2.setBounds(410, 250, 100, 30);

        f.add(b1);
        f.add(b2);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
;
        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,400);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

        // MyCanvas obj = new MyCanvas();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            // after clicking on b1 -> before exiting the screen validate whether all text fields are filled or not
            if(t1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
            }
            else if (t2.getText().equals("")){
                JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
            }
            else if (t3.getText().equals("")){
                JOptionPane.showMessageDialog(f,"All fields are mandatory... Please Fill it..");
            }
            else
            {
                // f1.setVisible(true); 
                MyCanvas obj = new MyCanvas();
                f.setVisible(false);
                //MyCanvas.MyCanvas();
                // obj.qrCode();
                // f1.add(obj);
                // f1.setVisible(true); 
                //pay pm = new pay();
                //JOptionPane.showMessageDialog(f,"Successfully Paid...");
                
                // MyCanvas m = new MyCanvas();
                // m.paint(g);
                //f.setVisible(false);
            }



            // USE JDBC concept and store all the data in CUSTOMER_DETAILS table ;
        }

        if(e.getSource() == b2)
        {
            f.setVisible(false);
        }
    }
}

public class upi {
    public static void main(String[] args) {
        BHIM ob = new BHIM();
        // MyCanvas obj = new MyCanvas();
    }
}


class MyCanvas extends Canvas {

    // MyCanvas obj = new MyCanvas();
    
    MyCanvas() {
        // f1.setVisible(true); 
        qrCode();
    }
      
    // public void paint(Graphics g) {  
    //     Toolkit t=Toolkit.getDefaultToolkit();  
    //     Image i=t.getImage("qr.jpeg");  
    //     g.drawImage(i, 120,60,this);  
    // }  
    
    public void qrCode() {  
        // MyCanvas obj = new MyCanvas(); 
        JFrame f1=new JFrame("QR code for ticket");
        JLabel l = new JLabel();  
        JLabel i = new JLabel();
        l.setText("Scan this QR code to get your ticket.");  
        l.setFont(new Font("Serif", Font.BOLD, 25));
        l.setBounds(200,500,500,40);
        f1.add(l);
        // f1.add(obj);
        f1.add(new JLabel(new ImageIcon("qr.jpeg")));  
        f1.setSize(800,600);  
        f1.getContentPane().setBackground(Color.orange);
        f1.setVisible(true);  
    }  
}


// f.add(new JLabel(new ImageIcon("qr.jpeg")));