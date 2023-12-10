package Zadanie5;

import java.util.Arrays;
import java.util.Random;

public class TablicaHistogram {
    public static void main(String[] args) {
        Random generator = new Random();
        int[][] tabela = new int[10][10];
        // Wyświetlanie tablicy
        for(int i = 0; i < 10; i++){
            for(int j = 0; j <10; j++){
                tabela[i][j] = generator.nextInt(45 - 20 +1) + 20;
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println();
        }
        // Sortowanie Tablicy
        Arrays.sort(tabela[0]);
        Arrays.sort(tabela[1]);
        Arrays.sort(tabela[2]);
        System.out.println("Tablica posortowana: ");
        // Wyświetlanie posrtowanej tablicy
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println();
        }
        //Histogram
        int[] histogram = new int[46 - 20 + 1];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                histogram[tabela[i][j] - 20]++;
            }
        }

        System.out.println("Histogram:");
        for(int i = 20; i <=45; i++){
            System.out.println(i + ": " + histogram[i-20] +" wystąpień");
        }
    }
}
