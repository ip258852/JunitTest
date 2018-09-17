package com.kobe.test1;

import org.junit.*;

public class Test1 {

    @After
    public void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterclass(){
        System.out.println("afterclass");
    }

    @Before
    public void before(){
        System.out.println("befored");
    }

    @BeforeClass
    public static   void  beforeclass(){
        System.out.println("berfore calss");
    }

    @Test
    public void case1(){
        System.out.println("hello wolrd");
    }

    @Test
    public void case2(){
        System.out.println("hello world2");
    }
}
