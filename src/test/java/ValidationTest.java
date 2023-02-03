import org.example.Validation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidationTest {
    private final String[] dataArr;
    public ValidationTest(String[] dataArr){
        this.dataArr = dataArr;
    }
    @Parameterized.Parameters
    public static String[][] getData() {
        return new String[][] {
                {"2", "+", "3"},
                {"2.1", "-", "3"},
                {"2", "/", "3.1"},
                {"2.1", "*", "3.1"},
                {"2.1", "*", "3.1", "-", "4"}
        };
    }

    @Test
    public void validExpressionTest(){
        Boolean actual = Validation.validExpression(dataArr);
        Assert.assertFalse(actual);
    }
}
