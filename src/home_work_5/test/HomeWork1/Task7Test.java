package home_work_5.test.HomeWork1;

import home_work_5.source.HomeWork1.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    public void toBinaryString() {
        Assertions.assertEquals("00000001", Task7.toBinaryString((byte) 1));
        Assertions.assertEquals("00001010", Task7.toBinaryString((byte) 10));
        Assertions.assertEquals("11111111", Task7.toBinaryString((byte) -1));
        Assertions.assertEquals("11110110", Task7.toBinaryString((byte) -10));
    }
}
