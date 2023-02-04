/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package helloworldapptwo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author yank
 */
@RunWith(Parameterized.class)
public class CustomMathTest {
    int x, y, expectedSum;
    
    public CustomMathTest(int x, int y, int expectedSum) {
        this.x = x;
        this.y = y;
        this.expectedSum = expectedSum;
    }
   
    @Test
    public void testSum() {
        System.out.println("sum");
        int result = CustomMath.sum(x, y);
        assertEquals(expectedSum, result);
    }
    
    @Test
    public void testDivision() {
        System.out.println("division");
        
        try{
            int result = CustomMath.division(x, y);
            if (y == 0) {
                fail("Division by zero does not throw Execption");
            }
            assertEquals(expectedSum, result);
        } catch (ArithmeticException e) { }
    }

    @Ignore("Not running")
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CustomMath.main(args);
    }
    
    @Parameters
    public static Collection sumValues() {
        Object[][] values = {{1,1,2}, {-1,1,0}, {15,10,25}};
        return Arrays.asList(values);
    }
    
    @Parameters
    public static Collection divisionValues() {
        Object[][] values = {{5, 0, 0}, {25, 5, 5}, {0, 4, 0}};
        return Arrays.asList(values);
    }
}