import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * This program will display a scene with a flower and a cloud when run. 
   * @author: C. Tarla
   */
	
public Sketch() {
  super();
}

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(182, 239, 252);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  // Draw a flower with circles  
    stroke(43, 97, 143);
    fill(43, 97, 143);
    ellipse(width*.25f, height*.25f, width/2f, height/2f);
    ellipse(width*.75f, height*.25f, width/2f, height/2f);
    ellipse(width*.25f, height*.75f, width/2f, height/2f);
    ellipse(width*.75f, height*.75f, width/2f, height/2f);
    stroke(235, 182, 9);
    fill(235, 182, 9);
    ellipse(width/2f, height/2f, width/2f, height/2f);

  }
  
}