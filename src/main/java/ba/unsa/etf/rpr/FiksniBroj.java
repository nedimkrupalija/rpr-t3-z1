package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad,String broj){
        this.grad = grad;
        this.broj = broj;
    }

    public Grad dajGrad(){
        return grad;
    }
    public String dajBroj(){
        return this.broj;
    }
    @Override
    public String ispisi() {
        return grad.ispisi() + "/" + "broj";
    }



    @Override
    public int hashCode() {
        return grad.hashCode();
    }
}
