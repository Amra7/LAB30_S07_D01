package PravljenjeCestitke;

import java.awt.Color;
import java.awt.Graphics;


public class Oval extends Geometry {
	private int middleRadius;
	private int k;

	public Oval(int i, int j, int middleRadius, int k, Color color) {
		super(i,j,color);
		this.middleRadius=middleRadius;
		this.k=k;
		
	}
	public void draw (Graphics g, int frame){
		g.setColor(super.getColor());
		g.fillOval(super.getPositionX(), super.getPositionY(), middleRadius, k);
	}
	

}
