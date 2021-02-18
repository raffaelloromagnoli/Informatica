import processing.core.PApplet;

public class Principale extends PApplet{
    ColpisciBersaglio cb;

    public static void main(String[] args){
        PApplet.main("Principale");
    }

    public void settings(){
        size(700,700);
    }

    public void setup(){
        this.cb=new ColpisciBersaglio((PApplet)this);
        try {
            this.cb.aggiungiBersaglio(new Bersaglio(this,100,100, 10, 10));
            this.cb.aggiungiBersaglio(new Bersaglio(this,200,200, 20, 5));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void draw(){
        cb.disegna();
    }

    public void mousePressed(){
        System.out.println("Bang!");
        cb.spara(mouseX,mouseY);
        System.out.println("Punteggio: "+cb.getPunteggioTot());
    }
}
