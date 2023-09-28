import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * This program will display a scene with a flower and a cloud when run. 
   * @author: C. Tarla
   */
	
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
	  // Draw flower petals with circles 
    stroke(43, 97, 143);
    fill(43, 97, 143);
    ellipse(width*.25, height*.25, width/5, height/5);
    ellipse(width*.75, height*.25, width/5, height/5);
    ellipse(width*.25, height*.75, width/5, height/5);
    ellipse(width*.75, height*.75, width/5, height/5);

	 /* 5.2 Program 
    // Draw the stem and leaves of the flower 
    stroke(20, 166, 61);
    fill(20, 166, 61);
    rect(237, 250, 25, 250);
    ellipse(287, 375, 50, 50);
    ellipse(213, 425, 50, 50);
    stroke(10, 138, 46);
    line(242, 250, 242, 500);
    line(250, 250, 250, 500);
    line(258, 250, 258, 500);
        
    // Draw circles for flower petals 
    stroke(43, 97, 143);
    fill(43, 97, 143);
    ellipse(250, 250, 100, 100);
    stroke(111, 153, 189);
    fill(111, 153, 189);
    ellipse(250, 200, 50, 50);
    ellipse(250, 300, 50, 50);
    ellipse(205, 225, 50, 50);
    ellipse(295, 225, 50, 50);
    ellipse(205, 275, 50, 50);
    ellipse(295, 275, 50, 50);
    
    // Draw a circle for the centre of the flower 
    stroke(245, 214, 17);
    fill(245, 214, 17);
    ellipse(250, 250, 50, 50);

    // Draw a cloud 
    stroke(255);
    fill(255);
    rect(50, 75, 125, 50);
    ellipse(50, 100, 50, 50);
    ellipse(175, 100, 50, 50);
    ellipse(75, 75, 50, 50);
    ellipse(125, 75, 75, 75);
    */

  }
  
}