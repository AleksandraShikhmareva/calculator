import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UnitTests {
    private Calculator calculator;

    @BeforeClass
    public void initTest() {
        calculator = new Calculator();
    }

    @AfterClass
    public void afterTest() {
        calculator = null;
    }

   @Test
   public void testGetSum() throws Exception {
    Assert.assertEquals(15, calculator.getSum(7,8));
   }
}
