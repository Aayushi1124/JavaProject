package UniversityManagement;
import java.awt.*;
import javax.swing.*;

public class Splash extends JFrame implements Runnable{
	Thread t;
Splash()
{
	ImageIcon i1 =new ImageIcon(getClass().getResource("icons/first.jpg"));
	Image i2=i1.getImage().getScaledInstance(1000,700,Image.SCALE_DEFAULT);
	ImageIcon i3=new ImageIcon(i2);
	JLabel image=new JLabel(i3);
	add(image);
	
	t= new Thread(this);
	t.start();
	
	setVisible(true);
	
	int x=1;
	
	 for(int i=2; i<=700; i+=4,x+=1)
	 {
	setLocation(850-((i+x)/2),420-(i/2));
	setSize(i,i);
	
	try
	{
		Thread.sleep(10);
	}
			catch(Exception e)
			{
			}
			
			}
}
public void run() {
	try
	{
		Thread.sleep(7000);	
		setVisible(false);
		//next frame
new login();
	}
	catch(Exception e)
	{
		
	}
	
}
	public static void main(String[] args) {
     new Splash();
	}

}
