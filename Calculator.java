import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
		JTextField F1,F2,F3;
		JButton B1,B2,B3,B4,B5;
		JFrame f;
		
		public Calculator()
		{
			f=new JFrame("my Calculator");
			
			F1=new JTextField();
			F1.setBounds(100,100,200,50);
			
			F2=new JTextField();
			F2.setBounds(100,160,200,50);
			
			F3=new JTextField();
			F3.setBounds(100,220,200,50);
			
			
			B1=new JButton("+");
			B1.setBounds(100,300 , 50, 50);
			
		    B2 = new JButton("-");
			B2.setBounds(150,300 , 50, 50);
			
			B3=new JButton("*");
			B3.setBounds(200,300 , 50, 50);
			
			B4=new JButton("/");
			B4.setBounds(250,300 , 50, 50);
			
			
			B5=new JButton("%");
			B5.setBounds(300,300 , 50, 50);
			
			B1.addActionListener(this);
			B2.addActionListener(this);
			B3.addActionListener(this);
			B4.addActionListener(this);
			B5.addActionListener(this);
			
			f.add(F1);
			f.add(F2);
			f.add(F3);
			f.add(B1);
			f.add(B2);
			f.add(B3);
			f.add(B4);
			f.add(B5);
			
			
			f.setSize(500,500);
			f.setLayout(null);
			f.setVisible(true);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String s1=F1.getText();
			String s2=F2.getText();
			
			int a= Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=0;
			
			if(e.getSource()==B1)
			{
				c=a+b;
			}
			
			else if(e.getSource()==B2)
				{
					c=a-b;
				}
			
				else 
					if(e.getSource()==B3)
					{
						c=a*b;
					}
			
					else if(e.getSource()==B4)
						{
							c=a/b;
						}
					else if(e.getSource()==B5)
						{
							c=(a/b)*100;
					
						}
			
			String res=String.valueOf(c);
			F3.setText(res);
			}
		public static void main(String[] args) {
			new Calculator();
		}
		

}
