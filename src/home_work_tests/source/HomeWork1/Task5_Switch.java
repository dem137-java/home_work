package home_work_tests.source.HomeWork1;

import home_work_tests.source.HomeWork1.api.ICommunicationPrinter;

public class Task5_Switch implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        switch (name){
            case "Вася": return "Привет!\nЯ тебя так долго ждал";
            case "Анастасия": return "Я тебя так долго ждал";
            default: return "Добрый день, а Вы кто?";
        }
    }
}

