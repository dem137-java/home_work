package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.Locale;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine iSearchEngine) {
        this.searchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch){
            return searchEngine.search(text, word);

        }
    }

    @Override
    public long searchAtFile(String filePath, String word) {
        return searchEngine.searchAtFile(filePath, word);
    }
}
