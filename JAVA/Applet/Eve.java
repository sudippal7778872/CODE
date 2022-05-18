import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
//<applet code="Eve.java" width="350"height="450"></applet>
public class Eve extends Applet
{
TextField t1,t2,t3;
Label l1,l3,l2,l4;
Button button1,button2,button3,button4;
public void init()
{
t1=new TextField();
t2=new TextField();
t3=new TextField();
l1=new Label("First number");
l2=new Label("Second number");
l3=new Label("Answer = ");
l4=new Label("Sudip Pal");
button1=new Button("Addition");
button2=new Button("Multiplication");
button3=new Button("Division");
button4=new Button("Substruction");
setLayout(null);
t1.setBounds(1,1,300,100);
l1.setBounds(10,120,100,25);
l2.setBounds(10,155,100,25);
t2.setBounds(130,120,75,25);
t3.setBounds(130,155,75,25);
button1.setBounds(130,185,75,25);
button2.setBounds(130,220,75,25);
button3.setBounds(130,255,75,25);
button4.setBounds(130,290,75,25);
l4.setBounds(250,400,100,30);
add(l1);
add(l2);
add(button1);
add(button2);
add(button3);
add(button4);
add(t1);
add(t2);
add(t3);
add(l4);
button1.addActionListener(new Addition());
button2.addActionListener(new Multiplication());
button3.addActionListener(new Division());
button4.addActionListener(new Substruction());
}
public class Addition implements ActionListener
{
int a,b,c;
public void actionPerformed(ActionEvent e)
{
a=Integer.parseInt(t2.getText());
b=Integer.parseInt(t3.getText());
c=a+b;
t1.setText("Answer = "+c);
}
}
public class Multiplication implements ActionListener
{
int a,d,c;
public void actionPerformed(ActionEvent b)
{
a=Integer.parseInt(t2.getText());
d=Integer.parseInt(t3.getText());
c=a*d;
t1.setText("Answer =  "+c);
}
}
public class Division implements ActionListener
{
int a,b,c,d;
public void actionPerformed(ActionEvent e)
{
a=Integer.parseInt(t2.getText());
b=Integer.parseInt(t3.getText());
c=a/b;
d=a%b;
t1.setText("Quotient = " + c +"  remeinder =" +d);
}
}
public class Substruction implements ActionListener
{
int a,b,c,d;
public void actionPerformed(ActionEvent d)
{
a=Integer.parseInt(t2.getText());
b=Integer.parseInt(t3.getText());
c=a-b;
t1.setText("Answer = "+c);
}
}
}
