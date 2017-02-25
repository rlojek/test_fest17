package org.me;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class FibbTest {

    @Parameters(name = "{index}: fib({0}={1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
            { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
        });
    }

    @Parameter
    public int n;

    @Parameter(value = 1)
    public long value;

    @Test
    public void testFibonacciValues() throws Exception{
        Long result = Fibb.fib(n);
        assertThat(result).isEqualTo(value);
    }
}