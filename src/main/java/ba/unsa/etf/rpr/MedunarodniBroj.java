package ba.unsa.etf.rpr;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;
    MedunarodniBroj(String drzava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedunarodniBroj that = (MedunarodniBroj) o;
        return Objects.equals(drzava, that.drzava) && Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {

        return Objects.hash(drzava, broj);
    }

    @Override
    public String ispisi() {
        return drzava + "/" + broj;
    }
}
