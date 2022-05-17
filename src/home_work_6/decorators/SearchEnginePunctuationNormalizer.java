package home_work_6.decorators;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine{
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public ISearchEngine getSearchEngine() {
        return searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text=textEdit(text);
        return searchEngine.search(text,word);
    }

    private String textEdit(String text){
        text = text.replaceAll("[\\p{Punct}&&[^-]]+|-{2,}|\n|\t"," ");
        return text.replaceAll("\\s{2,}", " ");
    }
}
