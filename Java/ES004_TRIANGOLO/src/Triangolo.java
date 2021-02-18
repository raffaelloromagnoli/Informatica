public class Triangolo {

    private float l1;
    private float l2;
    private float l3;

    Triangolo(float l1, float l2, float l3) throws Exception {

        eValido(l1,l2,l3);

        this.l1= l1;
        this.l2=l2;
        this.l3=l3;

    }

    public void setL1(float l1) throws Exception{
        eValido(l1,this.l2,this.l3);
        this.l1=l1;
    }

    public float getL1() {
        return this.l1;
    }

    public void setL2(float l2) throws Exception{
        eValido(this.l1,l2,this.l3);
        this.l2=l2;
    }

    public float getL2() {
        return l2;
    }

    public void setL3(float l3) throws Exception{
        eValido(this.l1,this.l2,l3);
        this.l3=l3;
    }

    public float getL3() {
        return l3;
    }

    private void eValido(float l1, float l2, float l3) throws Exception {
        if (l1<0||l2<0||l3<0){

            throw new Exception("Uno dei lati è negativo");

        }
        if(l1+l2>=l3||l1+l3>=l2||l2+l3>=l1){

            throw new Exception("Il triangolo non può essere costruito");

        }
    }

    public boolean eEquilatero(){
        if (l1==l2&&l2==l3){
            return true;
        }
        return false;
    }

    public boolean eIsoscele(){
        return false;
    }
}
