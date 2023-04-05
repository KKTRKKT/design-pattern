package me.kktrkkt.designpattern.decorator;

import java.util.List;

public abstract class CommentServiceDecorator implements CommentService{

    protected final CommentService commentService;

    public CommentServiceDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public final List<String> getCommentList() {
        return commentService.getCommentList();
    }
}
