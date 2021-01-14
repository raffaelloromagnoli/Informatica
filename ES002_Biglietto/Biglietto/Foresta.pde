class Foresta {
    private Albero[] alberi;
  
    Foresta(int nAlberi){
    
      alberi = new Albero[nAlberi]; 
      for(int a=0;a<nAlberi;a++){
        float x = random(0,width);
        alberi[a]= new Albero(x,height-height/10,width/8,height-height/1.75 );
      }
    }
     
    public void draw(){
      for(int b=0;b<alberi.length;b++){
          alberi[b].draw();
      }
    }
}
