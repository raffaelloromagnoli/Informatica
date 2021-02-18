public class Rettangolo {
    private float base, altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float area() {
        return base*altezza;
    }

    public float perimetro() {
        return 2*(base+altezza);
    }

}
