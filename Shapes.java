import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Shapes implements ActionListener {
    JFrame frame;
    JButton[] functionButtons = new JButton[4];
    JButton Two_DShape,Three_DShape,shapes,temp,main,switchLeft;
    JTextField text ;
    Font myFont = new Font("Ink Free", Font.BOLD , 25);

    Shapes()
    {
        frame=new JFrame("Shapes Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        text=new JTextField("What is the type of shape");
        text.setBounds(50, 100, 310, 50);
        text.setFont(myFont);
        text.setEditable(false);
        text.setBackground(Color.black);
        text.setForeground(new Color(243,146,49));	//control color of numberButtons
        

        ImageIcon image = new ImageIcon("calculator.png");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame

        Two_DShape = new JButton("2D_Shape");
        Three_DShape= new JButton("3D_shape");
        temp = new JButton("Temp");
        main = new JButton("Main");
		switchLeft = new JButton("<");

        functionButtons[0] = Two_DShape;
		functionButtons[1] = Three_DShape;
        functionButtons[2] = main;
		functionButtons[3] = switchLeft;

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

        Two_DShape.setBounds(110,200,200,50);
        Three_DShape.setBounds(110, 300, 200, 50);
		switchLeft.setBounds(110, 400, 60, 50);
        main.setBounds(180, 400, 130, 50);

        
        frame.getContentPane().setBackground(Color.BLACK);  //change background color
        frame.add(text);
        frame.add(Three_DShape);
        frame.add(Two_DShape);
        frame.add(switchLeft);
		frame.add(main);
        frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Two_DShape)
        {
			Two_DShape two_DShape = new Two_DShape();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Three_DShape)
        {
			Three_DShape three_DShape = new Three_DShape();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==switchLeft)
        {
			Scientific scientific = new Scientific();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
		if(e.getSource()==main)
        {
			Main main = new Main();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
    
}
}