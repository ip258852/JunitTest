package com.kobe.test7;

import org.junit.Test;

public class Test7 {
    @Test
    public void case1(){
        //先用IssueBuilder建立相關資訊,接著Build預設的資訊
        //最後使用反射將三個參數(closer,state,result)映射進去.
        Issue issue = new IssueBuilder().withStateTodo().build();
        Issue issue1 = new IssueBuilder().id(123L).withResultResolved(1L).build();
    }
}
