package home_work_5.source.HomeWork1;

import home_work_5.source.HomeWork1.api.ICommunicationPrinter;

import java.util.Objects;

public class Task5_If implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        if (Objects.equals(name,"Вася")){
            return "Привет!\nЯ тебя так долго ждал";
        }
        if (Objects.equals(name,"Анастасия")){
            return "Я тебя так долго ждал";
        }
        return "Добрый день, а Вы кто?";
    }
}

