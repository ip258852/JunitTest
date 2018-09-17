package com.kobe.test4;


import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.SoftAssertions;

public final class IssueAssert extends AbstractAssert<IssueAssert,Issue>{
    private IssueAssert(Issue issue) {
        super(issue,IssueAssert.class);
    }

    public static IssueAssert assertThatIssue(Issue issue){
        return new IssueAssert(issue);
    }

    public IssueAssert isIssueDone(){
        SoftAssertions assertions = new SoftAssertions();

        assertions.assertThat(actual.getActiveState())
                .overridingErrorMessage(
                        "已解決的問題的活動狀態必需是已完成的(DONE), 但是為: %s",
                        actual.getActiveState()
                )
                .isEqualTo(ActiveState.DONE);

        assertions.assertThat(actual.getLog())
                .overridingErrorMessage(
                        "已解決的問題的必需要有紀錄內容，但是它的紀錄內容: %s",
                        actual.getLog()
                )
                .isNotNull();

        assertions.assertAll();
        return this;
    }
}
