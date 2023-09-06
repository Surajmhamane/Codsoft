import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ATMInterface implements ActionListener
{
  TextField Text=new TextField();
  //TextField da=new TextField();
  TextField txt1=new TextField();
 JButton Blabelance=new JButton("Check Blabelance");
 JButton withdraw=new JButton("Withdraw Amount");
 JButton deposite=new JButton("Deposite Amount");
  Label withdraw_Lable=new Label("Enter Amount ");
  //Label dl=new Label("Enter Deposite Amount ");
  Label title=new Label("WELCOME TO ATM");
 public ATMInterface() 
 {
 	
 JFrame Mframe=new JFrame("Simple Calculation Demo");
 
 Mframe.setSize(900,800);
 Mframe.setLayout(null);
 Mframe.setVisible(true);

 Mframe.getContentPane().setBackground(Color.LIGHT_GRAY);

 //create font 
 Font fnt=new Font("Arial",Font.BOLD,20);
 Font fl=new Font("Monospaced",Font.BOLD,30);

 Font ft=new Font("Dialog",Font.BOLD,60);
 //set display possition for controls
title.setFont(ft);
 title.setBounds(460,70,600,60);


 Blabelance.setBounds(650,220,220,37);
 withdraw.setBounds(450,510,220,37);
 deposite.setBounds(770,510,220,37);

  withdraw_Lable.setBounds(430,335,250,30);
  //dl.setBounds(290,520,400,30);
  Text.setBounds(710,330,360,40);
 //da.setBounds(710,520,360,40);

 Blabelance.setFont(fnt);
 withdraw.setFont(fnt);
 deposite.setFont(fnt);
 withdraw_Lable.setFont(fl);
 //dl.setFont(fl);

txt1.setFont(fnt);


 Mframe.add(title);
 Mframe.add(withdraw_Lable);
 //Mframe.add(dl);
 Mframe.add(Text);
 //Mframe.add(da);
 Mframe.add(txt1);
 Mframe.add(Blabelance);
 Mframe.add(withdraw);
 Mframe.add(deposite);

 Blabelance.addActionListener(this);
 withdraw.addActionListener(this);
 deposite.addActionListener(this);

 Mframe.addWindowListener(new WindowAdapter()
 {
 public void windowClosing(WindowEvent e)
 {
 System.exit(1);
 }
 });
 }
 // code to execute after event occure
 double availableBlabelance=5000;
 public void actionPerformed(ActionEvent e)
 {

 if(e.getSource()==Blabelance)
 {

 	JFrame Sframe=new JFrame("Withdraw");
 	Sframe.setVisible(true);
 	Sframe.setLayout(null);
 	Sframe.setSize(500,300);
 	Font font=new Font("Arial",Font.BOLD,35);

	Sframe.getContentPane().setBackground(Color.blue);

 	Label Wlabel=new Label("Your Current Blabelance :- ");
 	Label Blabel=new Label("Rs."+availableBlabelance);
 	Blabel.setFont(font);

  	  Wlabel.setFont(font);
  	  Wlabel.setBounds(30,100,430,30);
	  Wlabel.setForeground(Color.white);
	  Blabel.setForeground(Color.WHITE);
 	  Sframe.add(Wlabel);
 	  Sframe.add(Blabel);
 	  Blabel.setBounds(150,145,200,50);


 }
 else if(e.getSource()==withdraw)
 {
 	String s1=Text.getText();
 	double amt=Double.parseDouble(s1);
 	JFrame Sframe=new JFrame("Withdraw");
 	Sframe.setVisible(true);
 	Sframe.setLayout(null);
 	Sframe.setSize(500,300);
 	Font font=new Font("Arial",Font.BOLD,35);

 	if(amt>availableBlabelance)
 	{
		Sframe.getContentPane().setBackground(Color.WHITE);


 		Label Withdrawa=new Label("Insufficeient Blabelance..!");
  	  Withdrawa.setFont(font);
  	  Withdrawa.setBounds(30,100,430,30);
  	  Sframe.add(Withdrawa);
 	}

 	else
 	{
		Sframe.getContentPane().setBackground(Color.BLUE);
 		availableBlabelance-=amt;
 	

 	  Label Withdraw_money=new Label("Transcantion Successful..!");
 	  Label CURR_bal=new Label("Current Balance Rs"+availableBlabelance);
  	  Withdraw_money.setFont(font);
  	  CURR_bal.setFont(font);
	  CURR_bal.setForeground(Color.white);
	  Withdraw_money.setForeground(Color.white);
  	  Withdraw_money.setBounds(10,100,460,30);
  	  CURR_bal.setBounds(10,150,470,30);
  	  Sframe.add(Withdraw_money);
  	  Sframe.add(CURR_bal);
 	}

 
 }
 else if(e.getSource()==deposite)
  {
  	JFrame Sframe=new JFrame("Withdraw");
 	Sframe.setVisible(true);
 	Sframe.setLayout(null);
 	Sframe.setSize(500,300);
 	Font font=new Font("Arial",Font.BOLD,35);

  	String s3= Text.getText();
 	double amt3=Double.parseDouble(s3);
	Sframe.getContentPane().setBackground(Color.GREEN);

 	availableBlabelance+=amt3;

 	Label Wlabel=new Label("Transcantion Successful..!");
 	
  	  Wlabel.setFont(font);
  	  Wlabel.setBounds(10,100,450,30);
 	  Sframe.add(Wlabel);
 	
 	 }

	}
 public static void main(String[] arg)
 {
 ATMInterface atmObj=new ATMInterface();
 }
}
