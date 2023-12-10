package Zadanie13;

public class Car {
    String marka;
    String model;
    int przebieg;
    Car(){    }
    Car(String marka, String model, int przebieg){
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
    }
    public void wyswietlInfo(){
        System.out.println(this.marka + " " + this.model + " " + this.przebieg);
    }
}
