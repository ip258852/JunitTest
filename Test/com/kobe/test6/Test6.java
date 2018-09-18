package com.kobe.test6;

import org.junit.Test;

public class Test6 {
    private static final Long ID = 1L;
    private static final Long CREATOR_NUM = 5L;
    private static final Long ASSIGNEE_NUM = 10L;
    private static final Long CLOSER_NUM = 15L;

    private static final String TITLE = "this title";
    private static final String DESC = "this desc";

    @Test
    public void case1(){
        Issue issue = new IssueBuilder().id(ID).title(TITLE).desc(DESC).creatorNum(CREATOR_NUM).withStateTodo().build();
    }

    @Test
    public void case2(){
        Issue issue = new IssueBuilder()
                .id(ID)
                .title(TITLE)
                .desc(DESC)
                .creatorNum(CREATOR_NUM)
                .assigneeNum(ASSIGNEE_NUM)
                .withStateTodo()
                .build();
    }

    @Test
    public void case3(){

    }
}
