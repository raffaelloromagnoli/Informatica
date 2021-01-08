public class Scritta{
  private float x;
  private float y;
  
  Scritta(float x, float y){
    this.x=x;
    this.y=y;
  }
  
  public void draw(){
    text("Happy Christmas!", x, y);
    textSize(32);
    fill(255,255,255);
  }
}
