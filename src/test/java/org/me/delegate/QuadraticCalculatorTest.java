package org.me.delegate;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class QuadraticCalculatorTest {

    private QuadraticSolver solver;
    private QuadraticCalculator cut;


    @Test
    public void testInstanceCreation() throws Exception{
        cut = new QuadraticCalculator(solver);
        assertThat(cut).isNotNull();
    }

}