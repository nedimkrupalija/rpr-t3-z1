package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    @Override
    public String ispisi(){
        return "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
       return 0;
    }
}
