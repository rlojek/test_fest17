package org.me;

import cucumber.api.java8.En;

import static org.assertj.core.api.Assertions.assertThat;

public class FibbStepDefs implements En {

    int number;

    public FibbStepDefs(){
        Given("^number is (\\d+)$", (Integer num) ->{
            number = num;
        });

        Given("^value is (\\d+)$", (Long val) ->{
            assertThat(Fibb.fib(number)).isEqualTo(val);
        });
    }
}
