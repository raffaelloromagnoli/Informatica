import processing.core.PApplet;

public class RettangoloDisegnabile import processing.core.PApplet;

public class RettangoloDisegnabile extends Rettangolo {
    private float x,y;

    public RettangoloDisegnabile(float base, float altezza, float x, float y) {
        super(base, altezza);
        this.x = x;
        this.y = y;
    }

    public void disegna(PApplet p) {
        p.rect(x, y, getBase(), getAltezza());
    }

}
{
}
