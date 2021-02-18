import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CLInput {
    private BufferedReader br;

    CLInput(){
        InputStreamReader isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
    }

    public String readString(String prompt){

        String ris=null;

        while (ris==null) {
            System.out.println("prompt");
            try {
                ris= br.readLine();
            }catch (Exception e){
                System.out.println("Errore nella lettura!");
            }
        }
        return ris;
    }
    public int readInt(String prompt){

        int ris=0;
        boolean ok=false;

        while (ok==false) {
            System.out.println("prompt");
            try {
                String in= br.readLine();
                ris=Integer.parseInt(in);
                ok=true;
            }catch (Exception e){
                System.out.println("Errore nella lettura!");
            }
        }
        return ris;
    }

    public float readFloat(String prompt){

        float ris=0;
        boolean ok=false;

        while (ok==false) {
            System.out.println("prompt");
            try {
                String in= br.readLine();
                ris=Float.parseFloat(in);
                ok=true;
            }catch (Exception e){
                System.out.println("Errore nella lettura!");
            }
        }
        return ris;
    }
    public char readChar(String prompt){

        char ris=0;
        boolean ok=false;

        while (ok==false) {
            System.out.println("prompt");
            try {
                String in= br.readLine();
                if (in.length()==1){
                    ris=in.charAt(0);
                    ok=true;
                }
            }catch (Exception e){
                System.out.println("Errore nella lettura!");
            }
        }
        return ris;
    }
}
