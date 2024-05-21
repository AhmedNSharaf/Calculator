import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[12];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton, equButton, delButton,switchRight,switchLeft, clrButton,main, negButton;
	JPanel panel;
//	JButton switchButton = new JButton("<=>");


    


    Font myFont = new Font("Ink Free", Font.BOLD , 20);
	
    double num1=0,num2=0,result=0;
	char operator;

	//////////////////////////////////////////////////////////////////////////


	//////////////////////////////////////////////////////////////////////////

    Calculator(){
        LineBorder lineBorder =new LineBorder(Color.white, 8, true);
        frame=new JFrame("Standard Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        ////////////////////////////////////////////		
        textfield = new JTextField();
        textfield.setBounds(40, 25, 320, 50);
        textfield.setFont(myFont);
		textfield.setForeground(new Color(243,146,49));;
        textfield.setEditable(false);
		textfield.setBackground(Color.black);
        ////////////////////////////////////////////
		ImageIcon image = new ImageIcon("calculator.png");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame
		////////////////////////////////////////////


        //buttons
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		switchRight = new JButton(">");
		switchLeft = new JButton("<");
		negButton = new JButton("(-)");
		main = new JButton("Main");
        ////////////////////////////////////////////
        //functions button
        functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = switchRight;
		functionButtons[9] = switchLeft;
		functionButtons[10] = negButton;
		functionButtons[11] = main;
        ////////////////////////////////////////////
        for(int i =0;i<12;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i =0;i<10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
        ////////////////////////////////////////////
		//numberButtons[0].setBounds(50, 430, 150, 50);//
        delButton.setBounds(40,410,110,50);
		switchRight.setBounds(205, 410, 45, 50);
		switchLeft.setBounds(155, 410, 45, 50);
		clrButton.setBounds(255,410,105,50);
		main.setBounds(100, 465, 210, 40);
        ////////////////////////////////////////////		
        panel = new JPanel();
		panel.setBounds(40, 100, 320, 300);
		panel.setLayout(new GridLayout(4,4,2,2));	
		panel.setBackground(Color.black);	//set backGround color for panel
		
		
		frame.getContentPane().setBackground(Color.BLACK);  //change background color
		
		for(int k=0;k<10;k++)
		{
			numberButtons[k].setBackground(Color.black);  //control color of functionButtons
			numberButtons[k].setForeground(new Color(243,146,49));	//control color of numberButtons
		}
		for(int k=0;k<12;k++)
		{
			functionButtons[k].setBackground(Color.black);  //control color of functionButtons
			functionButtons[k].setForeground(new Color(243,146,49));    //control color of functionButtons
		}
		/////////////////////////////////////////////


        panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		numberButtons[0].setSize(300, 50);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);

		
		frame.add(panel);
        frame.add(delButton);
		frame.add(switchLeft);
		frame.add(switchRight);
		frame.add(main);
        frame.add(clrButton);
        frame.add(textfield);
		frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);
    }
	


    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
        if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='+';
			textfield.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='-';
			textfield.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='*';
			textfield.setText("");
		}
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator ='/';
			textfield.setText("");
		}
        if(e.getSource()==equButton) {
			num2=Double.parseDouble(textfield.getText());
			
			switch(operator) {
			case'+':
				result=num1+num2;
				break;
			case'-':
				result=num1-num2;
				break;
			case'*':
				result=num1*num2;
				break;
			case'/':
				result=num1/num2;
				break;
			}
            textfield.setText(String.valueOf(result));
			num1=result;
		}
        if(e.getSource()==clrButton) {
			textfield.setText("");
		}
		if(e.getSource()==delButton) {
			String string = textfield.getText();
			textfield.setText("");
			for(int i=0;i<string.length()-1;i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
        if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
		}
		if(e.getSource()==switchRight)
        {
			Scientific scientific = new Scientific();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
		if(e.getSource()==switchLeft)
        {
			Main main = new Main();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
		if(e.getSource()==main)
        {
			Main main = new Main();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        
        

    }
}
