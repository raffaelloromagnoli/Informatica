Albero a1, a2;
Scritta s1;


public void setup(){
  size (700,700);
  background(255,0,0);
  a1=new Albero(width/3, height-50, width/7, height-100);
  a2=new Albero(2*width/3, height-25, width/6, height-200);
  s1=new Scritta(width/2, height-600);
}

public void draw(){
  a1.draw();
  a2.draw();
  s1.draw();
}
