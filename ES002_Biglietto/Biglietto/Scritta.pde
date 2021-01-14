class Scritta{
  private float x;
  private float y;
  
  Scritta(float x, float y){
    this.x=x;
    this.y=y;
  }
  
  public void draw(){
    fill(255,255,255);
    textSize(32);
    text("Merry Christmas!", x, y);
  }
}
