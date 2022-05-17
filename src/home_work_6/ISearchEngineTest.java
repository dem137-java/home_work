package home_work_6;

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


}
