package com.kobe.test6;

public class IssueBuilder {
    private Long id; // issue單號
    private String title; // 標題
    private String desc; // 內容描述
    private Creator creator; // 建立人
    private Assignee assignee; // 負責人
    private Closer closer; // 結案人
    private State state; // 狀態TODO, IN_PROGRESS, DONE
    private Result result; // 結案形式RESOLVED, REJECT

    //region builder
    public IssueBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public IssueBuilder title(String title) {
        this.title = title;
        return this;
    }

    public IssueBuilder desc(String desc) {
        this.desc = desc;
        return this;
    }

    public IssueBuilder creatorNum(Long creatorNum) {
        this.creator = new Creator(creatorNum);
        return this;
    }

    public IssueBuilder assigneeNum(Long assigneeNum) {
        this.assignee = new Assignee(assigneeNum);
        return this;
    }
    //endregion

    //region withMethod

    public IssueBuilder withStateTodo() {
        this.state = State.TODO;
        return this;
    }

    public IssueBuilder withStateInProgress() {
        this.state = State.IN_PROGRESS;
        return this;
    }

    public IssueBuilder withResultResolved(Long closerNum) {
        this.closer = new Closer(closerNum);
        this.state = State.DONE;
        this.result = Result.RESOLVED;
        return this;
    }

    public IssueBuilder withResultReject(Long closerNum) {
        this.closer = new Closer(closerNum);
        this.state = State.DONE;
        this.result = Result.REJECT;
        return this;
    }
    //endregion

    Issue build(){
        Issue issue = new Issue();
        issue.setId(id);
        issue.setTitle(title);
        issue.setDesc(desc);
        issue.setCreator(creator);
        issue.setAssignee(assignee);
        issue.setCloser(closer);
        issue.setState(state);
        issue.setResult(result);
        return issue;
    }

}
