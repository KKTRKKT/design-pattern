package me.kktrkkt.designpattern.decorator;

import java.util.List;

public class Client {

    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public List<String> readCommentList() {
        return commentService.getCommentList();
    }
}
