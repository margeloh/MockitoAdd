import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
public class MathApplicationTester {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Test
    public void testAddAndSubstract(){
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalcService(calcService);

        when(calcService.add(5.0,4.0)).thenReturn(9.0);
        when(calcService.subtract(5.0,4.0)).thenReturn(1.0);

        Assert.assertEquals(mathApplication.subtract(5.0,4.0),1.0, 0);
        Assert.assertEquals(mathApplication.add(5.0,4.0),9.0, 0);

        verify(calcService).add(5.0, 4.0);
        verify(calcService).subtract(5.0, 4.0);
    }
}
