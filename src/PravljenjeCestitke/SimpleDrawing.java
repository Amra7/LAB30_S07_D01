package PravljenjeCestitke;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SimpleDrawing extends JPanel implements ActionListener {
	public int counter = 200;
	public int counter2 = 400;
	public int counter3 = 0;
	int frame = 0;
	public int counterSuza = 320;

	 static Snow snow;
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawFrame(g, frame++);
	}

	public void drawFrame(Graphics g, int frameNumber) {
		// nas snjesko
		Circle glava = new Circle(650, 300, 55, Color.WHITE);
		glava.draw(g, frameNumber);
		Circle trup = new Circle(635, 350, 85, Color.WHITE);
		trup.draw(g, frameNumber);
		Circle udovi = new Circle(625, 420, 105, Color.WHITE);
		udovi.draw(g, frameNumber);
		Circle lijevoOko = new Circle(665, 320, 5, Color.BLACK);
		lijevoOko.draw(g, frameNumber);
		Circle desnoOko = new Circle(685, 320, 5, Color.BLACK);
		desnoOko.draw(g, frameNumber);
		Circle nos = new Circle(675, 328, 8, Color.ORANGE);
		nos.draw(g, frameNumber);
		Circle usta1t = new Circle(665, 334, 5, Color.BLACK);
		usta1t.draw(g, frameNumber);
		Circle usta2t = new Circle(668, 337, 5, Color.BLACK);
		usta2t.draw(g, frameNumber);
		Circle usta3t = new Circle(671, 340, 5, Color.BLACK);
		usta3t.draw(g, frameNumber);
		Circle usta4t = new Circle(675, 340, 5, Color.BLACK);
		usta4t.draw(g, frameNumber);
		Circle usta5t = new Circle(679, 340, 5, Color.BLACK);
		usta5t.draw(g, frameNumber);
		Circle usta6t = new Circle(684, 337, 5, Color.BLACK);
		usta6t.draw(g, frameNumber);
		Circle usta7t = new Circle(689, 334, 5, Color.BLACK);
		usta7t.draw(g, frameNumber);
		Circle suza = new Circle(665, counterSuza, 5, Color.BLACK);
		suza.draw(g, frameNumber);
		Snow snijeg = new Snow(Color.WHITE, 0, 0, 800);
		// benjin snjesko
		Snowman snjesko = new Snowman(counter2, counter, Color.WHITE);
		// pokusaj za nekim cik-cak pokretima
		if (counter > 400) {
			counterSuza++;
			if (counter == 500)
				counterSuza = 320;
		}

		counter++;
		if (counter < 300)
			counter2++;
		else
			counter2--;
		if (counter > 450)
			counter2 += 2;
		snjesko.draw(g, frameNumber);
		snijeg.draw(g, frameNumber);
		Graphics2D g2d = (Graphics2D) g;
		Font ft = new Font("Comic Sans", Font.BOLD, 40);
		g.setFont(ft);
		g.setColor(Color.BLACK);
		if (counter > 500)
			g2d.drawString("Usput SRETNA NOVA GODINA!", 70, 540);
		else
			g2d.drawString("Bjezi lavina stize!!!", 70, 540);

	}

	public void actionPerformed(ActionEvent evt) {
		repaint();
	}

	public static void main(String[] args) {
		Snow snijeg = new Snow(Color.WHITE, 0, 0, 800);
		JFrame window = new JFrame("Happy Hollydays");

		SimpleDrawing drawArea = new SimpleDrawing();

		drawArea.setBackground(Color.GRAY.darker());
		window.setContentPane(drawArea);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double screenWidth = screenSize.getWidth();
		double screenHeight = screenSize.getHeight();
		int windowHeight = 800;
		int windowWidth = 600;

		int positionHeight = (int) (screenHeight - windowHeight) / 2;
		int positionWidth = (int) (screenWidth - windowWidth) / 2;

		window.setSize(windowHeight, windowWidth);
		window.setLocation(positionWidth, positionHeight);

		window.setResizable(false);

		Timer frameTimer = new Timer(20, drawArea);
//		snow = new Snow(Color.WHITE, windowHeight);

		window.setVisible(true);
		frameTimer.start();
	}

}
