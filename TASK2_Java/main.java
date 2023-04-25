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


        // изменение веса игрушек
        store.updateToyWeight(1, 70);
        store.updateToyWeight(2, 60);
        store.updateToyWeight(3, 50);
        store.updateToyWeight(4, 40);
        store.updateToyWeight(5, 30);
        store.updateToyWeight(6, 20);
        store.updateToyWeight(7, 10);


        // организация розыгрыша и получение призовых игрушек
        List<Toy> prizeToys = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
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
