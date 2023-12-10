package Zadanie12.testowanie;

import Zadanie12.myapp.MyCharacter;

public class TestCharacter {
    public static void main(String[] args) {
        MyCharacter myCharacter = new MyCharacter("Yolson", "Wojownik","Body", 99);
        System.out.println("Informacje o postaci:");
        System.out.println("Nickname: " + myCharacter.imie);
        System.out.println("Klasa postaci: " + myCharacter.klasaPostaci);
        System.out.println("Rasa: " + myCharacter.rasa);
        System.out.println("Ilość siły: " + myCharacter.sila);
    }
}
