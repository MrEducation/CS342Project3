import java.awt.*;
import java.awt.event.*;
import java.lang.*;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class Blocks extends JButton implements MouseInputListener
{
		private char direction;
		private String name;
		private JButton button;
		private int xLoc;
		private int yLoc;
		private int width;
		private int height;
		

		Blocks(char direction, String name, int xLoc, int yLoc, int width, int height)
		{
			this.direction = direction;
			this.name = name;
			setButton(new JButton(name));
			button.setBounds(xLoc*100,yLoc*100,width*100,height*100);
			button.setName(name);

		}
		
		
		public char getDirection()
		{
			return direction;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setDirection(char direction)
		{
			this.direction = direction;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}


		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		public JButton getButton() {
			return button;
		}


		public void setButton(JButton button) {
			this.button = button;
		}
		
}
