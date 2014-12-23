package PravljenjeCestitke;

import java.awt.Color;
import java.awt.Graphics;


public class Line extends Geometry {
	private int j;
	private int k;

	public Line(int mID, int i, int j, int k, Color black) {
		super(mID,i,black);
		this.j=j;
		this.k=k;
	}
public void draw ( Graphics g, int frame){
	g.setColor(super.getColor());
	g.drawLine(super.getPositionX(), super.getPositionY(), j, k);
}


}
