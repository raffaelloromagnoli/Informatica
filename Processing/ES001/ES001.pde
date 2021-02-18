Rettangolo r;

void settings(){
  size(300, 300);
}

void setup(){
  r= new Rettangolo(100, 50, width/2-50, height/2-25);
}

void draw(){
  r.draw();
}

void keyPressed(){
  if(key=='a'){
    System.out.println("sinistra");
  }
}
