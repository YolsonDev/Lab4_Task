package Zadanie9i10i11;

import java.util.Arrays;
import java.util.Comparator;

public class TablicaObiektow {
    public static void main(String[] args) {
        Object[] tablica = new Object[3];

        tablica[0] = new Object("Sebastian");
        tablica[1] = new Object("Natalia");
        tablica[2] = new Object("Dorian");

        System.out.println("Wypisanie tablicy obiektów: ");
        for(int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        System.out.println("Wypisanie wartości tablicy obiektów: ");
        for(int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i].imie);
        }

        //Szukanie elementu
        String szukana = "Natalia";
        for(int i = 0; i < tablica.length; i++) {
            if (tablica[i].imie.equals(szukana)) {
                System.out.println("Szukasz " + szukana + " jest na " + i + " elemencie tablicy");
                break;
            }
        }
        // Sortowanie tablicy obiektów
        Arrays.sort(tablica, Comparator.comparing(Object::getImie));
        System.out.println("Wypisanie tablicy obiektów po posortowaniu: ");
        for(int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i].imie);
        }
    }
}
