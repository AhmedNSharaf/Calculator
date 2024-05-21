import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangle implements ActionListener {
    JFrame frame;
    JButton[] functionButtons = new JButton[9];
    JButton[] numberButtons = new JButton[10];
    double [] triangleParameters = new double[4];
    String[] message = new String[]{"Enter the width of the side_2","Enter the base","Enter the hieght","Select An Option!"};
    JButton area,perimeter,areaAndPerimeter,main,decButton,delButton,clrButton,setInput,switchLeft;
    JTextField text1,text2 ;
    JPanel panel;
    Font myFont = new Font("Ink Free", Font.BOLD , 25);
    Font myFont1 = new Font("Ink Free", Font.BOLD , 20);
    double result1=0,result2=0;
    int i =0;

    Triangle()
    {
        frame=new JFrame("Triangle Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        text1=new JTextField("Enter the length of the side_1");
        text1.setBounds(30, 25, 350, 50);
        text1.setFont(myFont);
        text1.setEditable(false);
        text1.setBackground(Color.black);
        text1.setForeground(new Color(243,146,49));	//control color of numberButtons
        text2=new JTextField("");
        text2.setBounds(5, 85, 348, 50);
        text2.setFont(myFont);
        text2.setEditable(false);
        text2.setBackground(Color.black);
        text2.setForeground(new Color(243,146,49));	//control color of numberButtons
        

        ImageIcon image = new ImageIcon("calculator.png");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame

        area = new JButton("Area");
        perimeter= new JButton("Perimeter");
        areaAndPerimeter = new JButton("AreaAndPerimeter");
        main = new JButton("Main");
        decButton = new JButton(".");
        delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
        setInput = new JButton(">");
        switchLeft = new JButton("<");

        functionButtons[0] = area;
		functionButtons[1] = perimeter;
        functionButtons[2] = areaAndPerimeter;
		functionButtons[3] = main;
		functionButtons[4] = decButton;
        functionButtons[5] = delButton;
		functionButtons[6] = clrButton;
		functionButtons[7] = setInput;
		functionButtons[8] = switchLeft;

        for(int i =0;i<9;i++) {
			functionButtons[i].addActionListener(this);
            if(i<4||i==8)
            {
                functionButtons[i].setFont(myFont);
            }
            else if(i>3&&i<8)
            {
                functionButtons[i].setFont(myFont1);
            }
			functionButtons[i].setFocusable(false);
		}
		
        for(int k=0;k<9;k++)
		{
			functionButtons[k].setBackground(Color.black);  //control color of functionButtons
			functionButtons[k].setForeground(new Color(243,146,49));    //control color of functionButtons
		}
        for(int i =0;i<10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont1);
			numberButtons[i].setFocusable(false);
		}
        for(int k=0;k<10;k++)
		{
			numberButtons[k].setBackground(Color.black);  //control color of functionButtons
			numberButtons[k].setForeground(new Color(243,146,49));	//control color of numberButtons
		}

        area.setBounds(135,260,150,50);
        perimeter.setBounds(110, 320, 200, 50);
		areaAndPerimeter.setBounds(85, 380, 250, 50);
        main.setBounds(100, 450, 270, 50);
        switchLeft.setBounds(40, 450, 50, 50);
        decButton.setBounds(2, 150, 40, 100);
        delButton.setBounds(303, 150, 100, 50);
        clrButton.setBounds(303, 200, 100, 50);
        setInput.setBounds(357, 85, 45, 50);



        panel = new JPanel();
		panel.setBounds(43, 150, 260, 100);
		panel.setLayout(new GridLayout(2,5,2,2));	
		panel.setBackground(Color.black);	//set backGround color for panel

        panel.add(numberButtons[0]);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);




        frame.getContentPane().setBackground(Color.BLACK);  //change background color
        frame.add(text1);
        frame.add(text2);
        frame.add(panel);
        frame.add(decButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(setInput);
        frame.add(area);
        frame.add(perimeter);
        frame.add(areaAndPerimeter);
		frame.add(main);
        frame.add(switchLeft);
        frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                text2.setText(text2.getText().concat(String.valueOf(i)));
            }
        }    
        if(e.getSource()==decButton) {
            text2.setText(text2.getText().concat("."));
        }    
        if(e.getSource()==clrButton) {
			text2.setText("");
            text1.setText("Enter the length of the side_1");
            i=0;            //علشان يبدا يضيف الارقام فى الاراى من الاول ويبدا يعرض الرسايل من الاول 
		}
        if(e.getSource()==setInput) {
			triangleParameters[i] = Double.parseDouble(text2.getText());
            text1.setText(message[i]);
            i++;
			text2.setText("");
		}
		if(e.getSource()==delButton) {
			String string = text2.getText();
			text2.setText("");
			for(int i=0;i<string.length()-1;i++) {
				text2.setText(text2.getText()+string.charAt(i));
			}
		}
        if(e.getSource()==area) {
			text2.setText("");
            result1=0.5*triangleParameters[2]*triangleParameters[3];
            text2.setText(String.valueOf(result1));
            text1.setText("Area of triangle is");
		}
		if(e.getSource()==perimeter) {
			text2.setText("");
            result1=triangleParameters[0]+triangleParameters[1]+triangleParameters[2];
            text2.setText(String.valueOf(result1));
            text1.setText("Perimeter of triangle is");
		}
		if(e.getSource()==areaAndPerimeter) {
			text2.setText("");
            result1=0.5*triangleParameters[2]*triangleParameters[3];
            result2=triangleParameters[0]+triangleParameters[1]+triangleParameters[2];
            text2.setText(String.valueOf(result1) +" , ".concat(String.valueOf(result2)));
            text1.setText("Area And Perimeter Are");
		}
        
        if(e.getSource()==main)
        {
			Main main = new Main();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==switchLeft)
        {
			Two_DShape two_DShape = new Two_DShape();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        
    }
}