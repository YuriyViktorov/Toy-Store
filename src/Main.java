import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ToyStore store = new ToyStore();

        // добавьте несколько игрушек
        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);
        store.addToy(4, "Toy 4", 15, 60);
        store.addToy(5, "Toy 5", 35, 50);
        store.addToy(6, "Toy 6", 65, 40);
        store.addToy(7, "Toy 7", 25, 75);

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
