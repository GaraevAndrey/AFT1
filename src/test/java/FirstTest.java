import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTest {
    //Кратно 3, возвращать 'T'
    //Кратно 5, возвращать 'M'
    //Кратно 3 и 5, возвращать 'EMC'
    //Возвращать 'FAIL'

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "EMC";
        } else if (number % 5 == 0) {
            return "M";
        } else if (number % 3 == 0) {
            return "T";
        } else return "FAIL";
    }

    @Test
    public void tmcTest() {
        String actualResult = trialCode(9);
        assertEquals(actualResult, "T");
    }

    @Test
    public void tmc2Test() {
        String actualResult = trialCode(25);
        assertEquals (actualResult, "M");
    }

    @Test
    public void tmc3Test() {
        String actualResult = trialCode(15);
        assertEquals (actualResult, "EMC");
    }

}
