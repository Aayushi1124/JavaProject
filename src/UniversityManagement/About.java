package UniversityManagement;
 import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;
public class About extends JFrame {
About()
{
	setSize(700,500);
	setLocation(400,150);
	getContentPane().setBackground(Color.WHITE);
	
	ImageIcon i1 =new ImageIcon(getClass().getResource("icons/about.jpg"));
	Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	image.setBounds(350,0,300,200);
	add(image);

	
	 JLabel heading =new JLabel("<html>University<br/Management System</html>");
     heading.setBounds(70,20,300,130);
     heading.setFont(new Font("Tahoma", Font.BOLD, 34));
     add(heading);

     JLabel name =new JLabel("Developed By:Aayushi Ghatiya");
     name.setBounds(70,220,550,40);
     name.setFont(new Font("Tahoma", Font.BOLD, 28));
     add(name);
     
     JLabel rollno =new JLabel("Roll number:22CSA5MCA1001");
     rollno .setBounds(70,280,550,40);
     rollno .setFont(new Font("Tahoma", Font.BOLD, 28));
     add(rollno );
     
     JLabel contact=new JLabel("Contact:aayushighatiya1124@gmail.com");
     contact .setBounds(70,340,550,40);
     contact.setFont(new Font("Tahoma", Font.BOLD, 20));
     add(contact );
     

     
	setLayout(null);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new About();
	}

}
