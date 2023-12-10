package Zadanie4;

public class ModyfikatoryDostepu {
    public String imie;
    protected String nazwisko;
    private int idPrivate;
    private static int kolejneId = 1;
    ModyfikatoryDostepu(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.idPrivate = inkrementacja();
    }
    private int inkrementacja(){
        return kolejneId++;
    }
    protected void wyswietlInfo(){
        System.out.println(this.imie + " " + this.nazwisko+ " numer id: " + this.idPrivate);
    }
}
