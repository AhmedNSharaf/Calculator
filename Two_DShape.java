import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Two_DShape implements ActionListener {
    JFrame frame;
    JButton[] functionButtons = new JButton[6];
    JButton Square,Triangle,Circle,Rectangle,main,switchLeft;
    JTextField text ;
    Font myFont = new Font("Ink Free", Font.BOLD , 25);

    Two_DShape()
    {
        frame=new JFrame("Two_DShapes Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        text=new JTextField("Welcom! Select a shape");
        text.setBounds(75, 60, 270, 50);
        text.setFont(myFont);
        text.setEditable(false);
        text.setBackground(Color.black);
        text.setForeground(new Color(243,146,49));	//control color of numberButtons
        

        ImageIcon image = new ImageIcon("calculator.png");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of frame

        Square = new JButton("Square");
        Triangle= new JButton("Triangle");
        Circle = new JButton("Circle");
        Rectangle = new JButton("Rectangle");
        main = new JButton("Main");
		switchLeft = new JButton("<");


        functionButtons[0] = Square;
		functionButtons[1] = Triangle;
		functionButtons[2] = Circle;
		functionButtons[3] = Rectangle;
        functionButtons[4] = main;
		functionButtons[5] = switchLeft;


        for(int i =0;i<6;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
        for(int k=0;k<6;k++)
		{
			functionButtons[k].setBackground(Color.black);  //control color of functionButtons
			functionButtons[k].setForeground(new Color(243,146,49));    //control color of functionButtons
		}

        Square.setBounds(110,130,200,50);
        Triangle.setBounds(110, 200, 200, 50);
        Circle.setBounds(110, 270, 200, 50);
        Rectangle.setBounds(110, 340, 200, 50);
        switchLeft.setBounds(110, 410, 60, 50);
        main.setBounds(180, 410, 130, 50);

        
        frame.getContentPane().setBackground(Color.BLACK);  //change background color
        frame.add(text);
        frame.add(Square);
        frame.add(Triangle);
        frame.add(Circle);
        frame.add(Rectangle);
        frame.add(switchLeft);
		frame.add(main);
        frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Two_DShape two_DShape = new Two_DShape();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Square)
        {
			Square square = new Square();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Triangle)
        {
			Triangle triangle = new Triangle();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Circle)
        {
			Circle circle = new Circle();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Rectangle)
        {
			Rectangle rectangle = new Rectangle();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==switchLeft)
        {
			Shapes shape = new Shapes();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
		if(e.getSource()==main)
        {
			Main main = new Main();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
    
}
}