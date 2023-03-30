package me.kktrkkt.designpattern.decorator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    public void comment_test() {
        List<String> commentList = getCommentList(new CommentService());

        assertAll(
                () -> assertTrue(commentList.contains("오징어게임")),
                () -> assertTrue(commentList.contains("보는게 하는거 보다 재밌을 수가 없지...")),
                () -> assertTrue(commentList.contains("http://kktrkkt.github.io"))
        );
    }

    @Test
    public void spam_filtering_test() {
        List<String> commentList = getCommentList(new SpamFilteringCommentService());

        assertAll(
                () -> assertTrue(commentList.contains("오징어게임")),
                () -> assertTrue(commentList.contains("보는게 하는거 보다 재밌을 수가 없지..."))
        );
    }

    @Test
    public void trimming_test() {
        List<String> commentList = getCommentList(new TrimmingCommentService());

        assertAll(
                () -> assertTrue(commentList.contains("오징어게임")),
                () -> assertTrue(commentList.contains("보는게 하는거 보다 재밌을 수가 없지")),
                () -> assertTrue(commentList.contains("http://kktrkkt.github.io"))
        );
    }

    private List<String> getCommentList(CommentService commentService) {
        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://kktrkkt.github.io");

        List<String> commentList = client.readCommentList();
        return commentList;
    }
}
