import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // добавление новых игрушек
        store.addToy(new Toy(1, "Мяч", 10, 30));
        store.addToy(new Toy(2, "Кукла", 5, 20));
        store.addToy(new Toy(3, "Машинка", 15, 50));

        // изменение веса игрушек
        store.updateToyWeight(1, 40);
        store.updateToyWeight(2, 30);
        store.updateToyWeight(3, 30);

        // организация розыгрыша и получение призовых игрушек
        List<Toy> prizeToys = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Toy prizeToy = store.getPrizeToy();
            if (prizeToy != null) {
                prizeToys.add(prizeToy);
            }
        }

        // вывод списка призовых игрушек
        System.out.println("Список призовых игрушек:");
        for (Toy toy : prizeToys) {
            System.out.println(toy.getName());
        }
    }
}
