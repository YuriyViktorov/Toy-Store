import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();

        // добавьте несколько игрушек
        store.addToy(1, "Constructor", 10, 20);
        store.addToy(2, "Doll", 5, 10);
        store.addToy(3, "Robot", 20, 70);
        store.addToy(4, "Plane", 15, 60);
        store.addToy(5, "Ball", 35, 50);
        store.addToy(6, "Toy car", 65, 40);
        store.addToy(7, "Boat", 25, 75);

        // установите вес игрушки
//        store.setToyWeight(2, 30);

        // играй в эту игру
        store.play();

        // получи призовую игрушку
        try {
            store.getPrizeToy();
        } finally {

        }
    }
}
