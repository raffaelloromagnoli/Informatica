class Rettangolo{
  
 //dimensioni
  private float l;
  private float h;
  
  //posizione
  private float x;
  private float y;
  
  Rettangolo(float l, float h, float x, float y){
    this.l=l;
    this.h=h;
    this.x=x;
    this.y=y;
  }
  
  public void draw(){
 
  rect(x, y, l, h);
}
}
