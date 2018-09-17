package com.kobe.test2;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Test2 {
    @Test
    public void case1(){
        //Arrange
        Instence2 ins = new Instence2();
        int numberA = 5;
        int numberB = 10;
        int excepted = 15;

        // act
        int actual = ins.add(numberA,numberB);

        // Assert
        assertThat(actual).isEqualTo(excepted);

    }
}
