package Project_by_Group8;

import javax.swing.*;
import java.awt.*;

class Check_Event
{
    JFrame f;
    JLabel l1, l2,l3,l4,l5,l6,l7;
    Check_Event()
    {
        f = new JFrame("Check Movies List");

        l1 = new JLabel("MOVIE MANAGEMENT SYSTEM");
        l2 = new JLabel("Here is the list of movies which are running now");
        l3 = new JLabel("⦾ KFG 2");
        l4 = new JLabel("⦾ VENOM 2");
        l5 = new JLabel("⦾ MORBIUS");
        l6 = new JLabel("⦾ NO WAY HOME");
        l7 = new JLabel("⦾ DOCTOR STRANGE MULTIVERSE OF MADNESS");

        l1.setFont(new Font("Serif", Font.BOLD, 35));
        l2.setFont(new Font("Serif", Font.PLAIN, 30));
        l3.setFont(new Font("Serif", Font.PLAIN, 24));
        l4.setFont(new Font("Serif", Font.PLAIN, 24));
        l5.setFont(new Font("Serif", Font.PLAIN, 24));
        l6.setFont(new Font("Serif", Font.PLAIN, 24));
        l6.setFont(new Font("Serif", Font.PLAIN, 24));
        l7.setFont(new Font("Serif", Font.PLAIN, 24));

        l1.setBounds(130,30,600,30);
        l2.setBounds(100,100,600,35);
//        l3.setBounds(430,250,220,30);

        l3.setBounds(100,170,600,40);
        l4.setBounds(100,210,600,40);
        l5.setBounds(100,250,600,40);
        l6.setBounds(100,290,600,40);
        l7.setBounds(100,330,600,40);
/*        l8.setBounds(130,180,600,10);
        l9.setBounds(130,190,600,10);*/

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
/*        f.add(l8);
        f.add(l9);*/

        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);

    }

}


public class Check_Event_List
{
    public static void main(String[] args)
    {
        Check_Event c1 = new Check_Event();
    }

}
