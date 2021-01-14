class Terra{
  float x;
  float y;
  float l;
  float h;
  
  Terra(float x, float y, float l, float h){
    this.x=x;
    this.y=y;
    this.l=l;
    this.h=h;
  }
  
  public void draw(){
    fill(160,82,45);
    rect(x, y, l, h);
  }
}
