
import javax.swing.*;
//import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
public class wordcount implements ActionListener{ 
 		JLabel header=new JLabel(" Word Counter ");
		JLabel header1=new JLabel(" Welcome To Word Counter ...!!");
 		JTextField ip=new JTextField();
 		JButton submit=new JButton("COUNT");
 		Font font=(new Font("Monospaced",Font.BOLD,30));
		Font font1=(new Font("Serif Bold",Font.BOLD,60));
		Font font3=(new Font("Dialog",Font.BOLD,30));
 		JLabel  result=new JLabel(" ");	
 	
 	wordcount()
 	{
 	    JFrame Mframe=new JFrame();
 		Mframe.setLayout(null);
 		Mframe.setSize(1000,1000);
 		Mframe.setVisible(true);

 		
 		
 		Mframe.getContentPane().setBackground(Color.GRAY);
 		header.setFont(font1);
 		header.setBounds(610,150,700,100);
 		header.setForeground(Color.BLACK);

		header1.setFont(font3);
 		header1.setBounds(610,50,700,60);
 		header1.setForeground(Color.YELLOW);

 		ip.setBounds(310,300,1100,50);
 		ip.setFont(font);
 		Mframe.add(header);
		Mframe.add(header1);
 		Mframe.add(ip);
 		
 		submit.setBounds(605,500,370,60);
		submit.setBackground(Color.ORANGE);
		
		submit.setFont(font3);
		Mframe.add(submit);
		submit.addActionListener(this);
		
		result.setBounds(680,600,1000,70);
		result.setForeground(Color.blue);
		result.setFont(font3);
		Mframe.add(result);
 		
 		
 		Mframe.setDefaultCloseOperation(Mframe.EXIT_ON_CLOSE);	
 	}
 	public  void actionPerformed(ActionEvent e)
 	{
 		String str=ip.getText();
	  	// String str4=str.replace("[\n]+", " ");
	  	// System.out.println (str4);
	   	String stringUser= str.replaceAll("( )+", " ");
	  	//System.out.println (stringUser);
  		String str1=stringUser.trim();
  		//	System.out.println (str1);
  		int cnt=0;
  		for(int i=0;i<str1.length();i++)
  		{
  			char ch=str1.charAt(i);
  			if(ch==' ')
  			{
  				cnt++;
  			}
  			else if(ch==','||ch=='.'||ch=='?')
  			{
  				continue;
  			}
  		}
  		String dd=String.valueOf(cnt+1);
  		result.setText("Total Words are: "+dd);
 	}	
    public static void main (String[] args) {
 		wordcount t=new wordcount();	
    }
}