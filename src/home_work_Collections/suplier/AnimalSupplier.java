package home_work_Collections.suplier;

import home_work_Collections.dto.Animal;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class AnimalSupplier implements Supplier <Animal> {
    private final String[] nicks = {"Шарик", "Тузик", "Феликс", "Барсик", "Доллар", "Индекс", "Мистер Собака", "Джавистер",
            "Перец", "Лариска", "Джимми", "Соня", "Клеопатра", "Цунами", "Забияка", "Матильда", "Кнопка", "Масяня", "Царапка",
            "Серсея", "Ворсинка", "Амели", "Наоми", "Маркиза", "Изольда", "Гарфилд", "Том", "Гудвин", "Рокки", "Ленивец",
            "Пушок", "Спорти", "Бегемот", "Пират", "Гудини", "Зорро", "Саймон", "Альбус", "Базилио", "Леопольд", "Нарцисс",
            "Атос", "Каспер", "Валли"};

    @Override
    public Animal get() {
        String nick = nicks[new Random().nextInt(nicks.length)];
        int age = ThreadLocalRandom.current().nextInt(1,15);
        int idLength = ThreadLocalRandom.current().nextInt(5,10);
        return new Animal(nick,age);
    }


}
