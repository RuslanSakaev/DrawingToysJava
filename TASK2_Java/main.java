import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        // добавление новых игрушек
        store.addToy(new Toy(1, "Мяч", 10, 30));
        store.addToy(new Toy(2, "Кукла", 5, 20));
        store.addToy(new Toy(3, "Машинка", 15, 50));
        store.addToy(new Toy(4, "Электромобиль", 5, 10));
        store.addToy(new Toy(5, "Интерактивная игра", 7, 7));
        store.addToy(new Toy(6, "Конструктор", 10, 10));
        store.addToy(new Toy(7, "Домик", 8, 5));
        store.addToy(new Toy(8, "Мягкая игрушка", 12, 15));
        store.addToy(new Toy(9, "Настольная игра", 8, 7));
        store.addToy(new Toy(10, "Игрушечное оружие", 4, 3));

        // изменение веса игрушек
        store.updateToyWeight(1, 40);
        store.updateToyWeight(2, 30);
        store.updateToyWeight(3, 20);
        store.updateToyWeight(4, 10);
        store.updateToyWeight(5, 50);
        store.updateToyWeight(6, 40);
        store.updateToyWeight(7, 30);
        store.updateToyWeight(8, 20);
        store.updateToyWeight(9, 10);
        store.updateToyWeight(10, 60);

        // организация розыгрыша и получение призовых игрушек
        List<Toy> prizeToys = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Toy prizeToy = store.getPrizeToy();
            if (prizeToy != null) {
                prizeToys.add(prizeToy);
            }
        }

        // вывод списка призовых игрушек
        System.out.println("\nСписок призовых игрушек: \n");
        for (Toy toy : prizeToys) {
            System.out.println(toy.getName());
        }
    }
}
