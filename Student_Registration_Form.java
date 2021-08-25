import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Student_Registration_Form {
	Frame mainFrame;
	Panel mainPanel;
	public static void main(String args[])
	{
			Student_Registration_Form r1=new Student_Registration_Form();
			r1.MayLabel();
			r1.MyForm();
			r1.SubmitButton();
	}
	public Student_Registration_Form()
	{
		mainFrame=new Frame();
		mainFrame.setVisible(true);
		mainFrame.setSize(600, 600);
		mainFrame.addWindowListener(new
		WindowAdapter()
		{
			public void
			windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		);

		mainPanel=new Panel();
		mainPanel.setBackground(Color.cyan);
		mainPanel.setLayout(new
		FlowLayout(FlowLayout.CENTER,1000,30));
		mainFrame.add(mainPanel);
		}
		public void MayLabel()
		{
		Panel p1=new Panel();
		p1.setLayout(new FlowLayout());
		Label l1=new Label();
		Font f1=new Font("Times New Roman",Font.BOLD,24);
		l1.setFont(f1);
		l1.setText("Student Registration");
		l1.setForeground(Color.MAGENTA);
		p1.add(l1);
		mainPanel.add(p1);
		}
		public void MyForm()
		{
		Panel p1=new Panel();
		GridLayout grid=new GridLayout(12,2);
		grid.setVgap(30);
		p1.setLayout(grid);
		Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		TextField t1,t2,t3,t4,t5,t7,t8,t9,t10;
		Choice c6,c8;
		l1=new Label("Student's Name :");
		l2=new Label("UserName :");
		l3=new Label("UserPwd :");
		l4=new Label("Confirm Pwd :");
		l5=new Label("Gender :");
		l6=new Label("Class :");
		l7=new Label("User Address :");
		l8=new Label("City :");
		l9=new Label("User Phone :");
		l10=new Label("User Email :");
		l11=new Label("");
		

		t1=new TextField();
		t1.setSize(150,30);
		t2=new TextField();
		t2.setSize(100,30);
		t3=new TextField();
		t3.setSize(100,30);
		t4=new TextField();
		t4.setSize(100,30);
		
		t7=new TextField();
		t7.setSize(150,60 );
		t8=new TextField();
		t8.setSize(100,30 );
		t9=new TextField();
		t9.setSize(100,30 );
		t10=new TextField();
		t10.setSize(100,30 );
		
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox cb51=new Checkbox("Male",cg,true);
		Checkbox cb52=new Checkbox("Female",cg,false);
//		cb4.setSize(100, 30);
//		cb4.setLocation(210,130);
		
		
		c6=new Choice();
		c6.addItem("First Year");
		c6.addItem("Second Year");
		c6.addItem("Third Year");
		c6.addItem("Final Year");
		
		c8=new Choice();
		c8.addItem("Pune");
		c8.addItem("Mumbai");
		c8.addItem("Delhi");
		c8.addItem("Nashik");

		
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);
		p1.add(l5);
		p1.add(cb51);
		p1.add(l11);
		p1.add(cb52);
		
		p1.add(l6);
		p1.add(c6);
		p1.add(l7);
		p1.add(t7);
		p1.add(l8);
		p1.add(c8);
		p1.add(l9);
		p1.add(t9);
		p1.add(l10);
		p1.add(t10);
		

		p1.setSize(600, 600);
		mainPanel.add(p1);
		}
		public void SubmitButton()
		{
		Panel p1=new Panel();
		p1.setLayout(new FlowLayout());
		Button btn1=new Button("Submit");
		p1.add(btn1);
		mainPanel.add(p1);
		}
		}