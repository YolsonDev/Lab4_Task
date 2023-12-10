package Zadanie13;

public class CarPlus extends Car{
    int liczbaDrzwi;
    int cena;
    CarPlus(String marka, String model,int przebieg, int liczbaDrzwi, int cena){
        super(marka, model, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.cena = cena;
    }
    public void wyswietlInfo(){
        super.wyswietlInfo();
        System.out.println(this.liczbaDrzwi + " " + this.cena);
    }


}
