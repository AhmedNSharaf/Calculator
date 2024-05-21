import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    JFrame frame;
    JButton[] functionButtons = new JButton[4];
    JButton standard,scientific,shapes,temp;
    JTextField text ;
    Font myFont = new Font("Ink Free", Font.BOLD , 25);

    Main()
    {
        frame=new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        LineBorder lineBorder =new LineBorder(Color.white, 6, true);

        text=new JTextField("Welcom! Select a calculator");
        text.setBounds(55, 100, 300, 50);
        text.setFont(myFont);
        text.setEditable(false);
        text.setBackground(Color.black);
        // text.setBorder(lineBorder );
        text.setForeground(new Color(243,146,49));	//control color of numberButtons
        

        ImageIcon image = new ImageIcon("calculator.png");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame

        standard = new JButton("Standard");
        scientific= new JButton("Scientific");
        shapes = new JButton("Shapes");
        temp = new JButton("Temp");

        functionButtons[0] = standard;
		functionButtons[1] = scientific;
		functionButtons[2] = shapes;
		functionButtons[3] = temp;

        for(int i =0;i<4;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);

		}
		
        for(int k=0;k<4;k++)
		{
			functionButtons[k].setBackground(Color.black);  //control color of functionButtons
			functionButtons[k].setForeground(new Color(243,146,49));    //control color of functionButtons
		}

        standard.setBounds(110,200,200,50);
        scientific.setBounds(110, 300, 200, 50);
        shapes.setBounds(110,400,200,50);

        
        frame.getContentPane().setBackground(Color.BLACK);  //change background color
        frame.add(text);
        frame.add(standard);
        frame.add(scientific);
        frame.add(shapes);
        frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Main main = new Main();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==standard)
        {
			Calculator calc = new Calculator();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==scientific)
        {
			Scientific scientific = new Scientific();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
    
        if(e.getSource()==shapes)
        {
			Shapes shapes = new Shapes();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
    
}
}
