package Zadanie3;

public class GarbageCollectorExample {
    public static void main(String[] args) {
        // Tworzenie i usuwanie obiektów
        for (int i = 0; i < 10000; i++) {
            new GarbageCollectorExample();
        }
        // Sugestia uruchomienia Garbage Collector'a
        System.gc();
    }
    // Przykładowy obiekt
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obiekt został usunięty");
    }
}
