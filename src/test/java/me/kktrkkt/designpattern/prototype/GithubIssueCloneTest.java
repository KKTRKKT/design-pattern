package me.kktrkkt.designpattern.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GithubIssueCloneTest {

    @Test
    public void clone_test() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("kktrkkt");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        GithubIssue clone = (GithubIssue) githubIssue.clone();

        assertTrue(clone != githubIssue);
        assertEquals(githubIssue, clone);
        assertEquals(githubIssue.getClass(), clone.getClass());
    }

}