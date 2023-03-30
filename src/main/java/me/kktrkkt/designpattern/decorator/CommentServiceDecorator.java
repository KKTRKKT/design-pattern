package me.kktrkkt.designpattern.decorator;

import java.util.List;

public class CommentServiceDecorator implements CommentService{

    protected final CommentService commentService;

    public CommentServiceDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }

    @Override
    public List<String> getCommentList() {
        return commentService.getCommentList();
    }
}
