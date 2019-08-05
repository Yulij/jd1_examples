package jUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class jUnitTest {

    Integer arg;

    @Before
    public void init() {
        arg = Integer.valueOf("10");
        System.out.println("In Init block");
    }

    @Test
    public void divideTest() {
        Assert.assertNotNull(arg);
        assertEquals("Result must be double", Double.valueOf(2.5), Divider.divide(5, 2));
        Assert.assertNull(Divider.divide(5, 0));
        assertEquals("Result must be double", Double.valueOf(5.0), Divider.divide(25, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideNullFirstArgumentTest() {
        Divider.divide(null, 2);
    }
}