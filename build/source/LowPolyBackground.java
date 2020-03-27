import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class LowPolyBackground extends PApplet {

int c,i;
int[] shc={color(40,42,54), color(68, 71, 90), color(248, 248, 242), color(98, 114, 164), color(139, 233, 253), color(80, 250, 123), color(255,184,108), color(255,121,198), color(189, 147, 249), color(255, 85, 85)};
public void setup ( ) {
  //size(1920,1080,P2D);
  
  background(shc[0]);
  i=1;
}
public void draw( ) {
  c= PApplet.parseInt(random(3,64));
  beginShape();
  while(i <= c){
    vertex(random(0,width),random(0,height));
    fill(shc[PApplet.parseInt(random(shc.length))]);
    color(shc[PApplet.parseInt(random(shc.length))]);
    i++;
  }
  smooth();
  endShape(CLOSE);
  saveFrame("Wallpaper.tiff");
}
  public void settings() {  fullScreen(P2D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "LowPolyBackground" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
