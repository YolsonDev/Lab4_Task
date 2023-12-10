package Zadanie6i7;

public class KlasaObject {
    public static void main(String[] args) throws CloneNotSupportedException  {
        Car car = new Car("Ford", "Mustang", 2016);
        // Testowanie clone()
        System.out.println("Tesowanie clone(): ");
        Car copyCar = (Car) car.clone();
        car.wyswietlInfo();
        copyCar.wyswietlInfo();
        // Testowanie equals()
        System.out.println("Testowanie equalas(): " + car.equals(copyCar));


    }
}
