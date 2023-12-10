package Zadanie6i7;

import java.util.Objects;

public class Car implements Cloneable {
    String model;
    String marka;
    int rocznik;
    Car(String model, String marka, int rocznik){
        this.model = model;
        this.marka = marka;
        this.rocznik = rocznik;
    }
    public void wyswietlInfo(){
        System.out.println(this.model + " " +
                        this.marka + " " +
                        this.rocznik);
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Car otherCar = (Car) obj;
        return this.rocznik == otherCar.rocznik &&
                Objects.equals(this.marka, otherCar.marka) &&
                Objects.equals(this.model, otherCar.model);
    }

}
