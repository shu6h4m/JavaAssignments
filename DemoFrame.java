import java.awt.*;
import java.awt.event.*;

public class DemoFrame extends Frame implements
ActionListener{

TextField name, pass;

void showFrame()

{

Label namep = new Label("Name: ", Label.RIGHT);

Label passp = new Label("Password: ", Label.RIGHT);

name = new TextField(12);

pass = new TextField(8);

pass.setEchoChar('?');

setLayout(new FlowLayout());

add(namep);
add(name);

add(passp);
add(pass);

name.addActionListener(this);
pass.addActionListener(this);
setSize(700,400);
setTitle("Student Details");
setVisible(true); 
}

public void actionPerformed(ActionEvent ae)

{

System.out.println(ae);

}

public static void main(String args[]) {

DemoFrame obj=new DemoFrame();

obj.showFrame();
obj.setDefaultCloseOperation();

}

}