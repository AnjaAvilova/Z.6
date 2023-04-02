import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalcServiceTest {

    @Test
    public void testHolliday3Month() {
        CalcServise service = new CalcServise();
        int income = 10_000;
        int expenses=3_000;
        int threshold = 20000;



        int actual = service.calculate(income, expenses, threshold);
        int expended = 3;

        Assertions.assertEquals(expended, actual);
    }

    @Test
    public void testHolliday2Month() {
        CalcServise service = new CalcServise();
        int income = 100_000;
        int expenses=60_000;
        int threshold = 150_000;



        int actual = service.calculate(income, expenses, threshold);
        int expended = 2;

        Assertions.assertEquals(expended, actual);
    }
}
