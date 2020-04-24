import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FullCalculator extends JFrame implements ActionListener
{
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmul,bdiv,bC,bequal,bdot,bexit;
	JTextField t1;
	JPanel p1,p2,p3;
	String firstno, sign;
	FullCalculator()
	{
	
		t1=new JTextField(20);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		bplus=new JButton("+");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		bminus=new JButton("-");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		bmul=new JButton("*");
		bdot=new JButton(".");
		b0=new JButton("0");
		bC=new JButton("C");
		bdiv=new JButton("/");
		bequal=new JButton("=");
		bexit=new JButton("EXIT");
		setLayout(new GridLayout(3,1));
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		p2.setLayout(new GridLayout(4,4));
		p3.setLayout(new GridLayout(1,2));
		p1.setSize(250,100);
		p2.setSize(250,300);
		p3.setSize(250,100);
		add(p1);
		add(p2);
		add(p3);
	
		p1.add(t1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(bplus);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(bminus);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bmul);
		p2.add(bdot);
		p2.add(b0);
		p2.add(bC);
		p2.add(bdiv);
		
		p3.add(bexit);
		p3.add(bequal);
		setSize(250,400);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bplus.addActionListener(this);
		bminus.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bdot.addActionListener(this);
		bC.addActionListener(this);
		bequal.addActionListener(this);
		bexit.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		
		if(o==bexit)
		{
		
			System.exit(0);
		}
		if(o==b1)
		{
			t1.setText(t1.getText()+"1");
		}
		if(o==b2)
		{
			t1.setText(t1.getText()+"2");
		}
		if(o==b3)
		{
			t1.setText(t1.getText()+"3");
		}
		if(o==b4)
		{
			t1.setText(t1.getText()+"4");
		}
		if(o==b5)
		{
			t1.setText(t1.getText()+"5");
		}
		if(o==b6)
		{
			t1.setText(t1.getText()+"6");
		}
		if(o==b7)
		{
			t1.setText(t1.getText()+"7");
		}
		if(o==b8)
		{
			t1.setText(t1.getText()+"8");
		}
		if(o==b9)
		{
			t1.setText(t1.getText()+"9");
		}
		if(o==b0)
		{
			t1.setText(t1.getText()+"0");
		}
		if(o==bdot)
		{
			t1.setText(t1.getText()+".");
		}
		if(o==bplus)
		{
			firstno=t1.getText();
			t1.setText("");
			sign="plus";
			
		}
		if(o==bminus)
		{
			firstno=t1.getText();
			t1.setText("");
			sign="minus";
			
		}
		if(o==bmul)
		{
			firstno=t1.getText();
			t1.setText("");
			sign="mul";
			
		}
		if(o==bdiv)
		{
			firstno=t1.getText();
			t1.setText("");
			sign="div";
			
		}
		if(o==bequal)
		{
			float a=0,b=0,c=0;
			try
			{
				a=Float.parseFloat(firstno);
				b=Float.parseFloat(t1.getText());
			}
			catch(Exception e1)
			{
				t1.setText("ERROR");
			}
					
			if(sign=="plus")
			{
				c=a+b;
			
			String ans=Float.toString(c);
			t1.setText(ans);
			}

			else if(sign=="minus")
			{
				c=a-b;
			        String ans=Float.toString(c);
				t1.setText(ans);
			}

			else if(sign=="mul")
			{
				c=a*b;
			
			String ans=Float.toString(c);
			t1.setText(ans);
			}
			
			else if(sign=="div")
			{
				c=a/b;
			
			String ans=Float.toString(c);
			t1.setText(ans);
			}
		


		}
	}	
	public static void main(String args[])
	{
		FullCalculator c1=new FullCalculator();
	}

}		
					
	

