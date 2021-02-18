class CatenaLuci {
    private Luce[] luci;
  
    CatenaLuci(int nLuci){
    
      luci = new Luce[nLuci]; 
      float x = 50;
      for(int a=0;a<nLuci;a++){
        float y = height/2-50;
        luci[a]= new Luce(true, x, y, 20);
        x+=50;
      }
    }
     
    public void draw(){
      for(int b=0;b<luci.length;b++){
          luci[b].draw();
      }
    }
}
