import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	JButton oneButton,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton,zeroButton,dotButton,clrButton,delButton,
	addButton,subButton,productButton,divButton,equalButton;
	float firstValue,secondValue,result;
	String operation;
	
	public Calculator() {
		jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(370,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,30,300,40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		jf.add(displayLabel);
		
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,90,50,50);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 25));
		sevenButton.addActionListener(this);  
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(90,90,50,50);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 25));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(150,90,50,50);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 25));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,150,50,50);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 25));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(90,150,50,50);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 25));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(150,150,50,50);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 25));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,210,50,50);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 25));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(90,210,50,50);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(150,210,50,50);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 25));
	    threeButton.addActionListener(this);
		jf.add(threeButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(30,270,50,50);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 25));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(90,270,50,50);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 25));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		//****************************************************************
		equalButton=new JButton("=");
		equalButton.setBounds(150,270,50,50);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 25));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(210,90,50,50);
		divButton.setFont(new Font("Arial", Font.PLAIN, 25));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		productButton=new JButton("*");
		productButton.setBounds(210,150,50,50);
		productButton.setFont(new Font("Arial", Font.PLAIN, 25));
		productButton.addActionListener(this);
		jf.add(productButton);
		
		addButton=new JButton("+");
		addButton.setBounds(210,210,50,50);
		addButton.setFont(new Font("Arial", Font.PLAIN, 25));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		subButton=new JButton("-");
		subButton.setBounds(210,270,50,50);
		subButton.setFont(new Font("Arial", Font.PLAIN, 25));
		subButton.addActionListener(this);
		jf.add(subButton);
		//*******************************************************************
		
		clrButton=new JButton("C");
		clrButton.setBounds(210,330,50,50);
		clrButton.setFont(new Font("Arial", Font.PLAIN, 20));
		clrButton.addActionListener(this);
		jf.add(clrButton);
		
		delButton=new JButton("del");
		delButton.setBounds(150,330,50,50);
		delButton.setFont(new Font("Arial", Font.PLAIN, 12));
		delButton.addActionListener(this);
		jf.add(delButton);
		
		
		
	}
	public static void main(String[] arg) {
		new Calculator();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==oneButton) {
			displayLabel.setText(displayLabel.getText()+"1");
		}else if(e.getSource()==twoButton) {
			displayLabel.setText(displayLabel.getText()+"2");
		}else if(e.getSource()==threeButton) {
			displayLabel.setText(displayLabel.getText()+"3");
		}else if(e.getSource()==fourButton) {
			displayLabel.setText(displayLabel.getText()+"4");
		}else if(e.getSource()==fiveButton) {
			displayLabel.setText(displayLabel.getText()+"5");
		}else if(e.getSource()==sixButton) {
			displayLabel.setText(displayLabel.getText()+"6");
		}else if(e.getSource()==sevenButton) {
			displayLabel.setText(displayLabel.getText()+"7");
		}else if(e.getSource()==eightButton) {
			displayLabel.setText(displayLabel.getText()+"8");
		}else if(e.getSource()==nineButton) {
			displayLabel.setText(displayLabel.getText()+"9");
		}else if(e.getSource()==zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
		}else if(e.getSource()==dotButton) {
			displayLabel.setText(displayLabel.getText()+".");
		}
		
		else if(e.getSource()==addButton) {
			firstValue=Float.parseFloat(displayLabel.getText());
			displayLabel.setText("");
			operation="+";
		}else if(e.getSource()==subButton) {
			firstValue=Float.parseFloat(displayLabel.getText());
			displayLabel.setText("");
			operation="-";
		}else if(e.getSource()==productButton) {
			firstValue=Float.parseFloat(displayLabel.getText());
			displayLabel.setText("");
			operation="*";
		}else if(e.getSource()==divButton) {
			firstValue=Float.parseFloat(displayLabel.getText());
			displayLabel.setText("");
			operation="/";
		}
		
		else if(e.getSource()==clrButton) { 
			displayLabel.setText("");
		}else if(e.getSource()==delButton) {
			String value= displayLabel.getText();
			if (value=="") {
				displayLabel.setText("");
			}else {
				StringBuffer v= new StringBuffer(value);  
				v.deleteCharAt(v.length()-1);  
				displayLabel.setText(v+"");
			}
			
				
		}else {
			secondValue=Float.parseFloat(displayLabel.getText());
			if(operation=="+") {
				result=firstValue+secondValue;
			}else if(operation=="-") {
				result=firstValue-secondValue;
			}else if(operation=="*") {
				result=firstValue*secondValue;
			}else {
				result=firstValue/secondValue;
			}
			displayLabel.setText(result+"");
		}
		
	}
	
	
}
