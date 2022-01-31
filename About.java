package Project_by_Group8;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;    

class Aboutt extends JFrame
{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l69;

	public Aboutt()
	{
		l1 = new JLabel("ABOUT US");
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();

		l2.setText("1) 	We are having an experince of 10 years and are trust worthy");
		l3.setText("2) 	We have a vast network of Theatres and partners who ");
		l4.setText("help us provide the best and most cost effective experiences");
		l5.setText("to our clients");
		l6.setText("3) We follow safety guidlines from governament in preventing ");
		l7.setText("covid transmission");
		l8.setText("4) At last trust us and book an movies in our website which");
		l9.setText("shows you the difference from others which you won't be regretted");
		l1.setFont(new Font("Serif", Font.BOLD, 35));
		l2.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l3.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l4.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l5.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l6.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l7.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l8.setFont(new Font("Seriffff", Font.PLAIN, 20));
		l9.setFont(new Font("Seriffff", Font.PLAIN, 20));

		l1.setBounds(290,30,200,30);
		l2.setBounds(100,100,700,30);
		l3.setBounds(100,150,700,25);
		l4.setBounds(100,170,700,25);
		l5.setBounds(100,190,700,25);
		l6.setBounds(100,240,700,25);
		l7.setBounds(100,260,700,25);
		l8.setBounds(100,310,700,25);
		l9.setBounds(100,330,700,25);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		

		getContentPane().setBackground(Color.orange);
		setLayout(null);
		setSize(800,600);
		setVisible(true);
	}
}

public class About 
{
	public static void main(String[] args) 
	{
		Aboutt ab = new Aboutt();
		
	}

}