package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y) {
		super(x, y, 10, 200);
		// TODO Auto-generated constructor stub
	}

	private int change = 1;
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if (getX() == 0) {
			change = 1;
		}else if (getX() == 200) {
			change = -1;
		}
		setX(getX()+change);
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
