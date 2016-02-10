import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class obedientturtle {
public static void main(String[] args) {
	Tortoise.show();
	Tortoise.setSpeed(7);
	String color = JOptionPane.showInputDialog("What color do you want?");
	if (color.equals("blue")) {
		Tortoise.setPenColor(Color.blue);
	} else if (color.equals("red")) {
		Tortoise.setPenColor(Color.red);
	}else if (color.equals("yellow")) {
		Tortoise.setPenColor(Color.yellow);
	}

	String shape = JOptionPane.showInputDialog("Which shape do you want?");	

if (shape.equals("square")) {
	drawSquare();
}else if (shape.equals("circle")) {
	drawCircle();
} else if (shape.equals("triangle")) {
drawTriangle();	
}
	
}


private static void drawCircle() {
	for (int i = 0; i < 360; i++) {
		Tortoise.setSpeed(10);
		Tortoise.move(1);
		Tortoise.turn(1);
	}
}


private static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		
	
	Tortoise.turn(120);
	Tortoise.move(70);
	}
}

private static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		
	
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(50);
	}
	
}

}


