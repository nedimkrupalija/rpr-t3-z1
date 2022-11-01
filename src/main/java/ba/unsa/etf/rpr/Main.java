package ba.unsa.etf.rpr;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,TelefonskiBroj> mapa = new HashMap<String ,TelefonskiBroj>();

        MedunarodniBroj broj = new MedunarodniBroj("+387","123-456");
        TelefonskiBroj broj2 = new FiksniBroj(Grad.Sarajevo,"345-678");
        Imenik imenik = new Imenik();
        imenik.dodaj("Pero Peric",broj2);
         imenik.dodaj("Hamo",broj);
        System.out.println(imenik.dajBroj("Hamo"));;
        System.out.println(imenik.dajIme(broj));
        System.out.println((imenik.naSlovo('H')));
        System.out.println(imenik.izGrada(Grad.Sarajevo));
        System.out.println(imenik.izGradaBrojevi(Grad.Sarajevo));
    }
}