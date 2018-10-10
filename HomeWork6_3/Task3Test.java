package HomeWork6_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task3Test {
    Task3 task3;

    @Before
    public void init() {
        task3 = new Task3();
    }

    @Test
    public void TestCheckArray1() {
        int array[] = {3, 5, 6};
        Assert.assertEquals(false, task3.checkArray(array));
    }
    @Test
    public void TestCheckArray2() {
        int array[] = {1, 4, 1};
        Assert.assertEquals(true, task3.checkArray(array));
    }
    @Test
    public void TestCheckArray3() {
        int array[] = {4, 5, 6};
        Assert.assertEquals(true, task3.checkArray(array));
    }
    @Test
    public void TestCheckArray4() {
        int array[] = {8, 5, 9};
        Assert.assertEquals(false, task3.checkArray(array));
    }
}