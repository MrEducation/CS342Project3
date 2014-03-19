import java.awt.*;
import java.awt.event.*;
import java.lang.*;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.util.ArrayList;


public class Game extends JFrame implements MouseInputListener
{
 private JButton objButtonDrag;
 private JButton objButtonDrag1;
 public int pressed;
 public int released;
 public JButton button; 
     
     public Game()
     {
          super("Game");
          
          ArrayList<JButton> blocks = new ArrayList<JButton>();
        		  
          objButtonDrag = new JButton("Horizontal");
          objButtonDrag.addMouseListener(this);
          objButtonDrag.addMouseMotionListener(this);
           objButtonDrag.setBounds(0, 100, 100, 100);
           
           objButtonDrag1 = new JButton("Vertical");
           objButtonDrag1.addMouseListener(this);
           objButtonDrag1.addMouseMotionListener(this);
           objButtonDrag1.setBounds(100, 0, 100, 100);

          getContentPane().setLayout(null);
          
          blocks.add(objButtonDrag);
          blocks.add(objButtonDrag1);
          
          for(JButton b : blocks)
          {
          getContentPane().add(b);
          }

          setSize(new Dimension(617, 617));
       

          setVisible(true);

          addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent argEvent) {
                    Destructor();
               }
          });
     }
     

     public void mousePressed(MouseEvent argEvent) {
    //	 System.out.println("Pressed: " + argEvent.getX());
    	 button = (JButton) argEvent.getSource();
    	 pressed = argEvent.getX();

    	 
 	}
     
     public void mouseReleased(MouseEvent argEvent) {
  
    	 System.out.println("width: " + getWidth());
    	 released = argEvent.getX();
    	 
    	 if(pressed > released) //move button to left
    	 {
    		 Rectangle objBounds = button.getBounds();
    		 if((int)button.getLocation().getX() >= (int)button.getWidth())
    			 button.setLocation(objBounds.x-100, 100);
    	 }
    	 
    	 else if(pressed < released) // move button to right
    	 {
    		 
    		 Rectangle objBounds = button.getBounds();
    		if((int)button.getLocation().getX() < getWidth()-((int)button.getWidth()+17))
    			button.setLocation(objBounds.x+100, 100);
    	 }
    	 
    	 System.out.println("Location: " + (int)button.getLocation().getX());
     }
 


     public void Destructor()
     {
          dispose();

          System.exit(0);
     }

     public static void main(String [] argCommand)
     {
          Game objGame = new Game();
     }

    public void mouseMoved(MouseEvent argEvent) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}


}