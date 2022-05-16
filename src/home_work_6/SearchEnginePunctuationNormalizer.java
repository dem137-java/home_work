package home_work_6;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine{
    ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    @Override
    public long search(String text, String word) {
        return searchEngine.search(text,word);
    }

    @Override
    public long searchAtFile(String filePath, String word) {
        return searchEngine.searchAtFile(filePath,word);
    }


}
