package home_work_6.decorators;

import home_work_6.api.ISearchEngine;

import java.util.Locale;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.searchEngine = iSearchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    @Override
    public long search(String text, String word) {
            return searchEngine.search(text.toLowerCase(Locale.ROOT),word.toLowerCase(Locale.ROOT));
    }
}
