package com.kobe.test3;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class Test3 {
    @Test
    public void case1(){
        SoftAssertions soft = new SoftAssertions();

        //Arrange
        int act1 = 6;
        String act2 = "10";

        //Assert
        soft.assertThat(act1).isEqualTo(9);
        soft.assertThat(act2).isEqualTo("105");
        soft.assertAll();
    }
}
