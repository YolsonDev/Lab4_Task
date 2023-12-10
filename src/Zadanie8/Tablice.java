package Zadanie8;

public class Tablice {
    public static void main(String[] args) {
        int[] tablica = {3, 4, 5, 6, 7};

        tablica[1] = 9;

        for (int index : tablica) {
            System.out.print(index + " ");
        }
    }
}
