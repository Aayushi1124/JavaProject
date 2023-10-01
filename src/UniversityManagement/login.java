package UniversityManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
	JTextField tfusername,tfpassword;
	JButton login,cancel;
	login()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel busername=new JLabel("UserName");
		busername.setBounds(40,20,100,20);
		add(busername);
		
		 tfusername=new JTextField();
		tfusername.setBounds(150,20,150,20);
		add(tfusername);
		
		JLabel bpassword=new JLabel("Password");
		bpassword.setBounds(40,70,100,20);
		add(bpassword);
		
		 tfpassword=new JPasswordField();
		tfpassword.setBounds(150,70,150,20);
		add(tfpassword);
		
		login=new JButton("Login");
		login.setBounds(40,140,120,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		login.setFont(new Font("serif",Font.BOLD,16));
		add(login);
		

		 cancel=new JButton("Cancel");
		cancel.setBounds(180,140,120,30);
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("serif",Font.BOLD,16));
		add(cancel);
		
		ImageIcon i1 =new ImageIcon(getClass().getResource("icons/second.jpg"));
		Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(350,0,200,200);
		add(image);

		
		setSize(600,300);
	   setLocation(500,250);
	   setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==login)
		{	
			String username=tfusername.getText();
			String password=tfpassword.getText();
			String query ="select * from login where username='"+username+"' and password='"+password+"'";
			try
			{
		ProjectConnection c=new ProjectConnection();
		ResultSet rs=c.s.executeQuery(query);
		if(rs.next())
		{
			setVisible(false);
			new Project();
		}
		else {
			JOptionPane.showMessageDialog(null,"Invalid username or password");
			setVisible(false);
		}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}else if(ae.getSource()==cancel)
		{
			setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new login();
	}
}
