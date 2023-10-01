package UniversityManagement;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Project extends JFrame implements ActionListener {
Project()
{
setSize(1540,900);	
ImageIcon i1 =new ImageIcon(getClass().getResource("icons/third.jpg"));
Image i2=i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(350,0,200,200);
add(image);

JMenuBar mb=new JMenuBar();
JMenu newInformation=new JMenu("New Information");
newInformation.setForeground(Color.BLUE);
mb.add(newInformation);

JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
facultyInfo.setBackground(Color.WHITE);
facultyInfo.addActionListener(this);
newInformation.add(facultyInfo);

JMenuItem StudentInfo=new JMenuItem("New Student Information");
StudentInfo.setBackground(Color.WHITE);
StudentInfo.addActionListener(this);
newInformation.add(StudentInfo);

//Details 
JMenu details=new JMenu("View Details");
details.setForeground(Color.RED);
mb.add(details);

JMenuItem facultydetails=new JMenuItem("View Faculty Details");
facultydetails.setBackground(Color.WHITE);
facultydetails.addActionListener(this);
details.add(facultydetails);


JMenuItem Studentdetails=new JMenuItem("View Student Details");
Studentdetails.setBackground(Color.WHITE);
Studentdetails.addActionListener(this);
details.add(Studentdetails);

//leave
JMenu leave=new JMenu("Apply Leave");
leave.setForeground(Color.BLUE);
mb.add(leave);

JMenuItem facultyleave=new JMenuItem("Faculty Leave");
facultyleave.setBackground(Color.WHITE);
facultyleave.addActionListener(this);
leave.add(facultyleave);

JMenuItem Studentleave=new JMenuItem("Student Leave");
Studentleave.setBackground(Color.WHITE);
Studentleave.addActionListener(this);

leave.add(Studentleave);

//leave details
JMenu leavedetails=new JMenu("Leave Details");
leavedetails.setForeground(Color.RED);
mb.add(leavedetails);

JMenuItem facultyleavedetails=new JMenuItem("View Faculty details");
facultyleavedetails.setBackground(Color.WHITE);
facultyleavedetails.addActionListener(this);
leavedetails.add(facultyleavedetails);

JMenuItem Studentleavedetails=new JMenuItem("View Student details");
Studentleavedetails.setBackground(Color.WHITE);
Studentleavedetails.addActionListener(this);
leavedetails.add(Studentleavedetails);

//Exam
JMenu Exam=new JMenu("Examination");
Exam.setForeground(Color.BLUE);
mb.add(Exam);

JMenuItem Examinationdetails=new JMenuItem("Examination results");
Examinationdetails.setBackground(Color.WHITE);
Examinationdetails.addActionListener(this);
Exam.add(Examinationdetails);

JMenuItem entermarks=new JMenuItem("Enter Marks");
entermarks.setBackground(Color.WHITE);
entermarks.addActionListener(this);
Exam.add(entermarks);

//updateinfo
JMenu updateinfo=new JMenu("Update details");
updateinfo.setForeground(Color.RED);
mb.add(updateinfo);

JMenuItem Updatefacultyinfo=new JMenuItem("Update Faculty Details");
Updatefacultyinfo.setBackground(Color.WHITE);
Updatefacultyinfo.addActionListener(this);
updateinfo.add(Updatefacultyinfo);

JMenuItem Updatestudentinfo=new JMenuItem("Update Student Details");
Updatestudentinfo.setBackground(Color.WHITE);
Updatestudentinfo.addActionListener(this);
updateinfo.add(Updatestudentinfo);

//fee

JMenu fee=new JMenu("Fee details");
fee.setForeground(Color.BLUE);
mb.add(fee);

JMenuItem feestructure=new JMenuItem("Fee Structure");
feestructure.setBackground(Color.WHITE);
feestructure.addActionListener(this);
fee.add(feestructure);

JMenuItem feeform=new JMenuItem("Student fee form");
feeform.setBackground(Color.WHITE);
feeform.addActionListener(this);
fee.add(feeform);

//utility

JMenu utility=new JMenu("Utility");
utility.setForeground(Color.RED);
mb.add(utility);

JMenuItem notepad=new JMenuItem("Notepad");
notepad.setBackground(Color.WHITE);
notepad.addActionListener(this);
utility.add(notepad);

JMenuItem calc=new JMenuItem("Calculator");
calc.setBackground(Color.WHITE);
calc.addActionListener(this);
utility.add(calc);
//about
JMenu about=new JMenu("About");
about.setForeground(Color.blue);
mb.add(about);

JMenuItem ab=new JMenuItem("About");
ab.setBackground(Color.WHITE);
ab.addActionListener(this);
about.add(ab);

//Exit

JMenu exit=new JMenu("Exit");
exit.setForeground(Color.RED);
mb.add(exit);

JMenuItem ex=new JMenuItem("Exit");
notepad.setBackground(Color.WHITE);
ex.addActionListener(this);
exit.add(ex);

setJMenuBar(mb);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
	String msg=ae.getActionCommand();
	if(msg.equals("Exit"))
	{
		setVisible(false);
	}
	else if(msg.equals("Calculator"))
	{
		try
		{
			Runtime.getRuntime().exec("calc.exe");
		}catch(Exception e)
			{
				
			}
		}
	else if(msg.equals("Notepad"))
	{
		try
		{
			Runtime.getRuntime().exec("notepad.exe");
		}catch(Exception e)
			{
				
			}
		}	else if(msg.equals("New Faculty Information"))
		{
			new AddTeacher();
		}else if(msg.equals("New Student Information"))
		{
			new AddStudent();
		}
		else if(msg.equals("View Faculty Details"))
		{
			new TeacherDetails();
		}
		else if(msg.equals("View Student Details"))
		{
			new StudentDetails();
		}
		else if(msg.equals("Faculty Leave"))
		{
			new TeacherLeave();
		}

		else if(msg.equals("Student Leave"))
		{
			new StudentLeave();
		}
		else if(msg.equals("View Faculty details"))
		{
			new TeacherLeaveDetails();
		}

		else if(msg.equals("View Student details"))
		{
			new StudentLeaveDetails();
		}
		else if(msg.equals("Update Faculty Details"))
		{
			new UpdateTeacher();
		}

		else if(msg.equals("Update Student Details"))
		{
			new UpdateStudent();
		}
		else if(msg.equals("Enter Marks"))
		{
			new EnterMarks();
		}
		else if(msg.equals("Examination results"))
		{
			new ExaminationDetails();
		}
		else if(msg.equals("Fee Structure"))
		{
			new FeeStructure();
		}
		else if(msg.equals("About"))
		{
			new About();
		}
		else if(msg.equals("Student fee form"))
		{
			new StudentFeeForm();
		}


	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
new Project();
	}
}