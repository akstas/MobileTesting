import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber()
    {
        int expectedValue = 15;
        int actualValue = MainClass.getLocalNumber();
        String errStr = "Ожидаемое значение %s не равно фактическому %s ";
        Assert.assertTrue(String.format(errStr, expectedValue, actualValue),expectedValue == actualValue);
    }
}