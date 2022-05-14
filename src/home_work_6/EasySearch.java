package home_work_6;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count = 0;
        int startIndex = text.indexOf(word);
        while (startIndex >= 0) {
            count++;
            startIndex = text.indexOf(word, startIndex + 1);
        }
        return count;
    }
}
