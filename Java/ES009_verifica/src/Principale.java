import processing.core.PApplet;

public class Principale extends PApplet{
    ColpisciBersaglio cb;

    public static void main(String args){
        PApplet.main("Principale");
    }

    public void settings(){
        size(700,700);
    }

    public void setup(){
        this.cb=new ColpisciBersaglio();
        try {
            this.cb.aggiungiBersaglio(new Bersaglio(width/2,height/2, 5, 20));
        }
    }
}
