package PravljenjeCestitke;

import java.awt.Color;
import java.awt.Graphics;

public class Snow extends Geometry {
	private Circle flakes[] = new Circle[300];
	private int windowWidth;
	private int counter = 0;

	public void move(int frame) {
		int fallen = 0;
		for (int i = 0; i < counter; i++) {
			if (flakes[i].getPositionY() < this.windowWidth-600) {
				int moveY = (int) (Math.random() * frame);
				flakes[i].setPositionY(moveY);
			} else {
				fallen++;
			}
		}
		if (fallen >= flakes.length / 2) {
			int flakesToAdd = 200;
			for (int i = 0; i < flakesToAdd; i++) {
				addFlake(generateFlake());
			}
		}
	}

	public void draw(Graphics g, int frame) {
		move(frame);
		for (int i = 0; i < counter; i++) {
			flakes[i].draw(g, 0);
		}
	}

	public Snow(Color white, int x, int y, int windowWidth) {
		super(x, y, white);
		this.windowWidth = windowWidth;
		generateFlakes(flakes.length);
	}

	private void generateFlakes(int length) {
		for (int i = 0; i < length; i++) {
			addFlake(generateFlake());

		}
	}

	private Circle generateFlake() {
		int x = (int) (Math.random() * this.windowWidth);
		int y = 0;
		int radius = (int) (Math.random() * 50);
		Circle flake = new Circle(x, y, radius, Color.WHITE);
		return flake;
	}

	private void addFlake(Circle circle) {
		if (flakes.length == counter)
			resize();
		flakes[counter] = circle;
		counter++;

	}

	private void resize() {
		Circle[] tmp = new Circle[flakes.length * 2];
		for (int i = 0; i < counter; i++) {
			tmp[i] = flakes[i];
		}
		flakes = tmp;

	}

}
