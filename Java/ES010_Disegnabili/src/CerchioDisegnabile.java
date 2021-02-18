import processing.core.PApplet;

public class CerchioDisegnabile extends Cerchio {
    private float x,y;

    public CerchioDisegnabile(float raggio, float x, float y) {
        super(raggio);
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void disegna(PApplet p) {
        p.circle(x, y, 2*getRaggio());
    }

}
