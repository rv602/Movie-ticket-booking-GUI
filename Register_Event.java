package Project_by_Group8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Register_an_Event implements ActionListener
{
    JFrame f ;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,lx1,lx2,lx3,lx4,lx5,lx6,lx7,lx8,lx9,lx0,lx69;
    JButton b1,b2;
    // JTextField t1,t2;//,t3,t4,t5,t6;
    JTextField t1;//,t3,t4,t5,t6;
    JOptionPane O1;
    JComboBox c1,c2,c3,c4,c5,c6;

    public Register_an_Event()
    {
        f = new JFrame("Movie Ticket Booking");
        l1 = new JLabel("MOVIE MANAGMENT SYSTEM");

        l7 = new JLabel("Movies:-");
        l2 = new JLabel("Theatre:-");
        l8 = new JLabel("Mode:-");
        l3 = new JLabel("No. of People:-");
        l5 = new JLabel("Seat numbers");
        l6 = new JLabel("Date and Time");
        // l69 = new JLabel("Seats");
        lx1 = new JLabel();
        lx2 = new JLabel();
        lx3 = new JLabel();
        lx4 = new JLabel();
        lx5 = new JLabel();
        lx6 = new JLabel();
        lx7 = new JLabel();
        lx8 = new JLabel();
        lx9 = new JLabel();
        lx0 = new JLabel();
        lx69 = new JLabel();

        String [] Movies = {"", "• Venom-2", "• KFG-2", "• Morbius", "• No Way Home", "• Doctor Strange Multiverse of Madness"};
        String [] Venue = {"", "• Cinepolis", "• INOX", "• Cinemax", "• Cinestar", "• IMAX"};
        String [] Mode = {"", "• 2D", "• 3D", "• 3D Max", "• 4DX"};
        String [] No_Seats = {"• 1", "• 2", "• 3", "• 4", "• 5", "• 6", "• 7", "• 8", "• 9", "• 10"};
        String [] date = {"• 5-02-2022", "• 7-02-2022", "• 8-02-2022", "• 9-02-2022", "• 10-02-2022", "• 11-02-2022"};
        String [] time = {"• 9:00 AM" , "• 11:30 AM", "• 1:00 PM"};

        String x69 = "    A  B   C  D  E  F  G  H   I";
        String x1 = "1  ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅";
        String x2 = "2  ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌";
        String x3 = "3  ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅";
        String x4 = "4  ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌";
        String x5 = "5  ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅";
        String x6 = "6  ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌";
        String x7 = "7  ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅";
        String x8 = "8  ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌";
        String x9 = "9  ✅ ❌ ✅ ❌ ✅ ❌ ✅ ❌ ✅";
        
        String x0 = "E Y E S | T H I S | W A Y |👀";

        // l69.setText(x);     

        lx1.setText(x1);
        lx2.setText(x2);
        lx3.setText(x3);
        lx4.setText(x4);
        lx5.setText(x5);
        lx6.setText(x6);
        lx7.setText(x7);
        lx8.setText(x8);
        lx9.setText(x9);
        lx0.setText(x0);
        lx69.setText(x69);

        c1 = new JComboBox(Movies);
        c2 = new JComboBox(Venue);
        c3 = new JComboBox(Mode);
        c4 = new JComboBox(No_Seats);
        c5 = new JComboBox(date);
        c6 = new JComboBox(time);
        c1.setBounds(350,200,200,30);
        c2.setBounds(350,240,200,30);
        c3.setBounds(350,280,200,30);
        c4.setBounds(350,320,200,30);
        c5.setBounds(350,400,150,30);
        c6.setBounds(525, 400, 150, 30);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.add(c5);
        f.add(c6);

        l4 = new JLabel();
        l4.setText("SELECT DETAILS FOR THE MOVIE:-");


        l1.setFont(new Font("Serif", Font.BOLD, 35));
        l4.setFont(new Font("Serif", Font.PLAIN, 20));
        l7.setFont(new Font("Serif", Font.PLAIN, 18));
        l2.setFont(new Font("Serif", Font.PLAIN, 18));
        l8.setFont(new Font("Serif", Font.PLAIN, 18));
        l3.setFont(new Font("Serif", Font.PLAIN, 18));
        l5.setFont(new Font("Serif", Font.PLAIN, 18));
        l6.setFont(new Font("Serif", Font.PLAIN, 18));

//        c1.setFont(new Font("Serif", Font.PLAIN, 18));


        b1 = new JButton("BOOK");
        b2 = new JButton("CANCEL");

        t1 = new JTextField();
        // t2 = new JTextField();
/*        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();*/

        O1 = new JOptionPane("All fields are mandatory... Please Fill it..");

        l1.setBounds(130,30,600,30);
        l4.setBounds(180,100,370,30);
        l7.setBounds(150,200,200,30);
        l2.setBounds(150,240,200,30);
        l8.setBounds(150,280,200,30);
        l3.setBounds(150,320,200,30);
        l5.setBounds(150,360,200,30);
        l6.setBounds(150,400,200,30);

        // lx1.setBounds(x, y, width, height);
        lx69.setBounds(337, 430, 300, 30);
        lx1.setBounds(337, 460, 300, 30);
        lx2.setBounds(337, 490, 300, 30);
        lx3.setBounds(337, 520, 300, 30);
        lx4.setBounds(337, 550, 300, 30);
        lx5.setBounds(337, 580, 300, 30);
        lx6.setBounds(337, 610, 300, 30);
        lx7.setBounds(337, 640, 300, 30);
        lx8.setBounds(337, 670, 300, 30);
        lx9.setBounds(337, 700, 300, 30);
        lx0.setBounds(337, 730, 300, 30);

        // l69.setBounds(150, 100, 400, 100);


        t1.setBounds(350,360,150,30);
        // t2.setBounds(350,400,150,30);
/*        t3.setBounds(350,280,150,30);
        t4.setBounds(350,320,150,30);
        t5.setBounds(350,360,150,30);
        t6.setBounds(350,400,150,30);*/
        b1.setBounds(250,800,100,30);
        b2.setBounds(430,800,100,30);


        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(l2);
        f.add(l3);
        f.add(l4);

        f.add(t1);
        // f.add(t2);

        f.add(l6);
        f.add(l5);
        f.add(l7);
        f.add(l8);


        f.add(lx1);
        f.add(lx2);
        f.add(lx3);
        f.add(lx4);
        f.add(lx5);
        f.add(lx6);
        f.add(lx7);
        f.add(lx8);
        f.add(lx9);
        f.add(lx0);
        f.add(lx69);
        // f.add(l69);
/*        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);*/

        f.getContentPane().setBackground(Color.orange);
        f.setLayout(null);
        f.setSize(800,1000);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

/*		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == b1)
			{

			}
		}*/

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
            else
            {
                pay pm = new pay();
                // JOptionPane.showMessageDialog(f,"Successfully Registered...");
                f.setVisible(false);
            }


            // USE JDBC concept and store all the data in CUSTOMER_DETAILS table ;
        }
        if(e.getSource() == b2)
        {
            f.setVisible(false);
        }
    }


}

public class Register_Event
{
    public static void main(String[] args)
    {
        Register_an_Event ab = new Register_an_Event();
        // Payment pm = new Payment();
    }

}