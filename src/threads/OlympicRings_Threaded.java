package threads;

import java.awt.Color;
import java.awt.Graphics2D;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot a = new Robot(400, 700);
		Robot b = new Robot(600, 500);
		Robot c = new Robot(800, 700);
		Robot d = new Robot(1000, 500);
		Robot e = new Robot(1200, 700);

		
		new Thread(()->{
			a.penDown();
			for (int i = 0; i < 360; i++) {
				a.setSpeed(10);
				a.setPenColor(Color.blue);
				a.move(3);
				a.turn(1);
			}
		}).start(); 
		
		new Thread(()->{
			b.penDown();
			for (int i = 0; i < 360; i++) {
				b.setSpeed(10);
				b.setPenColor(Color.yellow);
				b.move(3);
				b.turn(1);
			}
		}).start(); 
		
		new Thread(()->{
			c.penDown();
			for (int i = 0; i < 360; i++) {
				c.setSpeed(10);
				c.setPenColor(Color.black);
				c.move(3);
				c.turn(1);
			}
		}).start(); 
		
		new Thread(()->{
			d.penDown();
			for (int i = 0; i < 360; i++) {
				d.setSpeed(10);
				d.setPenColor(Color.green);
				d.move(3);
				d.turn(1);
			}
		}).start(); 
		
		new Thread(()->{
			e.penDown();
			for (int i = 0; i < 360; i++) {
				e.setSpeed(10);
				e.setPenColor(Color.red);
				e.move(3);
				e.turn(1);
			}
		}).start(); 
	}
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

}

