import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Three_DShape implements ActionListener {
    JFrame frame;
    JButton[] functionButtons = new JButton[6];
    JButton Ball,Cube,Cuboid,Cone,main,switchLeft;
    JTextField text ;
    Font myFont = new Font("Ink Free", Font.BOLD , 25);

    Three_DShape()
    {
        frame=new JFrame("Three_DShapes Calculator");
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

        Ball = new JButton("Ball");
        Cube= new JButton("Cube");
        Cuboid = new JButton("Cuboid");
        Cone = new JButton("Cone");
        main = new JButton("Main");
		switchLeft = new JButton("<");

        functionButtons[0] = Ball;
		functionButtons[1] = Cube;
		functionButtons[2] = Cuboid;
		functionButtons[3] = Cone;
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

        Ball.setBounds(110,130,200,50);
        Cube.setBounds(110, 200, 200, 50);
        Cuboid.setBounds(110, 270, 200, 50);
        Cone.setBounds(110, 340, 200, 50);
        switchLeft.setBounds(110, 410, 60, 50);
        main.setBounds(180, 410, 130, 50);

        
        frame.getContentPane().setBackground(Color.BLACK);  //change background color
        frame.add(text);
        frame.add(Ball);
        frame.add(Cube);
        frame.add(Cuboid);
        frame.add(Cone);
        frame.add(switchLeft);
		frame.add(main);
        frame.setLocationRelativeTo(null);      //Makes the frame open at the center
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        Three_DShape three_DShape = new Three_DShape();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Ball)
        {
			Ball ball = new Ball();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Cube)
        {
			Cube cube = new Cube();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Cuboid)
        {
			Cuboid cuboid = new Cuboid();		//open the seconed screen
			frame.dispose();	// allow opening the seconed screen in the same screen 
        }
        if(e.getSource()==Cone)
        {
			Cone cone = new Cone();		//open the seconed screen
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