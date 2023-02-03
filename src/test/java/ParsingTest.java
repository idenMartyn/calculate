import org.example.Parsing;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParsingTest {
    private final String data;
    public ParsingTest(String data){
        this.data = data;
    }
    @Parameterized.Parameters
    public static String[] getData() {
        return new String[]{
            "5 + 10 ",
            " 2 - 1",
                "9 / 8",
                " 7 * 7 "
        };
    }

    @Test
    public void parseStringTest(){
       String[] actual = Parsing.parseString(data);
       Assert.assertEquals("Ожидаем массив с длинной 3 элемента", 3, actual.length);
    }

}
