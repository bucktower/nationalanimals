package net.bucktower.nationalanimals;

import processing.core.PApplet;

/*
 * Countries:
 * Australia, Canada, England,
 * France, Greece, Ireland,
 * Japan, Russia, Sweden
 */
public class Nationalanimals extends PApplet {

	//flags
	ImageEditor joined;
	/*ImageEditor flagAU;
	ImageEditor flagCA;
	ImageEditor flagFR;
	ImageEditor flagGB;
	ImageEditor flagGR;
	ImageEditor flagIE;
	ImageEditor flagJP;
	ImageEditor flagRU;
	ImageEditor flagSE;*/
	
	//silhouettes
	ImageEditor picAU;
	ImageEditor picCA;
	ImageEditor picFR;
	ImageEditor picGB;
	ImageEditor picGR;
	ImageEditor picIE;
	ImageEditor picJP;
	ImageEditor picRU;
	ImageEditor picSE;
	
	ImageEditor screenShot;
	
	public void setup() {
		
		size(800,600);

		SketchObject.setApp(this);
		
		//flags
		joined = new ImageEditor("net/bucktower/nationalanimals/data/flags/joined.jpg");
		/*flagAU = new ImageEditor("net/bucktower/nationalanimals/data/flags/au.png");
		flagCA = new ImageEditor("net/bucktower/nationalanimals/data/flags/ca.png");
		flagFR = new ImageEditor("net/bucktower/nationalanimals/data/flags/fr.png");
		flagGB = new ImageEditor("net/bucktower/nationalanimals/data/flags/gb.png");
		flagGR = new ImageEditor("net/bucktower/nationalanimals/data/flags/gr.png");
		flagIE = new ImageEditor("net/bucktower/nationalanimals/data/flags/ie.png");
		flagJP = new ImageEditor("net/bucktower/nationalanimals/data/flags/jp.png");
		flagRU = new ImageEditor("net/bucktower/nationalanimals/data/flags/ru.png");
		flagSE = new ImageEditor("net/bucktower/nationalanimals/data/flags/se.png");*/
		
		//silhouettes
		picAU = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/au.png");
		picCA = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/ca.png");
		picFR = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/fr.png");
		picGB = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/gb.png");
		picGR = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/gr.png");
		picIE = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/ie.png");
		picJP = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/jp.png");
		picRU = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/ru.png");
		picSE = new ImageEditor("net/bucktower/nationalanimals/data/silhouettes/se.png");
		
		background(255,229,204);
		noLoop();
	}

	public void draw() {
		stroke(155,129,104);
		for(int grid = 1; grid < 3; grid++){
			//line down
			//line(width*grid/3, 0, width*grid/3, height);
			//line across
			//line(0, height*grid/3, width, height*grid/3);
		}
		picAU.drawImageIn3x3Grid(0,0,width,height);					picCA.drawImageIn3x3Grid(width/3,0,width,height);				picFR.drawImageIn3x3Grid(width/3*2,0,width,height);
		picGB.drawImageIn3x3Grid(0,height/3,width,height);			picGR.drawImageIn3x3Grid(width/3,height/3,width,height);		picIE.drawImageIn3x3Grid(width/3*2,height/3,width,height);
		picJP.drawImageIn3x3Grid(0,height/3*2,width,height);		picRU.drawImageIn3x3Grid(width/3,height/3*2,width,height);		picSE.drawImageIn3x3Grid(width/3*2,height/3*2,width,height);
		
		screenShot = new ImageEditor(0,0,width,height);
		screenShot.startEditing();
		for(int y = 0; y < height; y++){
			for(int x = 0; x < width; x++){
				if(screenShot.colorAt(x, y) == color(0)){
					int c = joined.colorAt(x, y);
					screenShot.setColorAt(c, x, y);
					println("firing");
				}
			}
		}
		screenShot.stopEditing();
		screenShot.drawAt(0, 0);
	}
	
	/*private void drawImage(x, y, ){
		moved to ImageEditor
	}*/
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { net.bucktower.nationalanimals.Nationalanimals.class.getName() });
	}
}
