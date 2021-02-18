import processing.core.PApplet;

public class Principale extends PApplet {
    RettangoloDisegnabile r1;
    RettangoloDisegnabile r2;
    CerchioDisegnabile c1;

    public static void main(String[] args) {
        PApplet.main("Principale");
    }

    @Override
    public void settings() {
        size(640, 480);
    }

    @Override
    public void setup() {
        r1 = new RettangoloDisegnabile(200, 100, 0, 0);
        r2 = new RettangoloDisegnabile(200, 200, 300, 0);
        c1 = new CerchioDisegnabile(100, 400, 400);
    }

    @Override
    public void draw() {
        r1.disegna(this);
        r2.disegna(this);
        c1.disegna(this);
    }
}
