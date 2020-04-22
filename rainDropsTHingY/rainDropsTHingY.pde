int y = 0; 
void setup () {
  size(300, 300); 
}

void draw () {
  y = y + 1;
    background(0, 20, 100); 
    fill(0, 0, 225);
    stroke(0, 0, 0);
    ellipse(143, 5+y, 10, 10);
    if (y>=290) {
      y = 0;
}
}
