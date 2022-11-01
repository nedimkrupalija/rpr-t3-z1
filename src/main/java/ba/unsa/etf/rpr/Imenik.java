package ba.unsa.etf.rpr;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> mapa;

    public Imenik(HashMap<String, TelefonskiBroj> mapa) {
        this.mapa = mapa;
    }
    public Imenik(){this.mapa = new HashMap<String ,TelefonskiBroj>();};

    public void dodaj(String ime, TelefonskiBroj broj){
        mapa.put(ime,broj);
    }
    public String dajBroj(String ime){
        return mapa.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
       if(mapa.containsValue(broj)) {
           for (Map.Entry<String, TelefonskiBroj> m : mapa.entrySet()) {
               if (m.getValue().equals(broj)) {
                   return m.getKey().toString();
               }
           }
       }
       return "Nema tog imena u mapi";
   }
   public String naSlovo(char s){
        String rez = "";
        for(Map.Entry<String ,TelefonskiBroj> m : mapa.entrySet()){
            if(m.getKey().toString().charAt(0)==s) {
                rez = rez + m.getKey().toString() + " " + m.getValue().ispisi() + '\n';

            }
        }
        if(rez.isEmpty()) return "Nema ljudi s tim slovom";
        else return rez;
   }
   public Set<String> izGrada(Grad g){
        Set<String> skup = new LinkedHashSet<>();


        for(Map.Entry<String,TelefonskiBroj> m : mapa.entrySet()){

            if(m.getValue() instanceof FiksniBroj){
                if(((FiksniBroj) m.getValue()).dajGrad() == g) skup.add(m.getKey()) ;
            }
        }

        return skup;

   }
   public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> skup = new LinkedHashSet<>();
    for(Map.Entry<String,TelefonskiBroj> m : mapa.entrySet()){
        if(m.getValue() instanceof FiksniBroj){
            if(((FiksniBroj) m.getValue()).dajGrad() == g) {
                skup.add(m.getValue());
                System.out.println("ABC");
            }
        }
    }
    return skup;
   }





}
