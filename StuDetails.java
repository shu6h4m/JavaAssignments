import java.awt.*;
import java.awt.event.WindowAdapter;
class StuDetails
{
    Frame f;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
    TextField t1,t2,t3,t4,t5,t6,t7;
    Button b1;
    TextArea area;
    Checkbox rb1,rb2;
    Choice c;
    public StuDetails()
    {
        c=new Choice();
        c.add("Haryana");
        c.add("Punjab");
        f=new Frame("Submitted by Shubham Sharma");
        l1=new Label("Student Detail");
        l2=new Label("First Name:"); 
        l3=new Label("Last Name:"); 
        l4=new Label("Gender:");
        l5=new Label("Roll No:");
        l6=new Label("DOB:");
        l7=new Label("E-Mail_Id:");
        l8=new Label("Address:");
        l9=new Label("State:");
        rb1= new Checkbox("Male");
        rb2=new Checkbox("Female");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t4=new TextField("Choice(DD)");
        t5=new TextField("Choice(MM)");
        t6=new TextField("Choice(YY)");
        t7=new TextField();
        b1=new Button("Submit");
        area=new TextArea("Text Area");
        l1.setBounds(300, 50, 100, 20);
        l2.setBounds(50, 100, 100, 20);
        t1.setBounds(150, 100, 100, 20);
        l3.setBounds(300,100,100,20);
        t2.setBounds(400, 100, 100, 20);
        l4.setBounds(50, 150, 100, 20);
        rb1.setBounds(150, 150, 100, 20);
        rb2.setBounds(300,150,100,20);
        l5.setBounds(50,200,100,20);
        t3.setBounds(150,200,100,20);
        l6.setBounds(50,250,100,20);
        t4.setBounds(150,250,100,20);
        t5.setBounds(250,250,100,20);
        t6.setBounds(350,250,100,20);
        l7.setBounds(50,300,100,20);
        t7.setBounds(150,300,100,20);
        l8.setBounds(50,350,100,20);
        area.setBounds(150, 350, 300,100);
        l9.setBounds(50,450,100,20);
        c.setBounds(150,450,100,20);
        b1.setBounds(250, 500, 100, 20);
        f.add(b1);
        f.add(c);
        f.add(l9);
        f.add(l8);
        f.add(area);
        f.add(t7);
        f.add(l7);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(rb1);
        f.add(rb2);
        f.add(l5);
        f.add(t3);
        f.add(l6);
        f.setSize(700,700);  
        f.setLayout(null);  
        f.setVisible(true); 
    }
}

public class AssgAWT {

    public static void main(String[] args) {
        new StuDetails();
    }
    
}
