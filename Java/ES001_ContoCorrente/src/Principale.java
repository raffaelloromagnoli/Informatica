import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Principale {
    public static void main(String[] args){
        ContoCorrente cc;
        try{
            cc=new ContoCorrente(100);
            cc.stampa();
            cc.deposita(-200);
            cc.stampa();
        } catch (Exception e){
            System.out.println("Il suo saldo è in negativo!");
        }
        Float.parseFloat("42");
    }
}
