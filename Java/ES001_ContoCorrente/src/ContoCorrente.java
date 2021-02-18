AlApublic class ContoCorrente {
    private float saldo;
    ContoCorrente(float saldo) throws Exception {
        if (saldo<0){
            throw new Exception("Saldo in negativo!");
        }

        this.saldo=saldo;
    }
    public void deposita(float in){
        saldo+=in;
    }
    public void stampa(){
        System.out.println("Il suo saldo è "+saldo);
    }
}
