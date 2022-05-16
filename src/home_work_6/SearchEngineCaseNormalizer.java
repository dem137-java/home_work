package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.Locale;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.searchEngine = iSearchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch){
            return searchEngine.search(text, word);
        } else {
            return searchEngine.search(text.toLowerCase(Locale.ROOT),word.toLowerCase(Locale.ROOT));
        }
    }

    @Override
    public long searchAtFile(String filePath, String word) {
        return searchEngine.searchAtFile(filePath, word.toLowerCase(Locale.ROOT));
    }
}
