package PravljenjeCestitke;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Geometry {
	private int k;
	private int l;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public Rectangle(int i, int j, Color black, int k, int l) {
		super(i, j, black);
		this.k = k;
		this.l = l;

	}
	public void draw(Graphics g , int frame){
		g.setColor(super.getColor());
		g.fillRect(super.getPositionX(), super.getPositionY(), this.k, this.l);
	}
	

}
