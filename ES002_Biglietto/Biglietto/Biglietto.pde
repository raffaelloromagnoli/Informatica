public static final int MAX = 8;

Foresta f1;
Scritta s1;
Cometa c1;
Terra t1;
Luce l1;
CatenaLuci cl1;


public void setup() {
  size (700, 700);
  background(0, 0, 255);
  
  f1=new Foresta(40);
  s1=new Scritta(width/2, height-625);
  c1=new Cometa(width/2, height/4, 0, height/8);
  t1=new Terra(width-700, height-100, width, height/7);
  cl1=new CatenaLuci(13);
}

public void draw() {
  f1.draw();
  s1.draw();
  c1.draw();
  t1.draw();
  cl1.draw();
}

public void mousePressed(){
  l1.ePremuto(mouseX, mouseY);
}
