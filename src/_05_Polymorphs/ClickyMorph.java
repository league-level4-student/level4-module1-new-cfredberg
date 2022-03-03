package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class ClickyMorph extends Polymorph implements MouseListener {

	public ClickyMorph(int x, int y) {
		super(x, y, 200, 200);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int titleBar = 29;
		int clickX = e.getX();
		int clickY = e.getY()-titleBar;
		
		if (clickX >= getX() && clickX <= getX()+getWidth() && clickY >= getY() && clickY <= getHeight()+getY()) {
			JOptionPane.showMessageDialog(null, "I have been clicked!!!!!");
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
