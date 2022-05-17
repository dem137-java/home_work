package home_work_6.tests;

import home_work_6.api.ISearchEngine;
import home_work_6.decorators.SearchEngineCaseNormalizer;
import home_work_6.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.search_engines.EasySearch;
import home_work_6.search_engines.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISearchEngineTest {

    @Test
    public void EasySearchTest(){
        EasySearch easySearch = new EasySearch();
        Assertions.assertEquals(1,easySearch.search("привет, как дела!","как"));
        Assertions.assertEquals(0,easySearch.search("привет,какдела!","как"));
        Assertions.assertEquals(0,easySearch.search("привет;какдела!","как"));
        Assertions.assertEquals(1,easySearch.search("как дела!.Что делаешь?","как"));
        Assertions.assertEquals(0,easySearch.search("Привет-привет","привет"));
        Assertions.assertEquals(0,easySearch.search("Привет -привет","привет"));
        Assertions.assertEquals(0,easySearch.search("бабушка бабушке бабушку","бабушк"));
        Assertions.assertEquals(1,easySearch.search("бабушка бабушке бабушку","бабушка"));
        Assertions.assertEquals(1,easySearch.search("как","как"));
        Assertions.assertEquals(1,easySearch.search("как акак какие-то как-то так...Как?","как"));
    }
    @Test
    public void RegExSearchTest(){
        RegExSearch regExSearch = new RegExSearch();
        Assertions.assertEquals(1,regExSearch.search("привет, как дела!","как"));
        Assertions.assertEquals(0,regExSearch.search("привет,какдела!","как"));
        Assertions.assertEquals(0,regExSearch.search("привет;какдела!","как"));
        Assertions.assertEquals(1,regExSearch.search("как дела!.Что делаешь?","как"));
        Assertions.assertEquals(0,regExSearch.search("Привет-привет","привет"));
        Assertions.assertEquals(0,regExSearch.search("Привет -привет","привет"));
        Assertions.assertEquals(0,regExSearch.search("бабушка бабушке бабушку","бабушк"));
        Assertions.assertEquals(1,regExSearch.search("бабушка бабушке бабушку","бабушка"));
        Assertions.assertEquals(1,regExSearch.search("как","как"));
        Assertions.assertEquals(1,regExSearch.search("как акак какие-то как-то так...Как?","как"));
    }
    @Test
    public void SearchEnginePunctuationNormalizerEasyTest(){
        ISearchEngine punctDecorator = new SearchEnginePunctuationNormalizer(new EasySearch());
        Assertions.assertEquals(1,punctDecorator.search("Аркадий Акакиевич,как, так?","как"));
        Assertions.assertEquals(1,punctDecorator.search("как акак какие-то как-то так...Как?","как"));
        Assertions.assertEquals(1,punctDecorator.search("было-бы хорошо, если бы,: не было так плохо","бы"));
        Assertions.assertEquals(1,punctDecorator.search("мыла, мама...раму..Мама","мама"));
        Assertions.assertEquals(1,punctDecorator.search("шла саша по...шоссе: Ленинградскому...","шоссе"));
    }
    @Test
    public void SearchEnginePunctuationNormalizerRegexTest(){
        ISearchEngine punctDecorator = new SearchEnginePunctuationNormalizer(new RegExSearch());
        Assertions.assertEquals(1,punctDecorator.search("Аркадий Акакиевич,как, так?","как"));
        Assertions.assertEquals(1,punctDecorator.search("как акак какие-то как-то так...Как?","как"));
        Assertions.assertEquals(1,punctDecorator.search("было-бы хорошо, если бы,: не было так плохо","бы"));
        Assertions.assertEquals(1,punctDecorator.search("мыла, мама...раму..Мама","мама"));
        Assertions.assertEquals(1,punctDecorator.search("шла саша по...шоссе: Ленинградскому...","шоссе"));
    }
    @Test
    public void SearchEngineCaseNormalizerEasyTest(){
        ISearchEngine punctDecorator = new SearchEngineCaseNormalizer(new EasySearch());
        Assertions.assertEquals(3,punctDecorator.search("Аркадий АРКА Аршин Ар ар АР","Ар"));
        Assertions.assertEquals(2,punctDecorator.search("кАк аКАК какие-то как-то так...Как?","КАК"));
        Assertions.assertEquals(1,punctDecorator.search("было-БЫ хорошо, если Бы, не было так плохо","БЫ"));
        Assertions.assertEquals(3,punctDecorator.search("мыла, МАМА...раму..Мама...мама","мАма"));
        Assertions.assertEquals(1,punctDecorator.search("шла саша по...шоссе: Ленинградскому...","Шоссе"));
    }
    @Test
    public void SearchEngineCaseNormalizerRegexTest(){
        ISearchEngine punctDecorator = new SearchEngineCaseNormalizer(new RegExSearch());
        Assertions.assertEquals(3,punctDecorator.search("Аркадий АРКА Аршин Ар ар АР","Ар"));
        Assertions.assertEquals(2,punctDecorator.search("кАк аКАК какие-то как-то так...Как?","КАК"));
        Assertions.assertEquals(1,punctDecorator.search("было-БЫ хорошо, если Бы, не было так плохо","БЫ"));
        Assertions.assertEquals(3,punctDecorator.search("мыла, МАМА...раму..Мама...мама","мАма"));
        Assertions.assertEquals(1,punctDecorator.search("шла саша по...шоссе: Ленинградскому...","Шоссе"));
    }
    @Test
    public void FullyDecoratedEasyTest(){
        ISearchEngine punctDecorator = new SearchEngineCaseNormalizer(new SearchEnginePunctuationNormalizer(new EasySearch()));
        Assertions.assertEquals(3,punctDecorator.search("Аркадий АРКА Аршин Ар?...ар, АР","Ар"));
        Assertions.assertEquals(2,punctDecorator.search("кАк:аКАК какие-то как-то так...Как?","КАК"));
        Assertions.assertEquals(1,punctDecorator.search("было-БЫ хорошо, если Бы...не было так плохо","БЫ"));
        Assertions.assertEquals(3,punctDecorator.search("мыла, МАМА...раму..Мама...мама","мАма"));
        Assertions.assertEquals(1,punctDecorator.search("шла саша по...шоссе: Ленинградскому...","Шоссе"));
    }
    @Test
    public void FullyDecoratedRegExTest(){
        ISearchEngine punctDecorator = new SearchEngineCaseNormalizer(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        Assertions.assertEquals(3,punctDecorator.search("Аркадий АРКА Аршин Ар?...ар, АР","Ар"));
        Assertions.assertEquals(2,punctDecorator.search("кАк:аКАК какие-то как-то так...Как?","КАК"));
        Assertions.assertEquals(1,punctDecorator.search("было-БЫ хорошо, если Бы...не было так плохо","БЫ"));
        Assertions.assertEquals(3,punctDecorator.search("мыла, МАМА...раму..Мама...мама","мАма"));
        Assertions.assertEquals(1,punctDecorator.search("шла саша по...шоссе: Ленинградскому...","Шоссе"));
    }







}
