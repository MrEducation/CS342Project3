import java.awt.*;
import java.awt.event.*;
import java.lang.*;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.util.ArrayList;


public class Game extends JFrame implements MouseInputListener
{
 public int pressed;
 public int released;
 public JButton button; 
 public Blocks block; 
 
 private ArrayList<Blocks> blocks;
     
     public Game()
     {
    	 
          super("Game");
          
          blocks = new ArrayList<Blocks>();
        
          getContentPane().setLayout(null);
          setSize(new Dimension(600, 625));
          
          blocks.add(new Blocks('h', "Horizontal", 1, 1, 1,1));
          blocks.add(new Blocks('u', "Vertical", 2, 2, 1,2));
          
          for(Blocks b : blocks)
          {

        	  getContentPane().add(b.getButton());
			  b.getButton().addMouseListener(this);
	          b.getButton().addMouseMotionListener(this);
	          
	        
          }
       

          setVisible(true);
          setResizable(false);

          addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent argEvent) {
                    Destructor();
               }
          });
     }
     

     public void mousePressed(MouseEvent argEvent) {
    //	 System.out.println("Pressed: " + argEvent.getX());
    	 button = (JButton) argEvent.getSource();

    	 for(Blocks b : blocks)
         {
       	  if(b.getName().equals(button.getName()))
       	  {
       	  	block = b;
       	  }
         }
    	 

    	 
    	 if(block.getDirection() == 'h')
    	 {
    	    pressed = argEvent.getX();
    	 }
    	 else if(block.getDirection() == 'u')
    	 {
    		pressed = argEvent.getY();
    	 }

    	 
 	}
     
     public void mouseReleased(MouseEvent argEvent) {
  

    	 
    	 if(block.getDirection() == 'h')
    		 released = argEvent.getX();
    	 else if(block.getDirection() == 'u')
     		 released = argEvent.getY();

    	 if(block.getDirection() == 'h'){
    		 if(pressed > released) //move button to left
    		 {
    			 Rectangle objBounds = button.getBounds();
    			 if((int)button.getLocation().getX() != 0)
    				 button.setLocation(objBounds.x-100, (int)button.getLocation().getY());
    		 }
    	 
    		 else if(pressed < released) // move button to right
    		 {
    		 
    			 Rectangle objBounds = button.getBounds();
    			 if((int)button.getLocation().getX() < getWidth()-((int)button.getWidth()+17))
    				 button.setLocation(objBounds.x+100, (int)button.getLocation().getY());
    		 }
    	 
    		 System.out.println("Location: (" + (int)button.getLocation().getX()+"," + (int)button.getLocation().getY() + ")");
    	 }
    	 
    	 else if(block.getDirection() == 'u'){
    		 if(pressed > released) //move button to left
    		 {
    			 Rectangle objBounds = button.getBounds();
    			 if((int)button.getLocation().getY() != 0)
    				 button.setLocation((int)button.getLocation().getX(), objBounds.y-100);
    		 }
    	 
    		 else if(pressed < released) // move button to right
    		 {
    		 
    			 Rectangle objBounds = button.getBounds();
    			 if((int)button.getLocation().getY() < getWidth()-((int)button.getHeight()+17))
    				 button.setLocation((int)button.getLocation().getX(), objBounds.y+100);
    		 }
    	 
    		 System.out.println("Location: (" + (int)button.getLocation().getX()+"," + (int)button.getLocation().getY() + ")");
    	 }
    	 
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