//A simple processing.js script to create a random polygon wallpaper
//declares variables i and c where i is the number
//of cycles and c is the number of corners
int c,i;
//saves a color pallette (in this case Dracula) in an array
color[] shc={color(40,42,54), color(68, 71, 90), color(248, 248, 242), color(98, 114, 164), color(139, 233, 253), color(80, 250, 123), color(255,184,108), color(255,121,198), color(189, 147, 249), color(255, 85, 85)};
//sets the resulution to full screen activates the 2D renderer and
//makes the first color in the array the background(color)
void setup ( ) {
  //size(1920,1080,P2D);
  fullScreen(P2D);
  background(shc[0]);
  i=1;
}
void draw( ) {
  //the corner count of the polygon is set to a random number between 3 and 64
  c= int(random(3,64));
  //a polygon with between 3 and 64 corners is created using a while loop
  //creating a vertex with each iteration until i equals c
  //the resulting shape is filled with random colors from the color array shc
  beginShape();
  while(i <= c){
    vertex(random(0,width),random(0,height));
    fill(shc[int(random(shc.length))]);
    color(shc[int(random(shc.length))]);
    i++;
  }
  smooth();
  endShape(CLOSE);
  saveFrame("Wallpaper.tiff"); //the result is saved as an image
}
