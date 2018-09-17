package com.kobe.test4;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static com.kobe.test4.IssueAssert.assertThatIssue;

public class Test4 {
    @Test
    public void case1(){
        Issue issue = new Issue();
        issue.setId(1L);
        issue.setActiveState(ActiveState.DONE);
        issue.setCreator("kobe");

        SoftAssertions assertions = new SoftAssertions();

        assertions.assertThat(issue.getActiveState())
                .overridingErrorMessage(
                        "已解決的問題的活動狀態必需是已完成的(DONE), 但是為: %s",
                        issue.getActiveState()
                )
                .isEqualTo(ActiveState.DONE);

        assertions.assertThat(issue.getLog())
                .overridingErrorMessage(
                        "已解決的問題的必需要有紀錄內容，但是它的紀錄內容: %s",
                        issue.getLog()
                )
                .isNotNull();

        assertions.assertAll();
    }

    @Test
    public void case2(){
        Issue issue = new Issue();
        issue.setId(2L);
        issue.setActiveState(ActiveState.DONE);
        issue.setCreator("Kobe");
        issue.setLog("everything is ok.");

        assertThatIssue(issue).isIssueDone();
    }
}
