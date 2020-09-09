import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber()
    {
        int expectedValue = 45;
        MainClass mainClass = new MainClass();
        int actualValue = mainClass.getClassNumber();
        String errStr = "Ожидаемое значение %s больше фактического %s ";
        Assert.assertTrue(String.format(errStr, expectedValue, actualValue), actualValue > expectedValue);
    }
}