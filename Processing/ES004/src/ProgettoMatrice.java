import processing.core.*;

public class ProgettoMatrice extends PApplet {
    Griglia g;

    public static void main(String args[]){
        PApplet.main("ProgettoMatrice");
    }

    public void settings(){
        size(700, 700);
    }

    public void setup() {
        g = new Griglia(this, width, height, 30, 30);
    }

    public void draw() {
        background(0xffeeeeee);
        g.disegna();
    }

    public void mousePressed() {
        g.clickMouse(mouseX, mouseY);
    }
}