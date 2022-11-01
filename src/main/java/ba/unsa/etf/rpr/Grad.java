package ba.unsa.etf.rpr;

public enum Grad {
    Sarajevo("033"),Bihac("037");
    private String broj;
    Grad(String broj){
        this.broj = broj;
    }
    public String ispisi(){
        return this.toString();
    }

}
