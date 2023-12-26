import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ToyStore {

    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(int id, String name, int quantity, double weight) {
        Toy toy = new Toy(id, name, quantity, weight);
        toys.add(toy);
    }

    public void setToyWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public void play() {
        // рассчитать общий вес
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        // сгенерировать случайное число
        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalWeight;

        // найди призовую игрушку
        Toy prizeToy = null;
        for (Toy toy : toys) {
            if (randomNumber < toy.getWeight()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getWeight();
        }

        // добавьте призовую игрушку в список призовых игрушек
        if (prizeToy != null && prizeToy.getQuantity() > 0) {
            prizeToys.add(prizeToy);

            // уменьшите количество призовой игрушки
            prizeToy.setQuantity(prizeToy.getQuantity() - 1);
        }
    }

    public void getPrizeToy() throws IOException {
        if (prizeToys.size() > 0) {
            // remove the first prize toy from the list of prize toys
            Toy prizeToy = prizeToys.remove(0);

            // запишите призовую игрушку в файл
            FileWriter writer = new FileWriter("prize_toys.txt", true);
            System.out.println("Вы получаете призовую игрушку: " + prizeToy.getName());
            writer.write(prizeToy.getId() + ", " + prizeToy.getName() + "\n");
            writer.close();
        }
    }
}
