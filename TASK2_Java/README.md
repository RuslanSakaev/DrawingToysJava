# Задание 2. Магазин игрушек (Java)

#### Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.


-----

*К написанию программы можно подойти более творчески и делать так, как Вы поняли задание. Немного менять и отходить от примера выше.*

-----

### В программе должны быть описаны сущности игрушки, класс со следующими свойствами:
- id игрушки,
- текстовое название,
- количество
- частота выпадения игрушки (вес в % от 100)
- Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
- Возможность организовать розыгрыш игрушек.
- С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.
- Это список призовых игрушек, которые ожидают выдачи.
- Еще у нас должен быть метод – получения призовой игрушки.
- После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. 
- А эту игрушку записываем в текстовый файл.
- Не забываем уменьшить количество игрушек

# Решение
Для реализации программы розыгрыша игрушек в магазине детских товаров, создадим **классы**:

- "Toy" (игрушка), который будет содержать свойства "id", "название", "количество" и "вес в %"; 
- "ToyStore" (магазин игрушек), который будет содержать список игрушек и методы для добавления новых игрушек, изменения веса игрушки, организации розыгрыша и получения призовой игрушки;
- "Main", который создает объект "ToyStore", добавляет игрушки, изменяет вес игрушек, организует розыгрыш и выводит список призовых игрушек.
