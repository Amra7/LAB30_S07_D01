package PravljenjeCestitke;

import java.awt.Color;
import java.awt.Graphics;


public class Arch extends Geometry {
	private int k;
	private int l;
	private int m;
	private int n;

	public Arch(int i, int j, Color red, int k, int l, int m, int n) {
		super(i,j,red);
		this.k=k;
		this.l=l;
		this.m=m;
		this.n=n;
	}
	public void draw(Graphics g,int frame){
		g.setColor(super.getColor());
		g.fillArc(super.getPositionX(), super.getPositionY(), k, l, m, n);
	}
	

}
