package Zadanie13;

public class TestCar {
    public static void main(String[] args) {
    Car car1 = new Car("Ford", "Mustang", 60000);
    Car car2 = new Car("Mercedes", "A200", 50000);
    Car car3 = new Car("VW", "Golf", 125000);

    Car[] tablica = new Car[3];
        tablica[0] = new Car("Seat","Ibiza", 60000);
        tablica[1] = new Car("Skoda", "Monster", 90000);
        tablica[2] = new Car("Dacia", "Szybka", 70000);
        for(int i = 0; i < tablica.length; i++){
            tablica[i].wyswietlInfo();
        }
    }
}
