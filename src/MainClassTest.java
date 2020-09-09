import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClassTest {
    @Test
    public void testGetClassString()
    {
        MainClass mainClass = new MainClass();
        String actualValue = mainClass.getClassString();
        String errStr = "Полученная срока не содержит текст hello или Hello  ";
        Assert.assertTrue(errStr,actualValue.toLowerCase().contains("hello"));
    }
}