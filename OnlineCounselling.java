
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;

public class StuDetails extends JFrame{

    // Contructor 

    public StuDetails(){

        JFrame jf = new JFrame();

        // Register User Label

        JLabel r_fname= new JLabel("FIRST NAME");
        JLabel r_lname= new JLabel("LAST NAME");
        JLabel r_sex= new JLabel("GENDER");
        JLabel r_phone= new JLabel("Roll No.");
        JLabel r_dob=new JLabel("DOB");
        JLabel r_email= new JLabel("EMAIL ADDRESS");
        //JLabel r_psd= new JLabel("PASSWORD");
        //JLabel r_cpsd= new JLabel("CONFIRM PASSWORD");
        
       
       
        
        // Register User TextFields

        JTextField r_fname_textf =  new JTextField();
        JTextField r_lname_textf =  new JTextField();
        JTextField r_email_textf =  new JTextField();
        JTextField r_psd_textf =  new JTextField();
        JTextField r_cpsd_textf =  new JTextField();
        JTextField r_phone_textf =  new JTextField();

        // Register User Radio Button

        JRadioButton male=new JRadioButton("MALE");
        JRadioButton female=new JRadioButton("FEMALE");
        //JRadioButton transgender=new JRadioButton("OTHER");

        ButtonGroup sex=new ButtonGroup();
        sex.add(female);
        sex.add(male);

        // Register User Register Button

        JButton r_register_btn = new JButton("REGISTER");
        JButton r_reset_btn = new JButton("Submit");
        jf.add(r_register_btn);
        jf.add(r_reset_btn);

        // Login User Label
        
        JLabel l_email= new JLabel("EMAIL ADDRESS");
        JLabel l_psd= new JLabel("PASSWORD");
        JLabel l_appid= new JLabel("APPLICATION ID");

        // Login User TextFields

        JTextField l_email_textf =  new JTextField();
        JTextField l_psd_textf =  new JTextField();
        JTextField l_appid_textf =  new JTextField();

        // Login User Login Button

		JButton l_login_btn = new JButton("LOGIN");
        JButton l_signup_btn = new JButton("SIGNUP");
        jf.add(l_login_btn);jf.add(l_signup_btn);


        // Setbounds and Frame add for Register user

        r_fname.setBounds(40,60,130,30);
        jf.add(r_fname);
        r_fname_textf.setBounds(170,60,166,30);
        jf.add(r_fname_textf);
        r_lname.setBounds(40,100,130,30);
        jf.add(r_lname);
        r_lname_textf.setBounds(170,100,166,30);
        jf.add(r_lname_textf);
        r_email.setBounds(40,140,130,30);
        jf.add(r_email);
        r_email_textf.setBounds(170,140,166,30);
        jf.add(r_email_textf);
        r_psd.setBounds(40,180,130,30);
        jf.add(r_psd);
        r_psd_textf.setBounds(170,180,166,30);
        jf.add(r_psd_textf);
        r_cpsd.setBounds(40,220,130,30);
        jf.add(r_cpsd);
        r_cpsd_textf.setBounds(170,220,166,30);
        jf.add(r_cpsd_textf);
        r_phone.setBounds(40,260,130,30);
        jf.add(r_phone);
        r_phone_textf.setBounds(170,260,166,30);
        jf.add(r_phone_textf);
        r_sex.setBounds(40,300,130,30);
        jf.add(r_sex);
        male.setBounds(170,300,60,30);
        female.setBounds(227,300,70,30);
        transgender.setBounds(299,300,80,30);
        male.setSelected(true);
        jf.add(male);
        jf.add(female);
        jf.add(transgender);
        
        r_dob.setBounds(40,340,130,30);
        jf.add(r_dob);
        String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String months[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        String years[]={"2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995"};
        JComboBox day=new JComboBox<String>(days);
        JComboBox month=new JComboBox<String>(months);
        JComboBox year=new JComboBox<String>(years);
        day.setBounds(170,344,50,20);
        month.setBounds(230,344,50,20);
        year.setBounds(290,344,60,20);
        jf.add(day);jf.add(month);jf.add(year);

        r_register_btn.setBounds(80,410,100,30);
        r_reset_btn.setBounds(190,410,100,30);
        

        // Setbounds and Frame add for Login user
        
        l_email.setBounds(410,60,130,30);
        jf.add(l_email);
        l_email_textf.setBounds(540,60,166,30);
        jf.add(l_email_textf);
        l_psd.setBounds(410,100,130,30);
        jf.add(l_psd);
        l_psd_textf.setBounds(540,100,166,30);
        jf.add(l_psd_textf);
        l_appid.setBounds(410,140,130,30);
        jf.add(l_appid);
        l_appid_textf.setBounds(540,140,166,30);
        jf.add(l_appid_textf);


        l_login_btn.setBounds(440,190,100,30);
        l_signup_btn.setBounds(550,190,100,30);



        // College Select Label 

        JLabel clg_select = new JLabel("SELECT COLLEGE");
        JLabel stream_select = new JLabel("SELECT STREAM");

        // College Select Button

        JButton add_btn = new JButton("ADD");
        JButton delete_btn = new JButton("DELETE");
        JButton reset_btn = new JButton("RESET");
        JButton pup_btn = new JButton("PRIORITY UP");
        JButton pdn_btn = new JButton("PRIORITY DOWN");

        // College Select Setbounds and frame add

        clg_select.setBounds(410, 250, 100, 30);
        stream_select.setBounds(410, 290, 100, 30);
        add_btn.setBounds(410, 330, 127, 30);
        delete_btn.setBounds(410, 370, 127, 30);
        reset_btn.setBounds(410, 410, 127, 30);
        pup_btn.setBounds(410, 450, 127, 30);
        pdn_btn.setBounds(410, 490, 127, 30);
        jf.add(clg_select);jf.add(stream_select);


        // College Select Combobox, setbounds and frame add

        String colleges[] = {"Apc ray Polytechnic","Ajc bose Polytechnic","Central Calcutta","Calcutta Technical School"};
        String streams[] = {"EE","ME","CE","CST","EIE","FPT"};
        JComboBox college=new JComboBox<String>(colleges);
        JComboBox stream=new JComboBox<String>(streams);
        JTextField textarea= new JTextField();
        college.setBounds(540,250,166,30);
        stream.setBounds(540,290,166,30);
        textarea.setBounds(540,330,166,190);
        jf.add(college);jf.add(stream);jf.add(add_btn);jf.add(delete_btn);jf.add(reset_btn);jf.add(pup_btn);jf.add(pdn_btn);
        jf.add(textarea);

        // Add Header
        JLabel header = new JLabel("Online Counselling Application Form",JLabel.CENTER);
        header.setVerticalAlignment(JLabel.TOP);
        header.setFont(new Font("Verdana", Font.BOLD, 24));
        header.setPreferredSize(new Dimension(250, 100));
        header.setForeground(new Color(102,0,102));
        header.setBackground(new Color(100, 20, 70));
        jf.add(header);

        // Set Frame size 

        jf.setSize(790,600);

		jf.setVisible(true);               
    } 

    // Main static method
	
	public static void main(String [] args){

        // Call to the default contructor StuDetails

		StuDetails o = new StuDetails();
		o.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
