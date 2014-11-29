package net.bucktower.nationalanimals;

import processing.core.PApplet;

/*
 * Countries:
 * Australia, Canada, England,
 * France, Greece, Ireland,
 * Japan, Russia, Sweden
 */
public class Nationalanimals extends PApplet {

	public void setup() {
		size(800,600);
		background(255,229,204);
	}

	public void draw() {
		stroke(155,129,104);
		for(int grid = 1; grid < 3; grid++){
			//line down
			line(width*grid/3, 0, width*grid/3, height);
			//line across
			line(0, height*grid/3, width, height*grid/3);
		}
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { net.bucktower.nationalanimals.Nationalanimals.class.getName() });
	}
}
