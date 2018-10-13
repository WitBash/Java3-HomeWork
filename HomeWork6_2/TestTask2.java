package HomeWork6_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestTask2 {
    @Parameterized.Parameters
    public static Collection<int[][]> data() {
        return Arrays.asList(new int[][][]{
                {{3, 5, 8}, {2, 3, 4, 5, 1, 4, 3, 5, 8}},
                {{1, 3, 5, 8}, {2, 3, 4, 5, 4, 1, 3, 5, 8}},
                {{8}, {2, 3, 4, 5, 1, 4, 3, 4, 8}},
                {{5, 8},{2, 3, 4, 5, 1, 4, 4, 5, 8}},
        });
    }

    @Parameterized.Parameter()
    public int[] a;

    @Parameterized.Parameter(1)
    public int[] b;

    Task2 task2;

    @Before
    public void init() {
        task2 = new Task2();
    }

    @Test
    public void massTestCutArray() {
        Assert.assertArrayEquals(a, task2.cutArray(b));
    }
}

