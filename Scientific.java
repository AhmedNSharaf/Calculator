import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Scientific implements ActionListener {

    JFrame frame = new JFrame();
    JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[26];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton, equButton, delButton,switchLeft,switchRight, clrButton, negButton
    ,sinButton,cosButton,tanButton,factorialButton,logButton,eButton
    ,sinInverseButton,cosInverseButton,tanInverseButton,main
    ;
	JPanel panel;
    ////////////////////////////////////////
    Font myFont = new Font("Ink Free", Font.BOLD , 18);
    ///////////////////////////////////////
    
    double num1=0,num2=0,result=0;
	char operator;
    Scientific(){

        /////////////////////////////////////////
        
        
        
        /////////////////////////////////////////
        frame=new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);   
        frame.setVisible(true);    
        ////////////////////////////////////////
        
        
        
        ////////////////////////////////////////
        textfield = new JTextField();
        textfield.setBounds(5, 20, 395, 65);
        textfield.setFont(myFont);
		textfield.setForeground(new Color(243,146,49));;
        textfield.setEditable(false);
		textfield.setBackground(Color.black);
        /////////////////////////////////////////
        
        
        
        /////////////////////////////////////////
        ImageIcon image = new ImageIcon("calculator.png");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame
        /////////////////////////////////////////
        
        
        
        /////////////////////////////////////////
        //buttons
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		switchLeft = new JButton("<");
		switchRight = new JButton(">");
		main = new JButton("Main");
		clrButton = new JButton("Clear");
        logButton = new JButton("Log");
        factorialButton = new JButton("n!");
		negButton = new JButton("(-)");
        sinButton = new JButton("Sin");
        sinInverseButton = new JButton("Sin-1");
        cosButton = new JButton("Cos");
        cosInverseButton = new JButton("Cos-1");
        tanButton = new JButton("Tan");
        tanInverseButton = new JButton("Tan-1");

        ////////////////////////////////////////////
        
        
        
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
        functionButtons[8] = switchLeft;
        functionButtons[9] = switchRight;
        functionButtons[10] = negButton;
        functionButtons[11] = sinButton;
        functionButtons[12] = sinInverseButton;
        functionButtons[13] = cosButton;
        functionButtons[14] = cosInverseButton;
        functionButtons[15] = tanButton;
        functionButtons[16] = tanInverseButton;
        functionButtons[17] = factorialButton;
        functionButtons[18] = logButton;
        functionButtons[19] = main;



        ///////////////////////////////////////////
        
        
        
        ///////////////////////////////////////////
        for(int i =0;i<20;i++) {
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
        
        
        
        ////////////////////////////////////////////
        delButton.setBounds(75,425,87,50);
		switchLeft.setBounds(163, 425, 43, 50);
		switchRight.setBounds(210, 425, 43, 50);
		clrButton.setBounds(255,425,90,50);
        factorialButton.setBounds(346, 425, 55, 50);
        logButton.setBounds(5, 425, 66, 50);
        sinButton.setBounds(5, 101, 95, 49);
        cosButton.setBounds(5, 150, 95, 49);
        tanButton.setBounds(5, 200, 95, 49);
        sinInverseButton.setBounds(5, 250, 95, 49);
        cosInverseButton.setBounds(5, 300, 95, 49);
        tanInverseButton.setBounds(5, 350, 95, 49);
        main.setBounds(100, 480, 210, 30);

        ////////////////////////////////////////////
        
        
        
        ////////////////////////////////////////////
        panel = new JPanel();
		panel.setBounds(100, 100, 300, 300);
		panel.setLayout(new GridLayout(4,4,2,2));	
		panel.setBackground(Color.black);	//set backGround color for panel
		////////////////////////////////////////////
		
        
        
        ////////////////////////////////////////////
		frame.getContentPane().setBackground(Color.BLACK);  //change background color
        ////////////////////////////////////////////


        
        ////////////////////////////////////////////
        for(int k=0;k<10;k++)
		{
			numberButtons[k].setBackground(Color.black);  //control color of functionButtons
			numberButtons[k].setForeground(new Color(243,146,49));	//control color of numberButtons
		}
		for(int k=0;k<20;k++)
		{
			functionButtons[k].setBackground(Color.black);  //control color of functionButtons
			functionButtons[k].setForeground(new Color(243,146,49));    //control color of functionButtons
		}
        /////////////////////////////////////////////
        
        


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
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
        /////////////////////////////////////////////



        ////////////////////////////////////////////
        frame.add(sinButton);
        frame.add(cosButton);
        frame.add(tanButton);
        frame.add(sinInverseButton);
        frame.add(cosInverseButton);
        frame.add(tanInverseButton);
        frame.add(logButton);
        frame.add(factorialButton);
        frame.add(delButton);
		frame.add(switchLeft);
		frame.add(switchRight);
        frame.add(clrButton);
        frame.add(main);
        frame.add(textfield);
        frame.add(panel);
        frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);
        ////////////////////////////////////////////////



    }
    double temp = 0;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        for(int i=0;i<10;i++) 
        {
            if(e.getSource() == numberButtons[i])
            {
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
        ////////////////////////////////////////////
        if (e.getSource()==sinButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.sin(Math.toRadians(temp))));
        }
        if (e.getSource()==cosButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.cos(Math.toRadians(temp))));        }
        if (e.getSource()==tanButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.tan(Math.toRadians(temp))));        }
        if (e.getSource()==sinInverseButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.toDegrees(Math.asin(temp))));        }
        if (e.getSource()==cosInverseButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.toDegrees(Math.acos(temp))));        }
        if (e.getSource()==tanInverseButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.toDegrees((Math.atan(temp)))));        }
        if (e.getSource()==logButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.log10(temp)));        }
        if (e.getSource()==factorialButton) 
        {
            temp= Double.parseDouble(textfield.getText());
            textfield.setText(String.valueOf(Math.log10(temp)));
        }
        ///////////////////////////////////////////////
        if(e.getSource()==equButton) {
            num2=Double.parseDouble(textfield.getText());
        
		switch(operator) 
        {
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
		if(e.getSource()==switchLeft)
        {
			frame.dispose();	// allow opening the seconed screen in the same screen 
            Calculator Calculator = new Calculator();		//open the main screen
        }
		if(e.getSource()==switchRight)
        {
			frame.dispose();	// allow opening the seconed screen in the same screen 
            Shapes shapes = new Shapes();		//open the main screen
        }
        if(e.getSource()==main)
        {
			Main main = new Main();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
    }
	
}
